class main3{
	public static void main(String[] args){
		try{
			int[] ar=new int[-5];
			System.out.println(ar.length);
		}
		catch(NegativeArraySizeException ne){
			System.out.println("NegativeArraySizeException catched");
		}
		
	}
}