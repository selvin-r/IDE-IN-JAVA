public class Hackerrank {
    public static void main(String[] args) {

    }
}

//If we list all the natural numbers below  that are multiples of  or , we get  and . The sum of these multiples is .
//
//Find the sum of all the multiples of  or  below .
//
//Input Format
//
//First line contains  that denotes the number of test cases. This is followed by  lines, each containing an integer, .
//
//Constraints
//
//Output Format
//
//For each test case, print an integer that denotes the sum of all the multiples of  or  below .
//
//Sample Input 0
//
//2
//10
//100
//Sample Output 0
//
//23
//2318

class Natural{
    public static void main(String[] args) {
        int t=2;
        int n = 100;

        while(t-->0){
            int sum=0;

            for(int i=0;i<n;i++){
                if(i%3==0 || i%5==0){
                    sum +=i;
                }
            }
            System.out.println(sum);

        }

    }
}

// Funny String=====================

//In this challenge, you will determine whether a string is funny or not. To determine whether a
// string is funny, create a copy of the string in reverse e.g. . Iterating through each string,
// compare the absolute difference in the ascii values of the characters at positions 0 and
// 1, 1 and 2 and so on to the end. If the list of absolute differences is the same for both strings, they are funny.
//
//Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.
//
//Example
//
//The ordinal values of the charcters are .  and the ordinals are . The absolute differences of
// the adjacent elements for both strings are , so the answer is Funny.
//
//        Function Description
//
//Complete the funnyString function in the editor below.
//
//funnyString has the following parameter(s):
//
//string s: a string to test
//Returns
//
//string: either Funny or Not Funny
//Input Format
//
//The first line contains an integer , the number of queries.
//The next  lines each contain a string, .
//
//Constraints
//
//Sample Input
//
//STDIN   Function
//-----   --------
//        2       q = 2
//acxz    s = 'acxz'
//bcxz    s = 'bcxz'
//Sample Output
//
//Funny
//Not Funny


class FunnyString {
    public static void main(String[] args) {
        String s = "acxzww";
        System.out.println(Funny(s));
    }

    public static  String Funny(String s){

        int left=0;
        int right=s.length()-1;

        while (left < s.length()-1){

            if(Math.abs(s.charAt(left)-s.charAt(left+1)) != Math.abs(s.charAt(right)-s.charAt(right-1))){


                return "Not Funny";
            }
            left++;
            right--;
        }
        return "Funny";
    }
}

class HackerrankString {
    public static void main(String[] args) {
        String c = "haacckkerrannkk";
        System.out.println(Hackrrank(c));
    }

    public static String Hackrrank(String c) {
        String s = "hackerrank";
        int right = 0;

        for (int left = 0; left < c.length(); left++) {
            if (right < s.length() && c.charAt(left) == s.charAt(right)) {
                right++;
            }
        }

        if (right == s.length()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
