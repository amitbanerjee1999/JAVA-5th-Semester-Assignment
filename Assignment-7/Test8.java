import java.util.*;
class SortString{
	String sortString(String str){
		char tempArr[] = str.toCharArray();
		Arrays.sort(tempArr);
		return new String(tempArr);
	}
}
class Test8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    SortString s = new SortString();
    System.out.print("Enter the string: ");
    String str = sc.nextLine();
    String opStr = s.sortString(str);
		System.out.println("Input String : " + str);
		System.out.println("Output String : "+ opStr);
	}
}
