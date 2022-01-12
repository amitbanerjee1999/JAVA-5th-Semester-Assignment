/*class MyException extends Exception{
	
}
class main5{
	public static void main(String[] args){
		try{
			throw new MyException();
		}catch(MyException exp){
			System.out.println("Caught");
			System.out.println(exp);
			System.out.println(exp.getMessage());
		} 
	}
}*/


class MyException extends Exception{
		MyException(String s){
			super(s);
		}
}

class main5{
	public static void main(String[] args){
		try{
			throw new MyException("Custom Exception");
		}catch(MyException exp){
			System.out.println("Caught");
			System.out.println(exp);
			System.out.println(exp.getMessage());
		} 
	}
}