class main2{
	public static void main(String[] args){
		try{
			int[] ar={5,10,15};
			System.out.println(ar[5]);
			String s="something";
			System.out.println(s.charAt(11));
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("ArrayIndexOutOfBoundsException catched");
		}
		catch(StringIndexOutOfBoundsException se){
			System.out.println("StringIndexOutOfBoundsException catched");
		}
	}
}