package Exam_23_12_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
