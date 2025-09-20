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



// Q 53   🧩 Problem Statement: String Group Rotation
//You are given a string s and an integer k. Your task is to transform the string in the following way:
//- Split the string into groups of size k, starting from index 0.
//- For each group:
//- Rotate the group to the left by 1 character (i.e., move the first character to the end).
//- If the last group has fewer than k characters, still apply the same rotation.
//- Finally, return the new transformed string.
//
// Examples
//Example 1:
//Input:
//String str1 = "ZohoCorporations"
//k = 3
//
//Output:
//"hoZoCooprtarnois"
//
//
//Example 2:
//Input:
//String str1 = "Hellokid"
//k = 2
//
//Output:
//"eHllikod"



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



class TransForm1{
    public static void main(String[] args) {
        String s = "zohocorporation";
        int k = 5;

        char[] c = s.toCharArray();
        int n = c.length;
        char[] result = new char[n]; // final output array
        int index = 0; // pointer for result array

        int left = 0;

        while (left < n) {
            int right = Math.min(left + k, n); // handle last group safely

            // Rotate left by 1: move chars from left+1 to right-1, then add c[left] at the end
            for (int i = left + 1; i < right; i++) {
                result[index++] = c[i];
            }
            result[index++] = c[left]; // first char goes last

            left += k;
        }

        System.out.println(new String(result));
    }
}

// 54 🧠 Problem Statement
//You are given an integer array nums.
//- First, count the frequency of each distinct number in the array.
//- Then, for each frequency f, compute the sum of all numbers in the array that appear exactly f times.
//- Return a mapping (or any suitable output format) where:
//- Key = frequency
//- Value = sum of elements that occur with that frequency
//
//📥 Example 1
//Input:
//nums = [1,1,1,2,2,2,3,3,5,5]
//Output:
//1 -> 9
//3 -> 7
//
//
//Explanation:
//- Number 7 occurs 1 time → contributes to frequency 1 sum.
//- Numbers {3,3,5,5} occur 2 times each → sum = 3 + 3 + 5 + 5 = 16
//- Numbers {1,1,1,2,2,2} occur 3 times each → sum = 1 + 1 + 1 + 2 + 2 + 2 = 9
//
//📥 Example 2
//Input:
//nums = [1,1,1,2,2,2,3]
//Output:
//1 -> 3
//3 -> 9

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int[] nums={1,7,1,1,2,2,2,3,3,5,5};

        HashMap<Integer,Integer> map1=new HashMap<>();

        for(int n:nums){
            map1.put(n,map1.getOrDefault(n,0)+1);
        }

        HashMap<Integer,Integer> map2=new HashMap<>();

        for(Map.Entry<Integer,Integer> entry:map1.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();

            map2.put(freq,map2.getOrDefault(freq,0)+num);
        }

        for(Map.Entry<Integer,Integer> entry:map2.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue()*entry.getKey());
        }

    }
}
