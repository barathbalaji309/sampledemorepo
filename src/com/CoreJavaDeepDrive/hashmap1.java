/*
 * 
 * @author barath balaji s
 * date 6/5/23
 */
package com.CoreJavaDeepDrive;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap();
		
     int ticketno;
     String moviename;
     Scanner read = new Scanner(System.in);
     
     for (int i=0;i<2;i++) {
    	 System.out.println("ticket no:");
    	 ticketno = read.nextInt();
    	 System.out.println("movie name:");
    	 moviename = read.next();
    	 hm.put(ticketno,moviename);
     }
     

//     int n = read.nextInt();
     if(hm.get(123)!=null) {
    	 System.out.println("particular key exists ");
     }
     else {
    	 System.out.println("particular key not exists"); 
     }
     
     for(Entry<Integer, String> a : hm.entrySet()) {
//    	 System.out.println("enter movie name:");
//    	 String str = read.next();
    	 if(a.getValue().equals("ps1")) {
    	 
    		 System.out.println("particular value exist");
    	 }else {
    		 System.out.println("particular value not exist");
    	 }
     }
     
    	 Iterator<Integer> itr = hm.keySet().iterator();
    	 while(itr.hasNext()) {
    		 System.out.println(itr.next());
    	 }
    	 
  }
}