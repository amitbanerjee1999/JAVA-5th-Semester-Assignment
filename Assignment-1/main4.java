package Ass1;
import java.util.*;
public class main4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		double ser = 0;
		for(int i=1;i<=n;i++){
			ser=1/Math.pow(i,2);
			if(i%2==0){
				sum -= ser;
			}else{
				sum += ser;
			}
		}
		System.out.println(sum);
	}
}