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
}