class main16A{
	public static void main(String[] args){
		try{
			System.out.println(10/0);
		}
		finally{
			System.out.println("Finally will always be executed");
		}
		
	}
}