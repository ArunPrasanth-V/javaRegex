package regexBasic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoblieNumberValidationUsingrRegex {
  public static void main(String args[]) throws FileNotFoundException
  {
	  File file=new File("F:\\CheckMobileValidNUmber.txt");
	  Scanner scan=new Scanner(file);
	  boolean check=scan.hasNext();
	  while(check)
	  {
	   	String s=scan.next();
	  	int i=s.lastIndexOf(":");
	   	String number=s.substring(i+1);
	    Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
	    Matcher m=p.matcher(number);
	    if(m.find())
	  		  System.out.println(m.group()+" valid moblie Number");
	    else
	   		  System.out.println("Not Valid!");
	    check=scan.hasNext();
	    }
	
  }
}
