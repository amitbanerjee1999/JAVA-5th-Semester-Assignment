interface FirstInterf{
    void methodFirst();
}
interface SecondInterf{
    void methodThird();
}
interface ThirdInterf extends FirstInterf,SecondInterf{
    void methodFifth();
}
class Parent{
    void MethodParent(){
        System.out.println("Method of Parent Class.");
    };
}
class Child extends Parent implements ThirdInterf{
    public void methodFirst(){
        System.out.println("First Method of First Interface.");
    };
    public void methodThird(){
        System.out.println("First Method of Second Interface.");
    };
    public void methodFifth(){
        System.out.println("Method of Derived Interface.");
    };
    void methodChild(){
        System.out.println("Method of Child Class.");
    }
}
class test3{
    public static void main(String[] args){
        Child c = new Child();
        c.methodFirst();
        c.methodThird();
        c.methodFifth();
        c.methodParent();
        c.methodChild();
    }
}