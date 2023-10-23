package sendingMails;

import java.util.Properties;

public class MonitoringMail 
{
	Session session;
	Subject subject;

	public void sendMail(String mailServer,String from,String[] to,String subject,String messageBody,
			String attachmentPath,String attachementName)
	{
		boolean debug = false;
		
		Properties props = new Properties();
		
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.EnableSSL.enable", "true");
		props.put("mail.smtp.auth", "true");
		
		props.put("mail.smtp.host", mailServer);
		props.put("mail.debug", "true");
		
		props.setProperty("mail.smtp.socketFactory.class", attachementName);
		props.setProperty("mail.smtop.socket`factory.fallback", attachementName);
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socket.port", "465");
		
		Authenticator auth = new Authenticator();
		
		try {
			Transport bus = session.getTransport("smtp");
			bus.connect();
			
			Message message = new MimeMessage(session);
			
			message.addHeader("X-Priority", "1");
			message.setFrom(new InternetAddress(from));
			
			InternetAddress[] addressTo = new InternetAddress[to];
			
			for(int i=0;i<to.length;i++)
			{
				addressTo[i] = new InternetAddress(to[i]);
				
				message.setRecipient(javax.mail.Message.RecipientType.TO);
				
				message.setSubject(subject);
				
				BodyPart body = new MimeBodyPart();
				
				body.setContent(messageBody, "text/html");
				
				BodyPart attachment = new MimeBodyPart();
				
				DataSource source = new FileDataSource(attachmentPath);
				
				attachment.setDataHandler(new DataHandler(source));
				
				attachment.setFileName(attachementName);
				
				MimeMultiPart multiPart = new MimeMultiPart();
				
				multiPart.addBodyPart(body);
				multiPart.addBodyPart(attachment);
				message.setContent(multiPart);
				
				System.out.println("Successfully sent mail to All Users");
				
				bus.close();
			    }
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}
