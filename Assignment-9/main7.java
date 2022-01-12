class NewException extends RuntimeException{
	NewException(String a){
		super(a);
	}
}
class  C{
		void f(){
			System.out.println("f()");
		}
		void g(){
			throw new NewException("i'm here ni g()");
		}
		
}
class main7{
	public static void main(String[] args){
		C c=new C();
		c.f();
		try{
			c.g();
		}catch(NewException e){
			System.out.println(e.getCause());
		}
	}
	
}