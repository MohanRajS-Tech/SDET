package javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBasics002 {
    public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//if else 
		
		for(int a:arr) {
			if(a%2==0) {
				System.out.println(a+" Is a multiple"+"\n");
			}
			else {
				System.out.println(a+" Is not multiple of 2");
			}
		}
//arraylist
		ArrayList<String> a =new ArrayList<String>();
		a.add("Selenium");
		a.add("Project");
		a.add("Automation");
		a.add("Testing");
		a.add("Webdriver");
		a.add("Java");
		a.add("Basics");
		for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
		}
		System.out.println("\n"+"Checking if a value is present in a ArrayList or not");
		System.out.println(a.contains("Selenium")+"\n");
//Enhanced for loop
		//for(String val:a) {
		//	System.out.println(val);
		//}
//converting Array to Arraylist
		String[] name = {"Aswim","Barath","Calvin","Durgesh","Edwin","Fazil","Gokul"};
		List<String> namelist = Arrays.asList(name);
		//num.add(100, null);
//while loop
		int i=0;
		while(i<namelist.size()) {
			System.out.println(namelist.get(i));
			i++;
		}
		
		//String and Srting methods
		
		
		//creating method and importing
		
		}
		
    
}
