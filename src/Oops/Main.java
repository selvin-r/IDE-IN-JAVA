package Oops;

public class Main {
    static void main() {

        // Store 5 roll nos
        int number[] = new int[5];

        // Store 5 names

        String[] names = new String[5];


        Student sb = new Student(33, "Amma", 89.0f);
        Student sb1 = new Student();


//        sb.newName("David");
//        sb.greeting();


//
//        sb.rno =14;
//        sb.name="selvin";
//        sb.marks=3.0f;
        System.out.println(sb.rno);
        System.out.println(sb.name);
        System.out.println(sb.marks);

        Student random = new Student(sb);
        System.out.println(random.name);

        Student random1 = new Student();
        System.out.println(random1.name);

    }
}


class Student {
    int rno;
    String name;
    float marks = 90;


    void greeting() {
        System.out.println("Hello My Nme is " + name);
    }

    void newName(String newname) {

        this.name = newname;
    }

    // We Need A Way to the Values of above Properties Objects By Objects
    // We Need One Word To Access Every Objects


    Student (Student other){
        this.name =other.name;
        this.rno=other.rno;
        this.marks=other.marks;
    }

    // Constructors OverLoading

    Student() {

        // this is how you call a Constructor from aother Constructor
        // Internally : new Student ();

        this(13,"Aother",90.5f);

    }

    // para Constructors

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}