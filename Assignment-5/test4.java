//4. Write a program to demonstrate anonymous inner class (using super class and interface)



interface Pickle{
    void tasteFirstSample();
}
class AnotherPickle{
    public void tasteSecondSample(){
        System.out.println("Sweet.");
    };
}
class test4{
    public static void main(String[] args){
        AnotherPickle p1 = new AnotherPickle(){
            public void tasteSecondSample(){
                System.out.println("Sour.");
            }
        };
        p1.tasteSecondSample();
        AnotherPickle p2 = new AnotherPickle();
        p2.tasteSecondSample();
        Pickle p = new Pickle(){
            public void tasteFirstSample(){
                System.out.println("Spicy.");
            }
        };
        p.tasteFirstSample();
    }
}


