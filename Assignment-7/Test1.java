import java.util.*;
class ConvertStringtoCharArray{
  void convStrtoCharArr(String str){
    char[] ch = str.toCharArray();
    System.out.print("Converted character Array: ");
    for (int i=0; i<ch.length; i++)
      System.out.print(ch[i]+" ");
  }
}
class Test1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = sc.nextLine();
    ConvertStringtoCharArray chArr = new ConvertStringtoCharArray();
    chArr.convStrtoCharArr(str);
  }
}