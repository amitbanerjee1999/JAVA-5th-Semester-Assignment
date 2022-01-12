class p{
	static{
		m1();
		System.out.println("Hi i am the first instance block");
	}
	
	static void m1(){
		System.out.println("I'm the First Method.");
	}
}

class q extends p{
	static{
		m2();
		System.out.println("Hi I'm the second Instance Block.");
	}
	static void m2(){
		System.out.println("Hi, I'm the second Method.");
	}
	
}
class main2 extends q{
	public static void main(String[] args){
		//ass1 c=new ass1();
		System.out.println("Child Class main() Method.");
	}
}