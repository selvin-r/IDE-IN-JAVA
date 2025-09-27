import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LeetCode {
    public static void main(String[] args) {

    }
}

// 1935. Maximum Number of Words You Can Type  (Date 15-09-20025 )===========================================

class MaxNumber{
    public static void main(String[] args)  throws Exception {

        String text ="hello World";
        String brokenLetters = "ad";
        String text1 = "leet code",brokenLetters1 = "lt";

       String text2 = "leet code", brokenLetters2 = "e";

        System.out.println(" Test Case one  count " +Count(text,brokenLetters));
        System.out.println(" Test Case Two  count " +Count(text1,brokenLetters1));
        System.out.println("Test Case 3  count " +Count(text2,brokenLetters2));

    }
    public static int Count(String text,String brokenletters){

        Set<Character> sb = new HashSet<>();

        for(char c : brokenletters.toCharArray()){
            sb.add(c);

        }
        String [] arr = text.split(" ");
        int sum=0;

        for(String world : arr){
            boolean value =true;

            for(char s : world.toCharArray()){
                if(sb.contains(s)){
                    value=false;
                    break;
                }

            }
            if(value){
                sum++;
            }
        }

   return sum;

    }
}

// 191. Number of 1 Bits

class NumberBits {
    public static void main(String[] args) {
        int testcase1=11;
        int testcase2=128;
        int testcase3=2147483645;
        System.out.println(Bits(testcase1));
        System.out.println(Bits(testcase2));
        System.out.println(Bits(testcase3));
    }

    public static int Bits(int n){

        int count=0;
        String s=Integer.toBinaryString(n);

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}

// 204. Count Primes (Sieve of Eratosthenes algorithm) (26-09-25)

class CountPrimes {
    public static void main(String[] args) {

        int testcase1=10;
        int testcase2=0;

        System.out.println(Primes(testcase1));
        System.out.println(Primes(testcase2));

    }

    public static  int Primes(int n){

        boolean check [] = new boolean[n];

        int limit = (int) Math.sqrt(n);

        for(int i=2;i<=limit;i++){

            if(check[i]==false){

                for(int j=i*i;j<n;j+=i){
                    check[j]=true;
                }
            }
        }
        int count=0;

        for(int i=2;i<n;i++){
            if(check[i]==false){
                count++;
            }
        }
   return count;
    }
}

// 70. Climbing Stairs DP (26-09-2025)

class  ClimbingStairs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();


        Stairs sol = new Stairs();
        int ways = sol.climbStairs(n);


        System.out.println("Number of ways to climb stairs: " + ways);
    }
}


class Stairs{
    public int climbStairs(int n) {
        if(n <= 1){
            return 1;
        }
        int arr[] = new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i = 2; i <= n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}


// 209. Minimum Size Subarray Sum  (27-09-2025)=========================================================================

//Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
//
//
//
//        Example 1:
//
//Input: target = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: The subarray [4,3] has the minimal length under the problem constraint.
//Example 2:
//
//Input: target = 4, nums = [1,4,4]
//Output: 1
//Example 3:
//
//Input: target = 11, nums = [1,1,1,1,1,1,1,1]
//Output: 0

class MinimumSize{
    public static void main(String[] args) {

        int testcase1 [] ={2,3,1,2,4,3};
        int target1 =7;
        int [] testcase2= {1,4,4};
        int target2 = 4;

        int testcase3 [] ={1,1,1,1,1,1,1,1};
        int target3 =11;

        System.out.println(SubarraySum(testcase1,target1));
        System.out.println(SubarraySum(testcase2,target2));
        System.out.println(SubarraySum(testcase3,target3));
    }

    public static int  SubarraySum(int [] nums ,int target){

        int left=0,right=0,sum=0,min=Integer.MAX_VALUE;

        while (right < nums.length){

            sum +=nums[right];

            while (sum >= target){

                min=Math.min(min,right - left +1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return  (min==Integer.MAX_VALUE) ?0: min;
    }
}

// 150. Evaluate Reverse Polish Notation (27-09-2025)===================================================================

//You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
//
//Evaluate the expression. Return an integer that represents the value of the expression.
//
//Note that:
//
//The valid operators are '+', '-', '*', and '/'.
//Each operand may be an integer or another expression.
//The division between two integers always truncates toward zero.
//There will not be any division by zero.
//The input represents a valid arithmetic expression in a reverse polish notation.
//The answer and all the intermediate calculations can be represented in a 32-bit integer.
//
//
//Example 1:
//
//Input: tokens = ["2","1","+","3","*"]
//Output: 9
//Explanation: ((2 + 1) * 3) = 9
//Example 2:
//
//Input: tokens = ["4","13","5","/","+"]
//Output: 6
//Explanation: (4 + (13 / 5)) = 6
//Example 3:
//
//Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
//Output: 22
//Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
//        = ((10 * (6 / (12 * -11))) + 17) + 5
//        = ((10 * (6 / -132)) + 17) + 5
//        = ((10 * 0) + 17) + 5
//        = (0 + 17) + 5
//        = 17 + 5
//        = 22


class Evaluate {
    public static void main(String[] args) {
        String testcase1 [] = {"2","1","+","3","*"};
        String testcase2 [] ={"4","13","5","/","+"};
        String testcase3 [] ={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(ReversePolish(testcase1));
        System.out.println(ReversePolish(testcase2));
        System.out.println(ReversePolish(testcase3));
    }

    public static int ReversePolish (String str []){

        int res [] = new int[str.length/2+1];
        int i=0;

        for(String poin : str){

            switch (poin){
                case "+":
                    res[i-2]=res[i-2] + res[i-1];
                    i--;
                    break;

                case "-":
                    res[i-2]=res[i-2]-res[i-1];
                    i--;
                    break;
                case  "*":
                    res[i-2]=res[i-2]*res[i-1];
                    i--;
                    break;
                case  "/":
                    res[i-2]=res[i-2]/res[i-1];
                    i--;
                    break;
                default:
                    res[i++]=Integer.parseInt(poin);
                    break;

            }
        }
      return res[0];
    }
}

// 1652. Defuse the Bomb (27-09-2025)===================================================================================

//You have a bomb to defuse, and your time is running out! Your informer will provide you with
//a circular array code of length of n and a key k.
//
//To decrypt the code, you must replace every number. All the numbers are replaced simultaneously.
//
//If k > 0, replace the ith number with the sum of the next k numbers.
//If k < 0, replace the ith number with the sum of the previous k numbers.
//If k == 0, replace the ith number with 0.
//As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].
//
//Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!
//
//
//
//Example 1:
//
//Input: code = [5,7,1,4], k = 3
//Output: [12,10,16,13]
//Explanation: Each number is replaced by the sum of the next 3 numbers. The decrypted code is [7+1+4, 1+4+5, 4+5+7, 5+7+1].
// Notice that the numbers wrap around.
//Example 2:
//
//Input: code = [1,2,3,4], k = 0
//Output: [0,0,0,0]
//Explanation: When k is zero, the numbers are replaced by 0.
//Example 3:
//
//Input: code = [2,4,9,3], k = -2
//Output: [12,5,6,13]
//Explanation: The decrypted code is [3+9, 2+3, 4+2, 9+4]. Notice that the numbers wrap around again. If k is negative,
// the sum is of the previous numbers.


class DefuseBomb {
    public static void main(String[] args) {

        int testcase1 [] = {5,7,1,4};
        int k1 =2;
        int testcase2 [] ={1,2,3,4};
        int k2 =0;
        int testcase3 [] ={2,4,9,3};
        int k3=-2;
        System.out.println(Arrays.toString(Bomb(testcase1,k1)));
      System.out.println(Arrays.toString(Bomb(testcase2,k2)));
        System.out.println(Arrays.toString(Bomb(testcase3,k3)));
    }

    public static  int[] Bomb(int arr [] ,int k){

        int n= arr.length;
        int[] result  = new int[n];



        for(int i=0;i<n;i++){

            if(k >0){
                int sum=0;

                for(int j=1;j<=k;j++){
                    sum += arr[(i+j)%n];
                        result[i]=sum;
                }
            }
            if(k<0){
                int sum=0;
                int start = i+n+k;
                int count = 0;
                for(int j=start;count<Math.abs(k);j++,count++){
                    sum +=arr[j%n];
                    result[i]=sum;

                }
            }
        }
       return  result;
    }
}