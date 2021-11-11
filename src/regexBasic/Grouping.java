package regexBasic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grouping {
//here i eant ot check the group of char in 
	//the pattern or not keyword
	public static void main(String args[])
	{
		String str="poiipoiipoi";
		Pattern p=Pattern.compile("[po]");
		//either a| b|c
		Matcher  m=p.matcher(str);
		while(m.find())
		{
			System.out.println(m.group());
		}
		//no po remainding all should print
		//ahtu ku[^po] so ethu matt2 irrkathu
//		Pattern hp=Pattern.compile("[^po]");
//		//eanaku a-z kulla irrrka thu matt2 venuna 
//		Pattern op=Pattern.compile("[a-z]");
//		Pattern opp=Pattern.compile("[a-zA-z]");
	}
}
