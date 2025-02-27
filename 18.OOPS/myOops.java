public class myOops {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColor("Red");
        // System.out.println(p1.getColor());
        // BankAccount b1 = new BankAccount();
        // b1.username = "Mohammad";
        // System.out.println(b1.username);
        // b1.setPassword("11121wes");

        Student s1 = new Student();
        s1.name = "Hashmi";
        s1.age = 19;
        s1.password = "12233ssd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xsss";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int age;
    String password;
    int marks[];

    Student() {
        marks = new int[3]; // Initialize the marks array
    }

    // Shallow copy constructors
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.marks = s1.marks;
    // }

    // Deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        marks = new int[3]; // Initialize the marks array
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pswd) {
        password = pswd;
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}