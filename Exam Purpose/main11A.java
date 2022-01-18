class Box{
	int length;
	int width;
	int height;
	Box(int length){
		this.length=length;
		this.width=0;
		this.height=0;
		System.out.println("Line Created");
	}
	Box(int length,int width){
		this.length=length;
		this.width=width;
		this.height=0;
		System.out.println("Rectangle Created");
	}
	Box(int length,int width,int height){
		this.length=length;
		this.width=width;
		this.height=height;
		System.out.println("Box Created");
	}
}
class main11A{
	public static void main(String[] args){
		Box b=new Box(10);
		Box b1=new Box(10,20);
		Box b2=new Box(10,20,60);
	}
	
}