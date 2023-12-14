package utilities;

import java.util.Properties;

import sendingMails.Authenticator;
import sendingMails.SMTPAuthenticator;
import sendingMails.Session;
import sendingMails.Transport;

public class MonitoringMail 
{

	public void sendMail(String mailServer,String from,String[] to,String subject,String messageBody,String attachmentPath,String attachmentName)
    {
	   boolean debug = false;
	   Properties props = new Properties();
	   props.put("mail.smtp.starttls.enable", "true");
	   props.put("mail.smtp.EnableSSL.enable", "true");
	   props.put("mail.smtp.auth", "true");
	   
	   props.put("mail.smtp.host", mailServer);
	   props.put("mail.debug", "true");
	   
	   props.setProperty("mail.smtp.socketFactory.class","javax");
	   props.setProperty("mail.smtp.socketFactory.fallback","javax");
	   props.setProperty("mail.smtp.port","465");
	   props.setProperty("mail.smtp.socketFactory.port","465");
	   
	   Authenticator auth = new SMTPAuthenticator();
	   Session session = Session.getDefaultInstance(props,auth);
	   
	   session.setDebug(debug);
	   
	   try
	   {
		   Transport bus = session.getTransport("smtp");
		   bus.connect();
		   
		   Message message = new MimeMessage(session);
		   
	   }
    }
}
