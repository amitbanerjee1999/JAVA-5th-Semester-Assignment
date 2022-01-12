class Box{

	double side,radius,height;
	
	
	Box(double side){
		this.side = side;
	}
	
	Box(double radius,double height){
		this.radius = radius;
		this.height = height;
	}
	
	double volume(double side){
		return (side*side*side);
	}
	
	double volume(double radius,double height){
		return ((3.14*radius*radius*height)/3);
	}
}

class main3{
	
	public static void main(String [] args){
		
		Box cube = new Box(6);
		
		Box cone = new Box(2,4);

		
		System.out.println("Cube volume with side " + cube.side +" is "+ cube.volume(cube.radius));
		
		System.out.println("Cone volume with radius " + cone.radius +" and height "+ cone.height+" is "+ cone.volume(cone.radius,cone.height));
	}
}