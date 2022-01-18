class Demo{
	int m1(int a,int b){
		return 10;
	}
	double m1(int a,int b){
		return 20.05;
	}
	
}
class main15B{
	public static void main(){
		Demo d=new Demo();
		d.m1(10,30);
		d.m1(10,20);
	}
}