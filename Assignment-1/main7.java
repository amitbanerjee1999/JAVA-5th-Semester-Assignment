package Ass1;
import java.util.*;
public class main7{
	public static int fact(int n){
		if(n==0) return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		System.out.println(fact(n));
	}
}