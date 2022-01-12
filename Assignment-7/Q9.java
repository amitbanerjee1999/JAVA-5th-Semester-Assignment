import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        
        String s = sc.nextLine();
        System.out.println("Enter the Starting index");
        int startInd = sc.nextInt();
        System.out.println("Enter the ending Index index");
        int endInd = sc.nextInt();

        String ans = ExtractedStr.printExtractedStr(s,startInd,endInd);
        System.out.println("The extracted string is "+ ans);
        sc.close();
    }
}

// AppleCut -> 2,5 -> plecut

class ExtractedStr{
    static String printExtractedStr(String s, int startInd, int endInd){
        String ans = s.substring(startInd,endInd);
        return ans;
    }
}