class main3A {
    public static void main(String[] args) {
        Parent p = new Parent(12, "Raj", "Chandannagar");
        ChildOne c1 = new ChildOne(16, "Simran", 89, "Chandannagar");
        ChildTwo c2 = new ChildTwo(19, "Anjali", "Kolkata", "Engineer", 16000);
    }
}

class Parent {
    int id;
    String name;
    String address;

    Parent(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}

class ChildOne {
    double marks;
    String name;
    int id;
    int address;

    ChildOne(int id, String name, double marks, String address) {
        this.marks = marks;
        this.name = name;
    }
}

class ChildTwo {
    String name;
    int id;
    String address;
    String Qualification;
    double salary;

    ChildTwo(int id, String name, String address, String Qualification, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.Qualification = Qualification;
        this.salary = salary;
    }
}