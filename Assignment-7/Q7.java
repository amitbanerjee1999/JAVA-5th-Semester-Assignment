
class Q7 {
    public static void main(String[] args) {
        String s=new String();
        s="Anurag";
        System.out.println(s);
        System.out.println(s.length());
        s.concat("Mukherjee");
        System.out.println(s);
        System.out.println(s.length());

        StringBuffer sb = new StringBuffer("Anurag");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.append("Mukherjee");
        System.out.println(sb);
        System.out.println(sb.length());

    }    
}
