import java.util.*;
class AppendStringtoCharArray {
  void appndStrtoCharArr(String str, char[] ch) {
    String strTemp = new String(ch);
    System.out.print("Concatenated String is: " + str.concat(strTemp));
  }
}
class Test2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = sc.nextLine();
    System.out.print("Enter the character array: ");
    char[] arr = sc.next().toCharArray();
    AppendStringtoCharArray chArr = new AppendStringtoCharArray();
    chArr.appndStrtoCharArr(str, arr);
  }
}