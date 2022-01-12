/*1. Create an interface named Shape with a field pie (=3.14). Create two subclasses of it named Circle and Rectangle
create object of the two classes and calculate their area*/

interface Shape{
	double pie=3.14;
}

class Circle implements Shape{
	void area(int r){
		double area=pie * r * r;
		System.out.println("The Area of the Circle is: "+area);
	}
}
class Rectangle implements Shape{
	void area(int l,int b){
		double area=l * b;
		System.out.println("The Area of the Rectangle is: "+area);
	}
}

class test1{
	public static void main(String args[]){
		Circle c = new Circle();
		c.area(5);
		
		Rectangle r = new Rectangle();
		r.area(4,2);
	}
}