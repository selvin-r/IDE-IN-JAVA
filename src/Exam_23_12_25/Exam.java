package Exam_23_12_25;

import java.util.*;

public class Exam {
    static void main() {

    }
}


// Two lists of integers are given. Write a program to merge the two lists and sort the resulting list in descending
// order.


class MergeList{
    static void main() {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));

        list1.addAll(list2);

        Collections.sort(list1,Collections.reverseOrder());


        System.out.println(list1);

    }
}


// A list of strings is given. Sort the list based on the length of the strings. If two strings have the same length,
// sort them in lexicographical (dictionary) order.


class Lexicographical{
    static void main() {

        List<String> sb = new ArrayList<>(Arrays.asList("apple", "bat", "banana", "cat", "ant"));



        Collections.sort(sb, (a,b)->{


            if(a.length() !=b.length()){
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });
        System.out.println(sb);
    }
}


// Given a string s, remove adjacent duplicate words while preserving the order and keeping
// the first occurrence of each word



class RemoveDuplicates{
    static void main() {

        String s = "hello hello world world world java java Selvin";

        String word [] = s.split(" ");

        StringBuffer sb = new StringBuffer();

        String prv="";

        for(String words : word){

            if(!words.equals(prv)){

                sb.append(words + " ");
                prv =words;
            }
        }

        System.out.println(sb);
    }
}

// Given a string `s`, find the first non-repeating character in it and return that character.

class FirstNonRepeatingChar {
    public static void main(String[] args) {

        String s = "swiss";
        int[] count = new int[256];

        for (char c : s.toCharArray()) {
            count[c]++;
        }

        char result = '\0';
        for (char c : s.toCharArray()) {
            if (count[c] == 1) {
                result = c;
                break;
            }
        }

        System.out.println(result);
    }
}

// Qustions Zoho

// Password Strength Validator – Question    (24-12-25)==========================================
//
//Write a Java program to validate the strength of a password based on the following rules.
//
//Scoring Criteria
//
//Score 21–40 : Weak
//
//Score 41–60 : Fair
//
//Score 61–75 : Good
//
//Score 76–90 : Strong
//
//Score 91–100 : Very Strong
//
//Special Characters Allowed
//! @ # $ % ^ & * ( ) _ - = + [ ] { } | ; : ' " , . < > / ?
//
//Password Restrictions
//
//Minimum length: 7 characters (but will get a low score)
//
//Maximum length: 20 characters
//
//Spaces are not allowed in the password
//
//Password must not be a common password
//
//Common passwords list:
//
//Password@1
//
//123456@Az
//
//@Aqwerty
//
//abcdefgh@1Q


class PasswordCheck{
    static void main() {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String password = Scan.nextLine();


        System.out.println(CheckPassword(password));
    }
    static String CheckPassword(String pass){

        int score=0;


        if(pass.length()<7 || pass.length() >20){
            return "Invalid Password";
        }
        if(pass.contains(" ")){
            return "Invalid Password";
        }

        boolean upper=false,lower=false,number=false,special=false;


        for(int i=0;i<pass.length();i++)
        {
            char c = pass.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                upper = true;
            } else if (c >= 'a' && c <= 'z') {
                lower = true;
            } else if (c >= '0' && c <= '9') {
                number = true;
            } else
                special = true;
        }

        if(upper){
            score +=10;
        }if(lower){
            score +=10;
        } if(number){
            score +=10;
        }
        if(special){
            score +=20;
        }
        score +=pass.length() *2;


        if(score >=91){

            return "very Strong";
        } else if (score >=76) {
            return "Strong";
        } else if(score >=61) {
            return "Good";
        } else if(score >=41){
            return "Fair";
        } else
            return "Weak";
    }
}