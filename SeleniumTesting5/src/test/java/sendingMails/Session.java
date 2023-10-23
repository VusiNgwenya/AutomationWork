package sendingMails;

import java.util.Properties;

public class Session {

	Transport transport;
	
	public void getDefaultInstance(Properties props)
	{
		
	}
	
	public void setDebug(Debug debug)
	{
		
	}
	
	public Transport getTransport(String str)
	{
		return transport;
	}
}
