import java.util.*;

public class DAY4 {
    public static void main(String[] args) {
//        int [] people ={3,2,2,1};
        int [] people={3,5,3,4};
        int limit =4;
         Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int boats=0;

        while(left<=right){

            if(people[left] + people[right] <=limit){
                left++;
            }
            right--;
            boats++;
        }
        System.out.println("Boats Value :" +boats);
    }
}

//// Compare
//
//class Compare {
//    public static void main(String[] args) {
//        String s ="1.0";
//        String s1 ="1.10";
//        System.out.println(Com(s,s1));
//    }
//    public static int Com(String s,String s1){
//
//       String b="";
//       String c="";
//
//
//    }
//}
//
//50 Problem Statement
//Given two strings main and sub, determine whether sub is a substring of main.
//
//You must implement the check manually without using built-in substring functions (such as contains(), indexOf() (10.09.2025)
// // , or substring()) from Java libraries.

class SubString {
    public static void main(String[] args) {
        String main ="abcdef";
        String sub ="gh";
        String main1="hello";
        String sub1="ell";

        System.out.println(sub(main,sub));
        System.out.println(sub(main1,sub1));

    }

    public static boolean sub (String main ,String sub){

        char [] c = main.toCharArray();
        char [] c1 = sub.toCharArray();


        int i=0,j=0;

        while(i<c.length){

            if(c[i]==c1[j]){
                i++;
                j++;

                if(j==c1.length){
                    return true;
                }


            } else {
              i++;
              j=0;

            }
        }
        return false;
    }
}


// roblem is to sort an array of strings lexicographically (dictionary order)
// without using built-in sort functions like Arrays.sort().

class Lexicogra{
    public static void main(String[] args) {

        String input [] = {"zebra", "apple", "mango","ball", "cat","dog", "elephant", "fish", "ant", "bat"};

        for(int i=0;i< input.length;i++)
        {
            for(int j=i+1;j< input.length;j++)
            {
                if(Function(input[i],input[j]))
                {

                    String swap = input[i];
                    input[i]=input[j];
                    input[j]=swap;
                }
            }
        }
        for (String word : input){
            System.out.print( " " +word);
        }
    }
    public static boolean Function(String a,String b){

        int min =Math.min(a.length(),b.length());

        for(int i=0;i<min;i++){

            if(a.charAt(i) > b.charAt(i)){
                return true;

            } else if (a.charAt(i) < b.charAt(i)) {

                return  false;

            }
        }
        return a.length() > b.length();
    }
}

