package regexBasic;

import java.util.regex.Pattern;

public class SplitMethod {
public static void main(String args[])
{
	String s="one day you will go to canada";
	//String []arr=s.split("\\s");
	//it accept regex Pattern
//	for(String a:arr)
//	{
//		System.out.println(a);
//	}
	//\\s,.,
	Pattern p=Pattern.compile("a");
	//it accept whole sentence  
	String []arr2=p.split(s);
	for(String a:arr2)
		{
			System.out.println(a);
		}
}
}
