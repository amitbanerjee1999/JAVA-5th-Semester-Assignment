class main4B {
    public static void main(String[] args) {
        check c1 = new check();
        check c2 = new check();

        c1.i = 24;
        c1.j = 12;

        c2.i = 16;
        c2.j = 55;

        System.out.println(c1.i);
        System.out.println(c1.j);
        System.out.println(c2.i);
        System.out.println(c2.j);
    }
}

class check{
    static int i = 44;
    int j = 20;
}