import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

//import org.apache.log4j.layout.*;
//import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.net.SMTPAppender;
import org.apache.log4j.spi.LoggingEvent;

import com.sun.mail.smtp.SMTPTransport;

public class SecureSMTPAppender extends SMTPAppender{

	/*protected Session session;
	public Layout layout;
	public String cb;
	
	public SecureSMTPAppender()
	{
		super();
	}
	
	public String getSMTPHost()
	{
		return "";
	}
	
	public String getSMTPPassword()
	{
		return "";
	}
	
	public String getSMTPUsername()
	{
		return "";
	}
	
	public boolean getSMTPDebug()
	{
		return true;
	}
	
	protected Session createSession()
	{
		Properties props = new Properties();
		props.put("mail.smtps.host", getSMTPHost());
		props.put("mail.smtps.auth", "true");
		
		Authenticator auth = null;
		
		if(getSMTPPassword() != null && getSMTPUsername() != null)
		{
			auth = new Authenticator()
			{
			
			     protected PasswordAuthentication getPasswordAuthentication()
			     {
				      return new PasswordAuthentication(getSMTPUsername(),getSMTPPassword());
			     }
			};
		}

		session = session.getInstance(props, auth);
		
		if(getSMTPDebug())
		{
			session.setDebug(getSMTPDebug());
		}
		
		return session;
		
	}
	
    protected void sendBuffer()
    {
    	try
    	{
    		MimeBodyPart part = new MimeBodyPart();
    		
    		StringBuffer sbuf = new StringBuffer();
    		
    		String t = layout.getHeader();
    		
    		if(t != null)
    		{
    			sbuf.append(t);
    			
    			int len = cb.length();
    			
    			for(int i=0;i<len;i++)
    			{
    				LoggingEvent event = cb.get();
    				sbuf.append(layout.format(event));
    				
    				if(layout.ignoresThrowable())
    				{
    					String[] s = event.getThroableStrRep();
    					
    					if(s != null)
    					{
    						for(int j=0;j<s.length;j++)
    						{
    							sbuf.append(s[j]);
    							sbuf.append(Layout.LINE_SEP);
    						}
    					}
    				}
    			}
    			
    			t = layout.getFooter();
    			
    			Message msg
    			
    			
    			if(t != null)
    			{
    				sbuf.append(t);
    				
    				part.setContent(sbuf, t);
    				
    				MultiPart mp = new MimeMultiPart();
    				mp.addBodyPart(part);
    				msg.
    				
    			}
    		}
    	}
    }*/

}
