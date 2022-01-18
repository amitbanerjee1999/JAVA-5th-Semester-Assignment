class Fruit{
	String Name;
	String Taste;
	String size;
	void eat(){
		System.out.println("The Taste of the fruit is What?");
	}
}
class Mango extends Fruit{
	void eat(){
		System.out.println("The Taste of the fruit is Sweet");
	}
}
class Apple extends Fruit{
	void eat(){
		System.out.println("The Taste of the fruit is Sour");
	}
}
class main{
	public static void main(String[] args){
		Fruit f = new Fruit();
		f.eat();
		
		Mango m = new Mango();
		m.eat();
		
		Apple a = new Apple();
		a.eat();
		
		
		Fruit f1 = new Mango();
		f1.eat();
		
		Fruit f2 = new Apple();
		f2.eat();
	}
}