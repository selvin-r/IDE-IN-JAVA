import java.util.*;

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


// 71. Simplify Path (29-09-2025)===============================================================================
//
//You are given an absolute path for a Unix-style file system, which always begins with a slash '
// /'. Your task is to transform this absolute path into its simplified canonical path.
//
//The rules of a Unix-style file system are as follows:
//
//A single period '.' represents the current directory.
//A double period '..' represents the previous/parent directory.
//Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
//Any sequence of periods that does not match the rules above should be treated as a valid directory
// or file name. For example, '...' and '....' are valid directory or file names.
//The simplified canonical path should follow these rules:
//
//The path must start with a single slash '/'.
//Directories within the path must be separated by exactly one slash '/'.
//The path must not end with a slash '/', unless it is the root directory.
//The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
//Return the simplified canonical path.
//
//
//
//        Example 1:
//
//Input: path = "/home/"
//
//Output: "/home"
//
//Explanation:
//
//The trailing slash should be removed.
//
//Example 2:
//
//Input: path = "/home//foo/"
//
//Output: "/home/foo"
//
//Explanation:
//
//Multiple consecutive slashes are replaced by a single one.
//
//        Example 3:
//
//Input: path = "/home/user/Documents/../Pictures"
//
//Output: "/home/user/Pictures"
//
//Explanation:
//
//A double period ".." refers to the directory up a level (the parent directory).
//
//Example 4:
//
//Input: path = "/../"
//
//Output: "/"
//
//Explanation:
//
//Going one level up from the root directory is not possible.
//
//        Example 5:
//
//Input: path = "/.../a/../b/c/../d/./"
//
//Output: "/.../b/d"
//
//Explanation:
//
//        "..." is a valid name for a directory in this problem

class Directory {
    public static void main(String[] args) {
      String testcase1="/home/";
      String testcase2 ="/home//foo/";
      String testcase3 ="/home/user/Documents/../Pictures";
      String testcase4 = "/../";
      String testcase5 ="/.../a/../b/c/../d/./";

        System.out.println(Path(testcase1));
        System.out.println(Path(testcase2));
        System.out.println(Path(testcase3));
        System.out.println(Path(testcase4));
        System.out.println(Path(testcase5));

    }
    public static String Path(String s){

        Stack<String> sb = new Stack<>();
        String arr [] =s.split("/");


        for(String change : arr){
            
            if(change.equals(".") || change.isBlank()){
                continue;
            } else if (change.equals("..")) {

                if(!sb.empty()){
                    sb.pop();
                }
                
            } else {
                sb.push(change);
            }

        }
   return "/" + String.join("/",sb);
    }
}

// 33. Search in Rotated Sorted Array (01.10.2025)======================================================================
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//There is an integer array nums sorted in ascending order (with distinct values).
//
//Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length)
// such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
// For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
//
//Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums,
// or -1 if it is not in nums.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
//Example 2:
//
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
//Example 3:
//
//Input: nums = [1], target = 0
//Output: -1


class Rotated{
    public static void main(String[] args) {
         int testcase1[]={4,5,6,7,0,1,2};
         int target1=0;
         int teatcase2[]={5,4,5,6,7,0,1,2};
         int target2=5;
        System.out.println(Search(testcase1,target1));
        System.out.println(Search(teatcase2,target2));
    }

    public static int Search(int arr[],int target){
       int left=0,right=arr.length-1;

        if(arr.length==0)
            return -1;
        if(arr.length==1 && arr[0]==target)
            return 0;

       while (left<=right){
           int mid =(left+right)/2;

           if(arr[mid]==target){
               return mid;
           }
           if(arr[left]<=arr[mid]){

               if(arr[left] <=target && target< arr[mid]){
                   right=mid-1;
               } else {
                   left=mid+1;
               }

           } else {
               if(arr[mid] < target && target <= arr[right]){
                   left=mid+1;
               } else {
                   right=mid-1;
               }
           }
       }
   return -1;
    }
}


// 1518. Water Bottles  (01.10.2025)==================================================================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//There are numBottles water bottles that are initially full of water. You can exchange numExchange
// empty water bottles from the market with one full water bottle.
//
//The operation of drinking a full water bottle turns it into an empty bottle.
//
//Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.
//
//
//
//Example 1:
//
//
//Input: numBottles = 9, numExchange = 3
//Output: 13
//Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
//Number of water bottles you can drink: 9 + 3 + 1 = 13.
//Example 2:
//
//
//Input: numBottles = 15, numExchange = 4
//Output: 19
//Explanation: You can exchange 4 empty bottles to get 1 full water bottle.
//Number of water bottles you can drink: 15 + 3 + 1 = 19.

class Water {
    public static void main(String[] args) {
        int numBottles1=9;
        int numExchaneg1=3;
        int numBottles2=15;
        int numExchange2=4;

        System.out.println(Bottles(numBottles1,numExchaneg1));
        System.out.println(Bottles(numBottles2,numExchange2));

    }
    public static int Bottles(int numBottles,int numExchange){

        int ans= numBottles;

        while (true){
          int  Q=numBottles/numExchange;
          int R=numBottles%numExchange;

          if(Q==0){
              break;
          }

          ans +=Q;
          numBottles=Q+R;
        }

    return ans;
    }
}