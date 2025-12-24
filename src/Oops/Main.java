package Oops;

public class Main {
    static void main() {

        // Store 5 roll nos
        int number [] = new int[5];

        // Store 5 names

        String [] names =new String[5];


        Student sb = new Student();



        sb.rno =14;
        sb.name="selvin";
//        sb.marks=3.0f;
        System.out.println(sb.rno);
        System.out.println(sb.name);
        System.out.println(sb.marks);
    }
}


class Student {
    int rno;
    String name;
    float marks =90;
}