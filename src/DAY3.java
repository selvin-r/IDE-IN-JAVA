import java.util.Arrays;

public class DAY3 {
    public static void main(String[] args) {

    }
}



class Solution {
    public static void main(String[] args)  throws Exception{
        int arr[] = {2};
        int arr1[] = {1};

        int n = 0;
        int m = 0;

        int i = 0, j = 0;


        while(i<arr.length || j<arr1.length) {

            n = (i<arr.length)?arr[i]:Integer.MAX_VALUE;
            m = (j<arr1.length)?arr1[j]:Integer.MAX_VALUE;
            if (n < m) {
                System.out.print(n + " ");
                i++;
            } else if (m < n) {
                System.out.print(m + " ");
                j++;

            } else {
                System.out.print(n + " ");
                i++;
                j++;
            }
        }
    }

    public char kthCharacter(int k) {
        return 0;
    }

    public boolean longestIncreasingPath(int[][] matrix) {
        return false;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return 0;
    }
}

// 57. Largest Substring Between Two Equal Characters  (24-09-25)===========
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.
//
//A substring is a contiguous sequence of characters within a string.
//
//
//
//Example 1:
//
//Input: s = "aa"
//Output: 0
//Explanation: The optimal substring here is an empty substring between the two 'a's.


class Two {
    public static void main(String[] args) {

        String s ="abcccccbba";
        String s1="aaaaaa";

        System.out.println(TwoEqual(s));
        System.out.println(TwoEqual(s1));

    }

    public static  int TwoEqual(String s){

        int n = s.length();
        int f=0;
        int l=0;
        int max=0;

        char c;

        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
//            System.out.print(c);

            f=s.indexOf(c);
            l=s.lastIndexOf(c);

            if(f!=l){
                max=Math.max(max,l-f-1);
            }

        }
       return max;
    }
}