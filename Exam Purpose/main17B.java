interface p{
	void m1();
}
interface q{
	void m1();
}
interface c extends p,q{

}
class Example implements c{
	public void m1(){
		System.out.println("Multiple Inheretence by interface.");
	}
}
class main17B{
	public static void main(String[] args){
		Example e = new Example();
		e.m1();
	}
}