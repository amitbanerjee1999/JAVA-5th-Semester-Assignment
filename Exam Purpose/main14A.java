import java.util.*;
class GeneratePassword{
  String createPasswd(String fName, String mName, String lName,String rollNo){
    String passwd = new String();
	int n = rollNo.length();
    if (mName.isEmpty())
      passwd = fName.substring(0,1) + lName.substring(0,1) + rollNo.substring(n-4,n);
    else
      passwd = fName.substring(0,1) + mName.substring(0,1) + lName.substring(0,1) + rollNo.substring(n-4,n);
    return passwd;
  }
}
class main14A{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    GeneratePassword p = new GeneratePassword();
    System.out.print("Enter the First Name: ");
    String fName = sc.nextLine();
    System.out.print("Enter the Middle Name: ");
    String mName = sc.nextLine();
    System.out.print("Enter the Last Name: ");
    String lName = sc.nextLine();
    System.out.print("Enter the roll no.: ");
    String rollNo = sc.nextLine();
    String opStr = p.createPasswd(fName,mName,lName,rollNo);
		System.out.println("Generated Password is : "+ opStr);
	}
}