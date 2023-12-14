package stringConcatenation;

public class StringExamples {
	
	public static void main(String[] args)
	{
		String s1 = "way";
		String s2 = "2";
		String s3 = "automation";
		
		System.out.println(s1+10+15+s2+s3);
		System.out.println(s1+s2+s3+10*15);
		System.out.println(s1+(10+15)+s2+s3);
	}

}
