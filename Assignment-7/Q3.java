import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int l1 = s.length();
        System.out.println(l1);

        System.out.println(s);
        s = s.trim();
        int l2 = s.length();
        System.out.println(l2);
        System.out.println(s);
        sc.close();
    }
}
