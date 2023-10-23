import java.util.Properties;

public class Session {
	Session session;
	SMTPTransport tp;
	
	public Session getInstance(Properties prop,Authenticator auth)
	{
		return session;
	}
	
	public void setDebug(boolean smtpDebug)
	{
		
	}
	
	public SMTPTransport getTransport(String tp)
	{
		return this.tp;
	}

}
