/*
 * 
 * @author barath balaji s
 * date 6/5/23
 */
package com.CoreJavaDeepDrive;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String firstname;
	private String lastname;
	
	public Person(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + "]";
	}


	@Override
	public int compareTo(Person o) {
		int result = this.lastname.compareTo(o.getFirstname());
		return result;
	}
	
	
	
	
}

public class treeset1 {

	public static void main(String[] args) {
		TreeSet<Person> name = new TreeSet<>();
       
		name.add(new Person("barath","balaji"));
		name.add(new Person("akash","manohar"));
		name.add(new Person("dilip","kumar"));
		
		for(Person personname : name) {
			System.out.println(personname);
		}
		
	}

}
