/*		2. Create an abstract class with three abstract methods check whether you can 
we override only few methods (not all methods) in subclass or not		*/


abstract class temp{
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
}

abstract class temp2 extends temp{
	
	public void m1(){
		System.out.println("Hello World!!!!");
	}
}

abstract class temp3 extends temp2{
	
	public void m2(){
		System.out.println("Hello World!!!!! Hello World!!!!");
	}
}

class temp4 extends temp3{
	
	public void m3(){
		System.out.println("Hello World!!!!! Hello World!!!! Hello World!!!!");
	}
}

class test2{
	public static void main(String[] args){
		temp t = new temp4();
		t.m1();
		t.m2();
		t.m3();
	}
}