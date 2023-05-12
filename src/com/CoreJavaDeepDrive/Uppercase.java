/*
 * 
 * @author barath balaji s
 * date 6/5/23
 */
package com.CoreJavaDeepDrive;
import java.util.*;
public class Uppercase {

	public static void main(String[] args) {
	   Scanner read = new Scanner(System.in);
	   String s = read.nextLine();
       String arr[] = s.split(" ");
       
       if(arr.length<2) {
    	   System.out.println("LESS");
       }else
    	   System.out.println(arr[1].toUpperCase());
	}

}
