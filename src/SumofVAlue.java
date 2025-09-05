import com.sun.source.tree.Tree;

import java.util.*;
import java.util.Arrays;
import java.util.function.Function;

public class SumofVAlue {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 7, 6};
        int sum = 0;
        for (int c : arr) {
            sum += c;
        }

        int left = 0;

        for (int i = 0; i < arr.length; i++) {

            int right = sum - left - arr[i];

            if (left == right) {
                System.out.println(" true ");
              System  .out.println(" Value " + arr[i]);

            }

            left += arr[i];

        }
        System.out.println(" Not value :");

    }
}
// 75. Sort Colors

class Colors {
    public static void main(String[] args) {
        int nums []={0,0,1,2,0,2,1,0,2,1,2};
        Colors c = new Colors();
        c.SortColor(nums);
        System.out.println("" +Arrays.toString(nums));


    }
    public void SortColor(int[] nums){

        int i=0,m=0,r=nums.length-1;

        while(m<r){
            if(nums[m]==0){
                swap(nums,m,i);
                m++;
                i++;
            } else if(nums[m]==1){
                m++;
            } else {
                swap(nums,m,r);
                m++;
                r--;
            }
        }
    }
    private  void swap(int[] nums,int first,int second){

        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }


}

// 455. Assign Cookies

class Cookies {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] ={1,2,3};

        Cookies c = new Cookies();
      int result=  c.Cookies(a,b);
        System.out.printf("" + result);


    }
    public int Cookies(int[] a,int b[]) {

        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0,n=a.length,m=b.length;

        while(i<n && j<m){

            if(a[i] <= b[j]){
                i++;

            }
            j++;

        }
        return i;
    }
}


// 557. Reverse Words in a String III
class Reverse {
    public static void main(String[] args) {
        String s = "Mr Ding";
        Reverse sol = new Reverse();
        String result = sol.reverseWords(s);
        System.out.println(result);
    }

    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;

        for (int i = 0; i < len; i++) {
            int start = i;


            while (i < len && chars[i] != ' ') {
                i++;
            }

            int end = i - 1;

            while (start < end) {
                char tmp = chars[start];
                chars[start++] = chars[end];
                chars[end--] = tmp;
            }
        }

        return new String(chars);
    }
}

// Sort Binary using Travel

class SortBinary{
    public static void main(String[] args) {

        int arr[] ={1,0,1,0,1,0,1,0};

        int l=0;
        int r=arr.length-1;

        while(l<r){

            if(arr[l]==0){
                l++;

            } else if(arr[r]==1){
                r--;
            }
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;


        }
        System.out.printf("" + Arrays.toString(arr));


    }
}

class Compresser {
    public static void main(String[] args) {
        char arr [] ={'a','a','b','b','c','c'};
        Compresser c = new Compresser();
        c.Compersser(arr);
        System.out.println("");

    }
    public  static  int Compersser(char[]arr){

        int i=0,j=0,k=1,n= arr.length;
        int count=0;
        while(j<n){


            if(arr[i]==arr[j]){
                count++;
                j++;
            }else if(arr[i] !=arr[j]){
                //char c =(char) count;
              //  System.out.println("" +c);
                arr[k] =(char)('0' + count);
                count=0;
                k++;
                arr[k]=arr[j];
                k++;
            }
            i=j;
        }
        return k;
    }
}

// Given Two Array Find the union

class Union {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();

       Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n size :");
         int n =scan.nextInt();
         int arr [] = new int[n];
         System.out.println("Enter the n1 size :");
         int n1= scan.nextInt();
         int arr1 [] = new int[n1];

       for(int i=0;i<n;i++){
           arr[i] = scan.nextInt();

       }
       for(int i=0;i<n1;i++){
           arr1[i]=scan.nextInt();

       }

        for(int i : arr){
            h.add(i);
        }
        for(int j : arr1){
            h.add(j);
        }
        for(int nums : h){
            System.out.println(" " +nums);
        }

    }
}
class Print {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n value :");
        int n = scan.nextInt();
        int sum=1;
        for(int i=0;i<n;i++) {
            int value =sum;

            for (int j =0; j < n-i; j++) {
                if(j==0){
                    if(sum >9){
                        System.out.print(sum +" ");
                    }else {
                        System.out.print(sum + " ");
                    }
                } else {
                    if(value +j+i>9){
                        System.out.print(value+i+j+"");
                    }else {
                        System.out.print(value +j+i+"");
                        value += j +i+1;
                    }
                }


            }
            System.out.println();

        }

    }
}

class NumberPattern {
    public static void main(String[] args) {
        int n = 6;
        int num = 1;

        for (int row = 0; row < n; row++) {
            int value = num;

            for (int col = 0; col < n-row; col++) {
                System.out.print(value + " ");
                value += col + row +1;
            }

            System.out.println();
            num += row;
        }
    }
}

class Paper{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n Number :");
         int n =scan.nextInt();

         StringBuffer st = new StringBuffer();

        for(int i=1;i<=13;i++){

            st.append(i);
        }
        System.out.println(st.length());
    }
}


class Greater {
    public static void main(String[] args) {

        int arr [] = {-1,2,-3,-4,5,9,7,8,100};
//        int arr [] ={5,4,3,2,1};

        int i=0;
        int j=1;
        System.out.print(arr[i]+" ");

        while(j< arr.length)
        {
            if(arr[j] > arr[i])
            {
                System.out.print(arr[j]+" ");
                i=j;
            }
            else
            {
                j++;
            }
        }
    }
}

// NumberPattern

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an even number n: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int start = 0, end = n - 1;
        int num = n;

        while (start <= end) {
            for (int i = start; i <= end; i++) {
                for (int j = start; j <= end; j++) {
                    if (i == start || i == end || j == start || j == end) {
                        arr[i][j] = num;
                    }
                }
            }
            start++;
            end--;
            num--;
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}


class Digit {
    public static void main(String[] args) {
      StringBuffer st = new StringBuffer();

        int arr =23;
        int sum=0;
            int num = arr % 10;
            st.append(num);

           int  nums = arr/10;
              st.append(nums);

        }

    }

class Main {
    public static void main(String[] args) {
        int n = 6;
        int count = 0;
        int num = 3;
        while(count < n)
        {
            String str = Integer.toString(num);
            int len = len34(str);
            if(str.length() == len)
            {
                count++;
            }
            if(count == n)
            {
                System.out.println(str);
            }
            num++;
        }
    }
    public static int len34(String str)
    {
        int len = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '3'||str.charAt(i) == '4')
            {
                len++;
            }
        }
        return len;
    }
}

class Windows{
    public static void main(String[] args) {

        int arr[] ={2,2,2};
        int k=2;

        System.out.println(count(arr,k));

    }

    public static int count(int [] arr,int k){

        int win=0;
        int n= arr.length;

        for(int i=0;i<k;i++){
            win +=arr[i];
        }
        int max =win;

        for(int i=k;i<n;i++){
            win +=arr[i] -arr[i-k];
            max=Math.max(win,max);
        }
     return max;


    }

}

