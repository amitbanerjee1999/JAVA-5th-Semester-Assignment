import java.util.Scanner;

class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string");
        String s = sc.nextLine();
        System.out.println("Input the integer which you want to remove");
        int n = sc.nextInt();
        DeleteMthEle de = new DeleteMthEle();
        String ans = de.deleteMe(s, n);
        System.out.println("The new String is " + ans);
        sc.close();
    }
}

class DeleteMthEle{
    String deleteMe(String s, int n){
        String ans = s.substring(0, n-1) + s.substring(n);
        return ans;
    }
}
