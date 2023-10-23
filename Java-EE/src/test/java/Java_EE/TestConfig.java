package Java_EE;

public class TestConfig 
{
    public static String server = "smtp.gmail.com";
    public static String from = "ffaproject@gmail.com";
    public static String password = "123";
    public static String[] to = {"seleniumcoaching@gmail.com","trainer2way2automation.com"};
    public static String subject = "Test Report";
    
    public static String messageBody = "TestMessage";
    public static String attachmentPath = "/Java-EE/";
    public static String attachmentName ="reports.zip";
    public static String reportPath = System.getProperty("user.dir")+"//reports.zip";
    
}
