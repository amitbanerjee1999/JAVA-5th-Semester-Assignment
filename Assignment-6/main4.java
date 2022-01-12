package pkgTwo;
import pkgOne.*;
class Tempo implements Interf{
	public void methodOne(){
		System.out.println("First Method!!!");
	}
	public void methodTwo(){
		System.out.println("Second Method!!!");
	}
	public void methodThree(){
		System.out.println("Third Method!!!");
	}
}

class main4{
	public static void main(String[] args){
		Tempo t=new Tempo();
			t.methodOne();
			t.methodTwo();
			t.methodThree();
			System.out.println("Main Method");
	}
}