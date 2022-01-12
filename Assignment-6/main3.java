package pTwo;
import p1.*; 
class B extends A{
	void m2(){
		m1();
	}
}

public class main3{
	public static void main(String[] args){
		B b=new B();
		b.m2();
		System.out.println("Main Method");
	}
}