class p{
	static void m1(){
		System.out.println("Parent Static Method");
	}
	void m2(){
		System.out.println("Parent Non-Static Method");
	}
}
class c extends p{
	static void m1(){
		System.out.println("Child Static Method");
	}
	void m2(){
		System.out.println("Child Non-Static Method");
	}
}
class main17A{
	public static void main(String[] args){
		p p1 = new p();
		p1.m1();
		p1.m2();
		System.out.println();
		c c1 = new c();
		c1.m1();
		c1.m2();
		System.out.println();
		p p2 = new p();
		p2.m1();
		p2.m2();
	}
}