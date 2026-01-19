
//Buddy String
public class DAY2 {

    public  static  boolean Buddy(String s,String gols){

        char [] arr = s.toCharArray();
        int i=0,j=arr.length-1;

        while(i<j){
            char swap = arr[i];
            arr[i]=arr[j];
            arr[j]=swap;
            i++;
            j--;

            StringBuffer sb = new StringBuffer();

            for(char c : arr){
                sb.append(c);

            }

            String res = sb.toString();

            if(res.equals(gols)){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {

        String s = "aa";
        String gols ="aa";

        System.out.println(Buddy(s,gols));


    }

}


// Problem of the Day: Remove Duplicate Characters and Digits with Different Rules
//You are given a string s consisting of lowercase English letters and digits (0–9).
//You must transform the string in two steps:
//Characters (a–z):
//Traverse from left to right.
//Keep only the first occurrence of each character.
//Remove all later duplicates.
//Digits (0–9):
//Traverse from right to left.
//Keep only the first digit you encounter (the rightmost occurrence in the original string).
//Remove earlier duplicates.
//Return the final transformed string.

// 1.Input: programming123321
//After Step1: progamin123321
//Final: progamin321
//(keeps the rightmost 1,2,3 — final digits appear as the left-to-right order of their last occurrences)   (16-09-2025)====

class RemoveDuplicate {
    public static void main(String[] args) throws Exception {
        String s = "programming";
        String b ="a1b2c1d2e3";
        System.out.println(Result(s));
        System.out.println(Result(b));
    }

    public static String Result(String s) {
        char[] c = s.toCharArray();
        String result = "";

        int i = 0;
        while (i < c.length) {
            boolean found = false;
            int j = 0;

            while (j < result.length()) {
                if (c[i] == result.charAt(j)) {
                    found = true;
                    break;
                }
                j++;
            }

            if (!found) {
                result = result + c[i];
            }

            i++;
        }

        return result;
    }
}

// This is Result Answer The Qustions=================================================================


class Lable {
    public static void main(String[] args) throws  Exception{

        String input =" programming123321";


        selvin : for (int i=0;i<input.length();i++){

            if(input.charAt(i) >=97 && input.charAt(i) <=122){

                for(int j=0;j<i;j++){

                    if(input.charAt(j)==input.charAt(i)){

                        continue  selvin;
                    }
                }
                System.out.print(input.charAt(i));
            } else {
                for(int j=i+1;j<input.length();j++){
                    if(input.charAt(j)==input.charAt(i)){

                        continue  selvin;
                    }
                }
                System.out.print(input.charAt(i));
            }

        }
        System.out.println();
    }
}


// 56

class RemovString {
    public static void main(String[] args) {
        String s = "expErlence";
        String s1 = "En";
        String result = "";

        int i = 0;
        while (i < s.length()) {
            boolean mat = false;
            for (int j = 0; j < s1.length(); j++) {
                if (s.charAt(i) == s1.charAt(j)) {
                    mat= true;
                    break;
                }
            }
            if (!mat) {
                result = result + s.charAt(i);
            }
            i++;
        }

        System.out.println(result);
    }
}

class RemovString2 {
    public static void main(String[] args) {
        String s = "expErlence";
        String s1 = "En";

        boolean arr [] = new boolean[128];


        for(int i=0;i<s1.length();i++){

            arr[s1.charAt(i)]=true;
        }

        for(int i=0;i<s.length();i++){
            if(!arr[s.charAt(i)]){
                System.out.print(s.charAt(i));
            }
        }


    }
}

