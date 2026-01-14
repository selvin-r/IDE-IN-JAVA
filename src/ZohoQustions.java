import java.util.Arrays;
import java.util.Scanner;

public class ZohoQustions {
    public static void main(String[] args) {

    }
}
// 20. Print longest sequence between same character

//Ex I/p abcccccbba
//O/p 8 (from a to a)
//I/p aaaaaaaa
//O/p 6
//
class LongestSequence{
    public static void main(String[] args) {
        System.out.println(Longest("abccccba"));
        System.out.println(Longest("abausshsjjsnsjhsjdhd"));
        System.out.println(Longest("aaaaaaaaeeeeeeeeeeeeeeeeeeee"));
    }
  public static int Longest(String s){
        int maxlen =0;
        int n=s.length();

        for(int i=0;i<n;i++){

            for(int j=n-1;j>i;j--){

                if(s.charAt(i)==s.charAt(j)){
                    int len = j -i+1;
                    if(len > maxlen){
                        maxlen = len;
                    }
                   // break;
                }
            }

        }
        return  maxlen;

  }

}


// 17.Given an array of integers, compute the maximum value for each integer in the index, by either summing all
// the digits or multiplying all the digits. (Choose which operation gives the maximum value)
//Input:
//	5
//	120   24   71   10   59
//	Output:
//	3   8   8   1   45
//Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0.
// Thus, maximum of this two is 3.
//


class Compute {
    static void main() {
//        int temp [] = {120,24,71,10,59};

//     int num =120;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value :");

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        int mult = 1;


        for(int x=0;x<arr.length;x++) {

            int num = arr[x];

             sum=0;
          mult=1;

            while (num > 0) {
                int dig = num % 10;



                sum += dig;
                mult *= dig;
                num = num / 10;
//            System.out.print( " " + digit);
            }
            arr[x]=Math.max(sum,mult);

        }
        System.out.println(Arrays.toString(arr));

        int max =Math.max(sum,mult);
        System.out.println("Max Value :" +max);
//        System.out.println( " sum value :" +sum);
//        System.out.println(" Mult Value :" +mult);
    }
}


// Demo=================================


import java.util.Arrays;
import java.util.Scanner;

public class ZohoQustions {
    public static void main(String[] args) {

    }
}
// 20. Print longest sequence between same character

//Ex I/p abcccccbba
//O/p 8 (from a to a)
//I/p aaaaaaaa
//O/p 6
//
class LongestSequence{
    public static void main(String[] args) {
        System.out.println(Longest("abccccba"));
        System.out.println(Longest("abausshsjjsnsjhsjdhd"));
        System.out.println(Longest("aaaaaaaaeeeeeeeeeeeeeeeeeeee"));
    }
    public static int Longest(String s){
        int maxlen =0;
        int n=s.length();

        for(int i=0;i<n;i++){

            for(int j=n-1;j>i;j--){

                if(s.charAt(i)==s.charAt(j)){
                    int len = j -i+1;
                    if(len > maxlen){
                        maxlen = len;
                    }
                    // break;
                }
            }

        }
        return  maxlen;

    }

}


// 17.Given an array of integers, compute the maximum value for each integer in the index, by either summing all
// the digits or multiplying all the digits. (Choose which operation gives the maximum value)
//Input:
//	5
//	120   24   71   10   59
//	Output:
//	3   8   8   1   45
//Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0.
// Thus, maximum of this two is 3.
//


class Compute {
    static void main() {
//        int temp [] = {120,24,71,10,59};

//     int num =120;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value :");

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        int mult = 1;


        for(int x=0;x<arr.length;x++) {

            int num = arr[x];

            sum=0;
            mult=1;

            while (num > 0) {
                int dig = num % 10;



                sum += dig;
                mult *= dig;
                num = num / 10;
//            System.out.print( " " + digit);
            }
            arr[x]=Math.max(sum,mult);

        }
        System.out.println(Arrays.toString(arr));

        int max =Math.max(sum,mult);
        System.out.println("Max Value :" +max);
//        System.out.println( " sum value :" +sum);
//        System.out.println(" Mult Value :" +mult);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ZohoQustions {
    public static void main(String[] args) {

    }
}
// 20. Print longest sequence between same character

//Ex I/p abcccccbba
//O/p 8 (from a to a)
//I/p aaaaaaaa
//O/p 6
//
class LongestSequence{
    public static void main(String[] args) {
        System.out.println(Longest("abccccba"));
        System.out.println(Longest("abausshsjjsnsjhsjdhd"));
        System.out.println(Longest("aaaaaaaaeeeeeeeeeeeeeeeeeeee"));
    }
    public static int Longest(String s){
        int maxlen =0;
        int n=s.length();

        for(int i=0;i<n;i++){

            for(int j=n-1;j>i;j--){

                if(s.charAt(i)==s.charAt(j)){
                    int len = j -i+1;
                    if(len > maxlen){
                        maxlen = len;
                    }
                    // break;
                }
            }

        }
        return  maxlen;

    }

}


// 17.Given an array of integers, compute the maximum value for each integer in the index, by either summing all
// the digits or multiplying all the digits. (Choose which operation gives the maximum value)
//Input:
//	5
//	120   24   71   10   59
//	Output:
//	3   8   8   1   45
//Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0.
// Thus, maximum of this two is 3.
//


class Compute {
    static void main() {
//        int temp [] = {120,24,71,10,59};

//     int num =120;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value :");

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        int mult = 1;


        for(int x=0;x<arr.length;x++) {

            int num = arr[x];

            sum=0;
            mult=1;

            while (num > 0) {
                int dig = num % 10;



                sum += dig;
                mult *= dig;
                num = num / 10;
//            System.out.print( " " + digit);
            }
            arr[x]=Math.max(sum,mult);

        }
        System.out.println(Arrays.toString(arr));

        int max =Math.max(sum,mult);
        System.out.println("Max Value :" +max);
//        System.out.println( " sum value :" +sum);
//        System.out.println(" Mult Value :" +mult);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ZohoQustions {
    public static void main(String[] args) {

    }
}
// 20. Print longest sequence between same character

//Ex I/p abcccccbba
//O/p 8 (from a to a)
//I/p aaaaaaaa
//O/p 6
//
class LongestSequence{
    public static void main(String[] args) {
        System.out.println(Longest("abccccba"));
        System.out.println(Longest("abausshsjjsnsjhsjdhd"));
        System.out.println(Longest("aaaaaaaaeeeeeeeeeeeeeeeeeeee"));
    }
    public static int Longest(String s){
        int maxlen =0;
        int n=s.length();

        for(int i=0;i<n;i++){

            for(int j=n-1;j>i;j--){

                if(s.charAt(i)==s.charAt(j)){
                    int len = j -i+1;
                    if(len > maxlen){
                        maxlen = len;
                    }
                    // break;
                }
            }

        }
        return  maxlen;

    }

}


// 17.Given an array of integers, compute the maximum value for each integer in the index, by either summing all
// the digits or multiplying all the digits. (Choose which operation gives the maximum value)
//Input:
//	5
//	120   24   71   10   59
//	Output:
//	3   8   8   1   45
//Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0.
// Thus, maximum of this two is 3.
//


class Compute {
    static void main() {
//        int temp [] = {120,24,71,10,59};

//     int num =120;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value :");

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        int mult = 1;


        for(int x=0;x<arr.length;x++) {

            int num = arr[x];

            sum=0;
            mult=1;

            while (num > 0) {
                int dig = num % 10;



                sum += dig;
                mult *= dig;
                num = num / 10;
//            System.out.print( " " + digit);
            }
            arr[x]=Math.max(sum,mult);

        }
        System.out.println(Arrays.toString(arr));

        int max =Math.max(sum,mult);
        System.out.println("Max Value :" +max);
//        System.out.println( " sum value :" +sum);
//        System.out.println(" Mult Value :" +mult);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ZohoQustions {
    public static void main(String[] args) {

    }
}
// 20. Print longest sequence between same character

//Ex I/p abcccccbba
//O/p 8 (from a to a)
//I/p aaaaaaaa
//O/p 6
//
class LongestSequence{
    public static void main(String[] args) {
        System.out.println(Longest("abccccba"));
        System.out.println(Longest("abausshsjjsnsjhsjdhd"));
        System.out.println(Longest("aaaaaaaaeeeeeeeeeeeeeeeeeeee"));
    }
    public static int Longest(String s){
        int maxlen =0;
        int n=s.length();

        for(int i=0;i<n;i++){

            for(int j=n-1;j>i;j--){

                if(s.charAt(i)==s.charAt(j)){
                    int len = j -i+1;
                    if(len > maxlen){
                        maxlen = len;
                    }
                    // break;
                }
            }

        }
        return  maxlen;

    }

}


// 17.Given an array of integers, compute the maximum value for each integer in the index, by either summing all
// the digits or multiplying all the digits. (Choose which operation gives the maximum value)
//Input:
//	5
//	120   24   71   10   59
//	Output:
//	3   8   8   1   45
//Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0.
// Thus, maximum of this two is 3.
//


class Compute {
    static void main() {
//        int temp [] = {120,24,71,10,59};

//     int num =120;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value :");

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        int mult = 1;


        for(int x=0;x<arr.length;x++) {

            int num = arr[x];

            sum=0;
            mult=1;

            while (num > 0) {
                int dig = num % 10;



                sum += dig;
                mult *= dig;
                num = num / 10;
//            System.out.print( " " + digit);
            }
            arr[x]=Math.max(sum,mult);

        }
        System.out.println(Arrays.toString(arr));

        int max =Math.max(sum,mult);
        System.out.println("Max Value :" +max);
//        System.out.println( " sum value :" +sum);
//        System.out.println(" Mult Value :" +mult);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ZohoQustions {
    public static void main(String[] args) {

    }
}
// 20. Print longest sequence between same character

//Ex I/p abcccccbba
//O/p 8 (from a to a)
//I/p aaaaaaaa
//O/p 6
//
class LongestSequence{
    public static void main(String[] args) {
        System.out.println(Longest("abccccba"));
        System.out.println(Longest("abausshsjjsnsjhsjdhd"));
        System.out.println(Longest("aaaaaaaaeeeeeeeeeeeeeeeeeeee"));
    }
    public static int Longest(String s){
        int maxlen =0;
        int n=s.length();

        for(int i=0;i<n;i++){

            for(int j=n-1;j>i;j--){

                if(s.charAt(i)==s.charAt(j)){
                    int len = j -i+1;
                    if(len > maxlen){
                        maxlen = len;
                    }
                    // break;
                }
            }

        }
        return  maxlen;

    }

}


// 17.Given an array of integers, compute the maximum value for each integer in the index, by either summing all
// the digits or multiplying all the digits. (Choose which operation gives the maximum value)
//Input:
//	5
//	120   24   71   10   59
//	Output:
//	3   8   8   1   45
//Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0.
// Thus, maximum of this two is 3.
//


class Compute {
    static void main() {
//        int temp [] = {120,24,71,10,59};

//     int num =120;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value :");

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        int mult = 1;


        for(int x=0;x<arr.length;x++) {

            int num = arr[x];

            sum=0;
            mult=1;

            while (num > 0) {
                int dig = num % 10;



                sum += dig;
                mult *= dig;
                num = num / 10;
//            System.out.print( " " + digit);
            }
            arr[x]=Math.max(sum,mult);

        }
        System.out.println(Arrays.toString(arr));

        int max =Math.max(sum,mult);
        System.out.println("Max Value :" +max);
//        System.out.println( " sum value :" +sum);
//        System.out.println(" Mult Value :" +mult);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ZohoQustions {
    public static void main(String[] args) {

    }
}
// 20. Print longest sequence between same character

//Ex I/p abcccccbba
//O/p 8 (from a to a)
//I/p aaaaaaaa
//O/p 6
//
class LongestSequence{
    public static void main(String[] args) {
        System.out.println(Longest("abccccba"));
        System.out.println(Longest("abausshsjjsnsjhsjdhd"));
        System.out.println(Longest("aaaaaaaaeeeeeeeeeeeeeeeeeeee"));
    }
    public static int Longest(String s){
        int maxlen =0;
        int n=s.length();

        for(int i=0;i<n;i++){

            for(int j=n-1;j>i;j--){

                if(s.charAt(i)==s.charAt(j)){
                    int len = j -i+1;
                    if(len > maxlen){
                        maxlen = len;
                    }
                    // break;
                }
            }

        }
        return  maxlen;

    }

}


// 17.Given an array of integers, compute the maximum value for each integer in the index, by either summing all
// the digits or multiplying all the digits. (Choose which operation gives the maximum value)
//Input:
//	5
//	120   24   71   10   59
//	Output:
//	3   8   8   1   45
//Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0.
// Thus, maximum of this two is 3.
//


class Compute {
    static void main() {
//        int temp [] = {120,24,71,10,59};

//     int num =120;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value :");

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        int mult = 1;


        for(int x=0;x<arr.length;x++) {

            int num = arr[x];

            sum=0;
            mult=1;

            while (num > 0) {
                int dig = num % 10;



                sum += dig;
                mult *= dig;
                num = num / 10;
//            System.out.print( " " + digit);
            }
            arr[x]=Math.max(sum,mult);

        }
        System.out.println(Arrays.toString(arr));

        int max =Math.max(sum,mult);
        System.out.println("Max Value :" +max);
//        System.out.println( " sum value :" +sum);
//        System.out.println(" Mult Value :" +mult);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ZohoQustions {
    public static void main(String[] args) {

    }
}
// 20. Print longest sequence between same character

//Ex I/p abcccccbba
//O/p 8 (from a to a)
//I/p aaaaaaaa
//O/p 6
//
class LongestSequence{
    public static void main(String[] args) {
        System.out.println(Longest("abccccba"));
        System.out.println(Longest("abausshsjjsnsjhsjdhd"));
        System.out.println(Longest("aaaaaaaaeeeeeeeeeeeeeeeeeeee"));
    }
    public static int Longest(String s){
        int maxlen =0;
        int n=s.length();

        for(int i=0;i<n;i++){

            for(int j=n-1;j>i;j--){

                if(s.charAt(i)==s.charAt(j)){
                    int len = j -i+1;
                    if(len > maxlen){
                        maxlen = len;
                    }
                    // break;
                }
            }

        }
        return  maxlen;

    }

}


// 17.Given an array of integers, compute the maximum value for each integer in the index, by either summing all
// the digits or multiplying all the digits. (Choose which operation gives the maximum value)
//Input:
//	5
//	120   24   71   10   59
//	Output:
//	3   8   8   1   45
//Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0.
// Thus, maximum of this two is 3.
//


class Compute {
    static void main() {
//        int temp [] = {120,24,71,10,59};

//     int num =120;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value :");

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        int mult = 1;


        for(int x=0;x<arr.length;x++) {

            int num = arr[x];

            sum=0;
            mult=1;

            while (num > 0) {
                int dig = num % 10;



                sum += dig;
                mult *= dig;
                num = num / 10;
//            System.out.print( " " + digit);
            }
            arr[x]=Math.max(sum,mult);

        }
        System.out.println(Arrays.toString(arr));

        int max =Math.max(sum,mult);
        System.out.println("Max Value :" +max);
//        System.out.println( " sum value :" +sum);
//        System.out.println(" Mult Value :" +mult);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ZohoQustions {
    public static void main(String[] args) {

    }
}
// 20. Print longest sequence between same character

//Ex I/p abcccccbba
//O/p 8 (from a to a)
//I/p aaaaaaaa
//O/p 6
//
class LongestSequence{
    public static void main(String[] args) {
        System.out.println(Longest("abccccba"));
        System.out.println(Longest("abausshsjjsnsjhsjdhd"));
        System.out.println(Longest("aaaaaaaaeeeeeeeeeeeeeeeeeeee"));
    }
    public static int Longest(String s){
        int maxlen =0;
        int n=s.length();

        for(int i=0;i<n;i++){

            for(int j=n-1;j>i;j--){

                if(s.charAt(i)==s.charAt(j)){
                    int len = j -i+1;
                    if(len > maxlen){
                        maxlen = len;
                    }
                    // break;
                }
            }

        }
        return  maxlen;

    }

}


// 17.Given an array of integers, compute the maximum value for each integer in the index, by either summing all
// the digits or multiplying all the digits. (Choose which operation gives the maximum value)
//Input:
//	5
//	120   24   71   10   59
//	Output:
//	3   8   8   1   45
//Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0.
// Thus, maximum of this two is 3.
//


class Compute {
    static void main() {
//        int temp [] = {120,24,71,10,59};

//     int num =120;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value :");

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        int mult = 1;


        for(int x=0;x<arr.length;x++) {

            int num = arr[x];

            sum=0;
            mult=1;

            while (num > 0) {
                int dig = num % 10;



                sum += dig;
                mult *= dig;
                num = num / 10;
//            System.out.print( " " + digit);
            }
            arr[x]=Math.max(sum,mult);

        }
        System.out.println(Arrays.toString(arr));

        int max =Math.max(sum,mult);
        System.out.println("Max Value :" +max);
//        System.out.println( " sum value :" +sum);
//        System.out.println(" Mult Value :" +mult);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ZohoQustions {
    public static void main(String[] args) {

    }
}
// 20. Print longest sequence between same character

//Ex I/p abcccccbba
//O/p 8 (from a to a)
//I/p aaaaaaaa
//O/p 6
//
class LongestSequence{
    public static void main(String[] args) {
        System.out.println(Longest("abccccba"));
        System.out.println(Longest("abausshsjjsnsjhsjdhd"));
        System.out.println(Longest("aaaaaaaaeeeeeeeeeeeeeeeeeeee"));
    }
    public static int Longest(String s){
        int maxlen =0;
        int n=s.length();

        for(int i=0;i<n;i++){

            for(int j=n-1;j>i;j--){

                if(s.charAt(i)==s.charAt(j)){
                    int len = j -i+1;
                    if(len > maxlen){
                        maxlen = len;
                    }
                    // break;
                }
            }

        }
        return  maxlen;

    }

}


// 17.Given an array of integers, compute the maximum value for each integer in the index, by either summing all
// the digits or multiplying all the digits. (Choose which operation gives the maximum value)
//Input:
//	5
//	120   24   71   10   59
//	Output:
//	3   8   8   1   45
//Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0.
// Thus, maximum of this two is 3.
//


class Compute {
    static void main() {
//        int temp [] = {120,24,71,10,59};

//     int num =120;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value :");

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        int mult = 1;


        for(int x=0;x<arr.length;x++) {

            int num = arr[x];

            sum=0;
            mult=1;

            while (num > 0) {
                int dig = num % 10;



                sum += dig;
                mult *= dig;
                num = num / 10;
//            System.out.print( " " + digit);
            }
            arr[x]=Math.max(sum,mult);

        }
        System.out.println(Arrays.toString(arr));

        int max =Math.max(sum,mult);
        System.out.println("Max Value :" +max);
//        System.out.println( " sum value :" +sum);
//        System.out.println(" Mult Value :" +mult);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ZohoQustions {
    public static void main(String[] args) {

    }
}
// 20. Print longest sequence between same character

//Ex I/p abcccccbba
//O/p 8 (from a to a)
//I/p aaaaaaaa
//O/p 6
//
class LongestSequence{
    public static void main(String[] args) {
        System.out.println(Longest("abccccba"));
        System.out.println(Longest("abausshsjjsnsjhsjdhd"));
        System.out.println(Longest("aaaaaaaaeeeeeeeeeeeeeeeeeeee"));
    }
    public static int Longest(String s){
        int maxlen =0;
        int n=s.length();

        for(int i=0;i<n;i++){

            for(int j=n-1;j>i;j--){

                if(s.charAt(i)==s.charAt(j)){
                    int len = j -i+1;
                    if(len > maxlen){
                        maxlen = len;
                    }
                    // break;
                }
            }

        }
        return  maxlen;

    }

}


// 17.Given an array of integers, compute the maximum value for each integer in the index, by either summing all
// the digits or multiplying all the digits. (Choose which operation gives the maximum value)
//Input:
//	5
//	120   24   71   10   59
//	Output:
//	3   8   8   1   45
//Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0.
// Thus, maximum of this two is 3.
//


class Compute {
    static void main() {
//        int temp [] = {120,24,71,10,59};

//     int num =120;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value :");

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        int mult = 1;


        for(int x=0;x<arr.length;x++) {

            int num = arr[x];

            sum=0;
            mult=1;

            while (num > 0) {
                int dig = num % 10;



                sum += dig;
                mult *= dig;
                num = num / 10;
//            System.out.print( " " + digit);
            }
            arr[x]=Math.max(sum,mult);

        }
        System.out.println(Arrays.toString(arr));

        int max =Math.max(sum,mult);
        System.out.println("Max Value :" +max);
//        System.out.println( " sum value :" +sum);
//        System.out.println(" Mult Value :" +mult);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ZohoQustions {
    public static void main(String[] args) {

    }
}
// 20. Print longest sequence between same character

//Ex I/p abcccccbba
//O/p 8 (from a to a)
//I/p aaaaaaaa
//O/p 6
//
class LongestSequence{
    public static void main(String[] args) {
        System.out.println(Longest("abccccba"));
        System.out.println(Longest("abausshsjjsnsjhsjdhd"));
        System.out.println(Longest("aaaaaaaaeeeeeeeeeeeeeeeeeeee"));
    }
    public static int Longest(String s){
        int maxlen =0;
        int n=s.length();

        for(int i=0;i<n;i++){

            for(int j=n-1;j>i;j--){

                if(s.charAt(i)==s.charAt(j)){
                    int len = j -i+1;
                    if(len > maxlen){
                        maxlen = len;
                    }
                    // break;
                }
            }

        }
        return  maxlen;

    }

}


// 17.Given an array of integers, compute the maximum value for each integer in the index, by either summing all
// the digits or multiplying all the digits. (Choose which operation gives the maximum value)
//Input:
//	5
//	120   24   71   10   59
//	Output:
//	3   8   8   1   45
//Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0.
// Thus, maximum of this two is 3.
//


class Compute {
    static void main() {
//        int temp [] = {120,24,71,10,59};

//     int num =120;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value :");

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        int mult = 1;


        for(int x=0;x<arr.length;x++) {

            int num = arr[x];

            sum=0;
            mult=1;

            while (num > 0) {
                int dig = num % 10;



                sum += dig;
                mult *= dig;
                num = num / 10;
//            System.out.print( " " + digit);
            }
            arr[x]=Math.max(sum,mult);

        }
        System.out.println(Arrays.toString(arr));

        int max =Math.max(sum,mult);
        System.out.println("Max Value :" +max);
//        System.out.println( " sum value :" +sum);
//        System.out.println(" Mult Value :" +mult);
    }
}