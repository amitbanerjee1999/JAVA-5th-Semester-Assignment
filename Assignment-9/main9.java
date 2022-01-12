class P{
	void m(){
		System.out.println("Parent");
	}
}

class main9 extends P{
	void m() throws RuntimeException{
		System.out.println("Child");
	}
	public static void main(String[] args){
		P p = new main9();
		p.m();
	}
}