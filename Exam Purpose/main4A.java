import java.util.*;

class demo{
	static void sort_elements(String []my_str, int n){
		String temp;
		for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                if (my_str[i].compareTo(my_str[j]) > 0) {
                    
                    temp = my_str[i];
                    my_str[i] = my_str[j];
                    my_str[j] = temp;
                }
            }
        }
	}
}

class main4A{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String my_arr[] = S. split(" ");
		int len = my_arr.length;
		demo d = new demo();
		d.sort_elements(my_arr,len);
		System.out.print("The sorted array is : ");
		for (int i=0; i<len; i++)
		System.out.print(my_arr[i]+" ");
   }
}