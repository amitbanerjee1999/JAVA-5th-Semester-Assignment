class Box{

	double side,radius,height;
	

	Box(double radius,double height){
		this.radius = radius;
		this.height = height;
	}

	
	double volumeCone(){
		return ((3.14*radius*radius*height)/3);
	}
}

class main3{
	
	public static void main(String [] args){
		
		
		Box cone = new Box(2,4);
		
		System.out.println("Cone volume with radius " + cone.radius +" and height "+ cone.height+" is "+ cone.volumeCone());
	}
}