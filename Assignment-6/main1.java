class p{
	{
		m1();
		System.out.println("Hi i am the first instance block");
	}
	
	void m1(){
		System.out.println("I'm the First Method.");
	}
}

class ass1 extends p{
	{
		m2();
		System.out.println("Hi I'm the second Instance Block.");
	}
	void m2(){
		System.out.println("Hi, I'm the second Method.");
	}
}
class main1{
	public static void main(String[] args){
		ass1 c=new ass1();
		System.out.println("Child Class main() Method.");
	}
}