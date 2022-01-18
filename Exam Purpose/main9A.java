class Animal{
	void eat(){
		System.out.println("Animal Likes to Eat");
	}
	void sleep(){
		System.out.println("Animal Likes to Sleep");
	}
}
class Bird extends Animal{
	void eat(){
		System.out.println("Birds Likes to Eat");
	}
	void sleep(){
		System.out.println("Birds Likes to Sleep");
	}
	void fly(){
		System.out.println("Birds can fly.");
	}
}
class main9A{
	public static void main(String[] args){
		Animal a=new Animal();
		a.eat();
		a.sleep();
		
		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.fly();
		
		
	}
}