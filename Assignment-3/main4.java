class EMP{
	String name="Amit";
	int ID=100;
	public String toString(){
		
	}
}
class Scientist extends EMP{
	int noOfpublication=5;
	int experience=3;
	public String toString(){
		
	}
}
class Dscientist extends Scientist{
	int award=1;
	public String toString(){
		return ;
	}
	
}
class main4{
	public static void main(String[] args){
		EMP e = new EMP();
		System.out.println(e);
		
	}
}