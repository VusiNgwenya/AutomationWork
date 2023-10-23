package Java_EE;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import sendingMails.MessageBody;
import sendingMails.SMTPAuthenticator;


public class monitoringMail {
	
	public void sendMail(String mailServer, String from, String[] to,String subject, MessageBody messageBody, String attachmentPath,String attachmentName)
	{
		boolean debug = false;
		
		Properties props = new Properties();
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.EnableSSL.enable", "true");
		props.put("mail.smtp.auth", "true");
		
		props.put("mail.smtp.host", mailServer);
		props.put("mail.debug", "true");
		
		props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl");
		props.setProperty("mail.smtp.socketFactory.fallback", "false");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.port", "465");
		
	
		Authenticator auth = new SMTPAuthenticator();
		
		Session session = Session.getDefaultInstance(props, auth);
		
		session.setDebug(debug);
		
		try
		{
			Transport bus = session.getTransport("smtp");
			bus.connect();
			Message message = new MimeMessage(session);
			
			message.addHeader("X-Priority", "1");
			message.setFrom(new InternetAddress(from));
			
			InternetAddress[] addressTo = new InternetAddress[to.length];
			
			for(int i=0;i<to.length;i++)
			{
				addressTo[i] = new InternetAddress(to[i]);
				
				message.setRecipients(Message.RecipientType.TO,addressTo);
				message.setSubject(subject);
				
				BodyPart body = new MimeBodyPart();
				
				body.setContent(messageBody, "text/html");
				
				BodyPart attachment = new MimeBodyPart();
				DataSource source = new FileDataSource(attachmentPath);
				attachment.setDataHandler(new DataHandler(source));
				attachment.setFileName(attachmentName);
				MimeMultipart multipart = new MimeMultipart();
				multipart.addBodyPart(body);
				
			}
		}
		
	}

}
