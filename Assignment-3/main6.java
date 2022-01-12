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

class main6{
	public static void main(String[] args){
		Five f = new Five();
		f.show();
		subclass1 s1 = new subclass1();
		f=s1;
		f.show();
		subclass2 s2 = new subclass2();
		f=s2;
		f.show();
		subclass3 s3 = new subclass3();
		f=s3;
		f.show();
	}
}