package Ass1;
import java.util.*;
public class main8{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int x = sc.nextInt();
		double sum=0;
		double ser=0;
		for(int i=1;i<=n;i++){
			ser=Math.pow(x,i);
			sum += ser;
		} 
		
		System.out.println(sum);
	}
}