import java.util.Scanner;
import java.util.*;

// NTH Digit
public class DAY6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n Value :");
        int n = scan.nextInt();
        StringBuilder st = new StringBuilder();
        for(int i=1;i<=n;i++){
            st.append(i);

        }
        System.out.println(st.charAt(n-1));

    }
}

// Largest Number

class LargestNumber {
    public static void main(String[] args) {
        int nums[] = {10, 2};

        System.out.println(largest(nums));
    }

    public static String largest(int nums[]) {
        int n = nums.length;
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        java.util.Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder s = new StringBuilder();
        for (String c : arr) {
            s.append(c);
        }


        return s.toString();
    }
}


// Move all zero to the End

class MergeArray {
    public static int[] Zeros(int[] arr) {
        int n = arr.length;


        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] = arr[i] + arr[i + 1];
                arr[i + 1] = 0;
            }
        }

        int index=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < n) {
            arr[index++] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 2, 2, 0, 6, 6, 0, 8};
        int[] arr2 = {2, 2, 4, 0, 4, 4};

        System.out.println(Arrays.toString(Zeros(arr1)));
        System.out.println(Arrays.toString(Zeros(arr2)));
    }
}



// First MaxNumber and Second MinNumber

class MaxMin {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(Maxmin(arr)));
    }

    public static int [] Maxmin(int []arr){

        int arr1[]=new int[arr.length];

        int l=0,r=arr.length-1,val=0;

        while(l<=r) {

            if (l < r) {

                arr1[val++] = arr[r];
                arr1[val++] = arr[l];


            } else {

                arr1[val] = arr[l];


            }
            r--;
            l++;
        }
        return arr1;
    }
}


class swap {
    public static void main(String[] args) {
        int [] arr ={6,8,7,1,2,3};
        int [] arr2 ={1,2,3,4,5,6};

        System.out.println(Arrays.toString(swapa(arr)));
        System.out.println(Arrays.toString(swapa(arr2)));

    }

    public static int [] swapa(int []arr){

        int left=0,right=arr.length-1;


        while (left<=right){

            if(left %2==0){
                  int i=left;
                while(i<arr.length){
                     if(arr[left] < arr[i]){

                         int temp = arr[i];
                         arr[i]=arr[left];
                         arr[left]=temp;

                     }
                    i++;
                }


            } else {
                int j=left;
                while (j<arr.length){

                    if(arr[left] > arr[j]){

                        int temp = arr[j];
                        arr[j]=arr[left];
                        arr[left]=temp;
                    }
                    j++;
                }

            }
            left++;

        }

        return arr;
    }
}



// Q 53



class TransForm {
    public static void main(String[] args) {
         String s ="zohocorporation";
         int k = 5;
//        String s = "Hellokid";
        char[] c = s.toCharArray();

        int left = 0;
        int right = k-1;

        while (right <= c.length) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            left += k;
            right += k;
        }

        System.out.println(Arrays.toString(c));
    }
}