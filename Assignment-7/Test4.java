import java.util.*;
class CheckSubstring{
  void checkSubstr(String str){
    int isPresent = str.indexOf("Tech");
    if(isPresent == -1)
      System.out.println("Substring is not present.");
    else
      System.out.println("The position of 'Tech' is "+isPresent);
  }
}
class Test4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = sc.nextLine();
    CheckSubstring s = new CheckSubstring();
    s.checkSubstr(str);
  }
}