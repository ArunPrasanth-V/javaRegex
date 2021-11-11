package regexBasic;
import java.util.*;
import java.math.BigDecimal;

public class Example {
 public static void main(String args[])
 {
	String s1="ran";
	String s2="heyarun.doc";
	//String s[]=s2.split("\\.");
	
	(String str:s)
	System.out.println(str);
	//System.out.println(s1.indexOf(s1.compareToIgnoreCase('A')));
	 
 }
}
/*
 Problem Description :
  
     Given an Array and Target element. we need to find in the array
  which two element is the sum of target
   
    eg:array{1,2,5,3,4}  target=9
       Answer:5,4 in 2nd & 4th index
   
   MY APPROACH:
       first i created a Map which is key ,value pair
        1)i minus (-) current element with taget element
        2)then, am going to search is the minus element is present in
    the Map or not.
        3)If it is present mean return the index 
        4)else add the current index and value (values as key and index as value)
        5)I repeat the same thing until the end.if 
     it found mean return it.
        6)return -1,-1.  
          
     
*/