package regexBasic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier {
//?,+,*,{}
	//a+ atleast 1 a a can be any number.
	//? it print if it is found else ok eg:91
	//* any number of matches including 0
	//a{1} -if 1 a occerrance
	//a{0,2}  -inbetween 0-2 occuerance
	public static void main(String args[])
	{
		String s="aabaabaaaababa";
		Pattern p=Pattern.compile("1,2");
		Matcher m=p.matcher(s);
		while(m.find())
		{
			System.out.println(m.group()+" -START AT- "+m.start());
		}
	}
}
