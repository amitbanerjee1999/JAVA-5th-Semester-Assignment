package Ass1;
import java.util.*;
public class main5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		double sum = 0;
		int temp=n;
		while(temp>0){
			int x = temp%10;
			sum=sum+x;
			temp=temp/10;
		}
		
		System.out.println(sum);
	}
}