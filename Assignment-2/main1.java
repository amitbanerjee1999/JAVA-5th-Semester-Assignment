import java.util.*;

class First{
	int x;
	int y;
	First(int a,int b){
		this.x=a;
		this.y=b;
	}
	void addition(){
		int res=this.x+this.y;
		System.out.println(res);
	}
}
class main1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		First f = new First(x,y);
		f.addition();
	}
	
}