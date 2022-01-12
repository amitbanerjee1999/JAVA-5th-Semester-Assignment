//package com.exception;
import java.util.*;



public class main6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter monthly Salary: ");
		int n=sc.nextInt();
		try{
			if(n<10000){
				throw new demoexception(">>>provided the monthly salary of a person is less than Rs. 10,000 /- "); 
			}
		}catch(demoexception de){
			System.out.println("Error "+de+ de.getMessage());
		}
	}
}