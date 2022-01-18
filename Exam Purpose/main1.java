class main1 {
    public static void main(String[] args) {
        String s=new String();
        s="Good";
        System.out.println(s);
        System.out.println(s.length());
        s.concat("Morning");
        System.out.println(s);
        System.out.println(s.length());

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.append(" Everyone");
        System.out.println(sb);
        System.out.println(sb.length());

    }    
}