package Ass1;
import java.util.*;
public class main6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		String n = sc.next();
		StringBuffer sb = new StringBuffer(n);
		sb.reverse();
		
		
		System.out.println(sb);
	}
}