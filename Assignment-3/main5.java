class Five{
	void show(){
		System.out.println("Hi-1");
	}
}
class subclass1 extends Five{
	void show(){
		System.out.println("Hi-2");
	}
}
class subclass2 extends Five{
	void show(){
		System.out.println("Hi-3");
	}
}
class subclass3 extends Five{
	void show(){
		System.out.println("Hi-4");
	}
}

class main5{
	public static void main(String[] args){
		Five f = new Five();
		f.show();
		subclass1 s1 = new subclass1();
		s1.show();
		subclass2 s2 = new subclass2();
		s2.show();
		subclass3 s3 = new subclass3();
		s3.show();
	}
}