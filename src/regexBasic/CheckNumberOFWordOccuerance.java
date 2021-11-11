package regexBasic;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CheckNumberOFWordOccuerance {

	public static void main(String args[])
	{
		String word="arun aruna varun";
		Pattern p=Pattern.compile("arun");
	    Matcher m=p.matcher(word);
	   while(m.find())
	   {
		   System.out.println(m.group());
		   System.out.println(m.start()+" "+m.end());
	   }
//	   //ipo antha varhta mothal la irrka pakanu
//	   //apadina ^caret ehta use pannanu
//	   Pattern pp=Pattern.compile("^arun");
//	   //ipo entha pattern eathula end aakuthu 
//	   //$
//	   Pattern ps=Pattern.compile("varun$");
//	   
////so namaa eetha vechi entha letter occur 
////aaduku easy ya sollidala
//	   //check specfic char 
//	   //eg: a|r
//	   Pattern po=Pattern.compile("a|r");//print both a letter
	}
}
