import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {

    }
}

// Recursion


// Factorial

class RecursionCall {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static void main(String[] args) {
        System.out.println(factorial(5));
    }
}


// 1. Print numbers from 1 to n (using recursion)

class PrintNumber {
    static void print(int n){

        if(n==0){
            return;
        }
        print(n-1);
        System.out.print(n+ " ");
    }

    protected static void main(String[] s){
        int n=10;
        print(n);
    }
}


// 2. Develop a Java program to countDown(int n) the given number?


class CountDown{
    static void printl(int n){

        if(n==0){
            return;
        }
        System.out.print(n + " ");
        printl(n-1);
    }
    protected static void main(String[] args){
        int n=5;
        printl(n);
    }
}

// 3. Develop a Java program to find the sum of 'n' numbers?

class SumOfN{
    static int Sum(int n){

        if(n==0){
            return 0;
        }

        return n + Sum(n-1);

    }
    protected static void main(String[] args){
        int n=10;
        System.out.println(Sum(n));
    }
}

// 4. Develop a Java program to find the sum between 'n' and 'm'?

class SumNansM {
    static  int Sum(int n,int m){

        if(n > m){
            return 0;
        }
        return n +Sum(n+1,m);
    }

    protected static  void main(String[] args){
        int n=3,m=7;
        System.out.println(Sum(n,m));
    }
}

//  Develop a Java program to the sum of the digits of a number?

class Digits {
    static int Sum(int n){

        if(n==0){
            return 0;
        }

        return (n % 10)  + Sum(n/10);
    }

    protected  static  void main (String[] args){
        int n=1234;
        System.out.println(Sum(n));
    }
}



// Fibinace Number


class Fibi {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Tha Number ::");
        int n=scan.nextInt();
        System.out.println(Find(n));
    }


    static  int Find(int n){

        if(n<2){

            return n;
        }



        return Find(n-1) + Find(n-2);
    }
}