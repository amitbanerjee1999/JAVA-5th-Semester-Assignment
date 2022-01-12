/* 3. Create two interfaces, each with two methods. Inherit a new interface from the two, adding a new method. 
Create a class by implementing the new interface and also inheriting from a concrete class. In main (), 
create an object of derived class and call the methods. [do all without package statement */



interface FirstInterf{
    void methodFirst();
    void methodSecond();
}
interface SecondInterf{
    void methodThird();
    void methodFourth();
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
    public void methodSecond(){
        System.out.println("Second Method of First Interface.");
    };
    public void methodThird(){
        System.out.println("First Method of Second Interface.");
    };
    public void methodFourth(){
        System.out.println("Second Method of Second Interface.");
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
        c.methodSecond();
        c.methodThird();
        c.methodFourth();
        c.methodFifth();
        c.methodParent();
        c.methodChild();
    }
}