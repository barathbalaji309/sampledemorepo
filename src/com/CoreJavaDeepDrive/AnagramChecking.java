/*
 * 
 * @author barath balaji s
 * date 6/5/23
 */
package com.CoreJavaDeepDrive;
import java.util.*;
public class AnagramChecking {
	 public static void isAnagram(String a,String b)
         {
          char c1[] = a.toLowerCase().toCharArray();
          char c2[] = a.toLowerCase().toCharArray();
        
          Arrays.sort(c1);
          Arrays.sort(c2);

         if(new String(c1).equals(new String(c2)))
        	 System.out.println("anagram");
         else System.out.println("not a anagram");
}

	public static void main(String[] args) {
		 {
			 Scanner read = new Scanner(System.in);
			     
		       String s1 = read.next();
		       String s2 = read.next();
		       
		       isAnagram(s1,s2);
		       
		    
		   }
	    }

	}


