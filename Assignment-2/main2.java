import java.util.*;
class Cylinder{
	int x=0;
	int y=0;
	Cylinder(int a,int b){
		this.x=a;
		this.y=b;
	}
	void Area(){
		double ar=3.14*this.x*this.x*this.y;
		System.out.println("The Area Of the Cylinder is: " + ar);
	}
	void Circumference(){
		double ar=2*3.14*this.x*this.y;
		System.out.println("The Circumference Of the Cylinder is: " + ar);
	}
}
class main2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int h=sc.nextInt();
		Cylinder c = new Cylinder(r,h);
		c.Area();
		c.Circumference();
	}
}