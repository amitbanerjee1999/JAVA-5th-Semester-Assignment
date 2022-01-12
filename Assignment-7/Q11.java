import java.util.Scanner;

class Q11 {
    public static void main(String[] args) {
        Quiz q = new Quiz();
        q.question();
    }
}

class Quiz {
    void question() {
        System.out.println("Who is the inventor of Java?");
        Scanner sc = new Scanner(System.in);
        // System.out.println(s);

        String ans = "James Gosling";

        int cnt = 3;
        while (cnt != 0) {
            
            System.out.print("Enter string: ");
            String s = sc.nextLine();
            if (ans.equals(s)) {
                System.out.println("Good");
                System.exit(0);
            } else {
                System.out.println("Try Again");
            }
            cnt -= 1;
        }
        System.out.println("The correct answer is: "+ ans);
        sc.close();
    }
}