package regexBasic;

import java.util.StringTokenizer;

public class StringTokenizerdemo {

	public static void main(String[] args) {
     
      StringTokenizer s=new StringTokenizer("arun prasanth");  
     //StringTokenizer("25-05-2002","-");    
      //StringTokenizer("25-05-2002","-",true);   
      //print including delimiter
      //System.out.println(s.countTokens());
	while(s.hasMoreTokens())
		System.out.println(s.nextToken());
	}

}
