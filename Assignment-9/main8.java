import java.io.*;
import java.util.*;

class main8 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int m=sc.nextInt();
		int n=sc.nextInt();
		try{
			String s1 = str.substring(m,n);
			StringBuilder s2 = new StringBuilder();
			s2.append(s1);
			System.out.println(s2);
			s2.reverse();
			System.out.print(s2);
		}catch(Exception e){
			System.out.println("Error: <<Please Enter a String and Two Integer>>");
		}
		
	}
}

