import java.util.*;
class SortStringArray{
  String[] splitStr(String str){
    String[] strArr = str.split(" ");
    return strArr;
  }
  void sortStrArr(String str){
    String strArr[] = splitStr(str);
    int size = strArr.length;
    for(int i=0; i<size-1; i++){  
      for (int j=i+1; j<size; j++){  
        if(strArr[i].compareTo(strArr[j]) > 0){
          String temp = strArr[i];  
          strArr[i] = strArr[j];  
          strArr[j] = temp;  
        }  
      }  
    }  
  }
  void displayStrArr(String[] str){
    
  }
}
class Test5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = sc.nextLine();
    SortStringArray s = new SortStringArray();
    s.sortStrArr(str);
  }
}