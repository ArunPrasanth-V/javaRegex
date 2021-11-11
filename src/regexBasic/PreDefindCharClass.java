package regexBasic;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefindCharClass {

	public static void main(String args[])
	{
		String s="arun234@#$ arun aad";
		Pattern p=Pattern.compile("\\b");
		// small s na space matt2 print pannu
		// Capital s na space sa thavara ella letter ru me
		//print pannu
	    Matcher m=p.matcher(s);
	    while(m.find())
	    {
	    	System.out.println(m.group()+" position "+m.start());
	    }
	    Pattern d=Pattern.compile("\\d");
	    //d print all number
	    //D print except number
	    Pattern dm=Pattern.compile("\\w");
	    //w it print all word except special char
	    Pattern dmm=Pattern.compile("\\W");
        //print except apha number
	  
	    Pattern.compile("\\barun");
	   // b-mean boundry arun nu start aaka letter elame print aaku
	    
	    Pattern.compile("\\barun\\b");
	    //arun la uu start aaganu aprm arun la uu end aakaganu
	    //antha word matt2 print pannu
	    Pattern.compile("arun\\B");
	    // arun nu start aaganu aana arun mudiyaa kudathu
	    Pattern.compile("\\Garun");
	    // ^arun ra ethu start aagi space se illa ma
	    //arun vera etha chi word irrtha print pannu.
	    //that is a grouping
	    Pattern.compile(".");
	    //athula irrka ella letter um eaduthu2 vanthu kuduku
	}
}
