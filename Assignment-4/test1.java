/*		1. Check without having any abstract method/s whether a class can be abstract; 
if so, then use that concrete method/s from another class having main method	*/

abstract class temp{
	void demo1(){
		System.out.println("Abstract class without Abstract Method ");
	}
	void demo2(){
		System.out.println("Abstract class without Abstract Method2 ");
	}
}

/*
class main{
	public static void main(String args[]){
		temp.demo1();
	}
}*/

class test1  extends temp{
	public static void main(String args[]){
		test1 m = new test1();
		m.demo1();
		m.demo2();
	}
}