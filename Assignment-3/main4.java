class Employee{
String name;
int id;
Employee(String name,int id){
this.name=name;
this.id=id;
}
public String toString(){
return "Name:"+name+"ID:"+id;
}
}
class Scientist extends Employee{
int nop,exp;
Scientist(String name,int id,int nop,int exp){
super(name,id);
this.nop=nop;
this.exp=exp;
}
public String toString(){
return "Name:"+name+" ID:"+id+" No of Publications:"+nop+" No.of Experience:"+exp;
}
}
class Dscientist extends Scientist{
String award;
Dscientist(String name,int id,int nop,int exp,String award){
super(name,id,nop,exp);
this.award=award;
}
public String toString(){
return "Name:"+name+" ID:"+id+" No of Publications:"+nop+" No.of Experience:"+exp+" Award:"+award;
}
}
class main4
{
public static void main(String[] args) 
{
Employee e=new Employee("AAA",111);
System.out.println(e);

Scientist sc=new Scientist("SSS",222,10,12);
System.out.println(sc);

Dscientist dsc=new Dscientist("SSS",222,10,12,"NATIONAL AWARD");
System.out.println(dsc);
}
}