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
//
//class  ClimbingStairs {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of stairs: ");
//        int n = sc.nextInt();
//
//
//        Stairs sol = new Stairs();
//        int ways = sol.climbStairs(n);
//
//
//        System.out.println("Number of ways to climb stairs: " + ways);
//    }
//}
//
//
//class Stairs{
//    public int climbStairs(int n) {
//        if(n <= 1){
//            return 1;
//        }
//        int arr[] = new int[n+1];
//        arr[0]=1;
//        arr[1]=1;
//        for(int i = 2; i <= n; i++){
//            arr[i] = arr[i-1] + arr[i-2];
//        }
//        return arr[n];
//    }
//}


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

// 153. Find Minimum in Rotated Sorted Array  (3.10.2025)=============================================================
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//Hint
//Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example,
// the array nums = [0,1,2,4,5,6,7] might become:
//
//[4,5,6,7,0,1,2] if it was rotated 4 times.
//[0,1,2,4,5,6,7] if it was rotated 7 times.
//Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in
// the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
//
//Given the sorted rotated array nums of unique elements, return the minimum element of this array.
//
//You must write an algorithm that runs in O(log n) time.
//
//
//
//Example 1:
//
//Input: nums = [3,4,5,1,2]
//Output: 1
//Explanation: The original array was [1,2,3,4,5] rotated 3 times.
//Example 2:
//
//Input: nums = [4,5,6,7,0,1,2]
//Output: 0
//Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
//Example 3:
//
//Input: nums = [11,13,15,17]
//Output: 11
//Explanation: The original array was [11,13,15,17] and it was rotated 4 times.


class RotatedSorted {
    public static void main(String[] args) {
        int testcase1 [] ={3,4,5,1,2};
        int testcase2[]={4,5,6,7,0,1,2};
        int testcase3 []={11,13,15,17};
        System.out.println(Mini(testcase1));
        System.out.println(Mini(testcase2));
        System.out.println(Mini(testcase3));
    }

    public static  int Mini(int arr []){

        int left=0;
        int right= arr.length-1;

        while (left<right){
            int mid = (left+right)/2;

            if(arr[mid] < arr[right]){
                 right=mid;
            } else {
                left =mid+1;
            }
        }
      return arr[right];
    }
}

// 268. Missing Number  (03-10-2025)=================================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Given an array nums containing n distinct numbers in the range [0, n], return the
// only number in the range that is missing from the array.
//
//
//
//Example 1:
//
//Input: nums = [3,0,1]
//
//Output: 2
//
//Explanation:
//
//n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is
// the missing number in the range since it does not appear in nums.
//
//Example 2:
//
//Input: nums = [0,1]
//
//Output: 2
//
//Explanation:
//
//n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is
// the missing number in the range since it does not appear in nums.
//
//Example 3:
//
//Input: nums = [9,6,4,2,3,5,7,0,1]
//
//Output: 8
//
//Explanation:

class MissingNumber {
    public static void main(String[] args) {
       int testcase1[]={3,0,1};
       int testcase2[]={0,1};
       int testcase3[]={9,6,4,2,3,5,7,0,1};
        System.out.println(Number(testcase1));
        System.out.println(Number(testcase2));
        System.out.println(Number(testcase3));
    }

    public static int Number(int arr []){
        Arrays.sort(arr);
        int n = arr.length;


        for(int i=0;i<n;i++){
            if(i!=arr[i]){
                return i;
            }
        }
        return n;
    }
}


// 2114. Maximum Number of Words Found in Sentences (03-10-2025)===========================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
//
//You are given an array of strings sentences, where each sentences[i] represents a single sentence.
//
//Return the maximum number of words that appear in a single sentence.
//
//
//
//Example 1:
//
//Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
//Output: 6
//Explanation:
//- The first sentence, "alice and bob love leetcode", has 5 words in total.
//- The second sentence, "i think so too", has 4 words in total.
//- The third sentence, "this is great thanks very much", has 6 words in total.
//Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
//Example 2:
//
//Input: sentences = ["please wait", "continue to fight", "continue to win"]
//Output: 3
//Explanation: It is possible that multiple sentences contain the same number of words.
//In this example, the second and third sentences (underlined) have the same number of words.
//


class WordsFound {
    public static void main(String[] args) {
        String testcase1 []={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String testcase2 [] ={"please wait", "continue to fight", "continue to win"};
        String testcase3 [] ={"please wait", "continue to fight", "continue to win"};

        System.out.println(MaximumNumber(testcase1));
        System.out.println(MaximumNumber(testcase2));
        System.out.println(MaximumNumber(testcase3));
    }

    public static int MaximumNumber(String [] arr){
        int maxx=Integer.MIN_VALUE;

        for(String c : arr ) {
            int count=0;

            for(char ch :c.toCharArray()){
                if(ch==' '){
                    count++;
                }
            }
            maxx=Math.max(maxx,count+1);
        }
        return maxx;
    }
}


//53. Maximum Subarray (07-10-2025)======================================
//Solved
//        Medium
//Topics
//premium lock icon
//        Companies
//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//
//
//
//Example 1:
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Example 2:
//
//Input: nums = [1]
//Output: 1
//Explanation: The subarray [1] has the largest sum 1.
//Example 3:
//
//Input: nums = [5,4,-1,7,8]
//Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
//

class Maximum {
    public static void main(String[] args) {

        int testcase1[]={-2,1,-3,4,-1,2,1,-5,4};
        int testcase2 []={1};
        int testcase3 []={5,4,-1,7,8};
        System.out.println(Subarray(testcase1));
        System.out.println(Subarray(testcase2));
        System.out.println(Subarray(testcase3));
    }

    public static int Subarray(int arr []){
        int cursum=0;
        int maxsum=arr[0];

        for(int i=0;i< arr.length;i++){
            cursum = cursum + arr[i];

            if(maxsum< cursum){
                maxsum = cursum;

            }
            if(cursum<0){
                cursum=0;
            }
        }
        return maxsum;
    }
}

// 365. Water and Jug Problem
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//You are given two jugs with capacities x liters and y liters. You have an infinite water supply. Return whether the total amount of water in both jugs may reach target using the following operations:
//
//Fill either jug completely with water.
//Completely empty either jug.
//Pour water from one jug into another until the receiving jug is full, or the transferring jug is empty.
//
//
//Example 1:
//
//Input: x = 3, y = 5, target = 4
//
//Output: true
//
//Explanation:
//
//Follow these steps to reach a total of 4 liters:
//
//Fill the 5-liter jug (0, 5).
//Pour from the 5-liter jug into the 3-liter jug, leaving 2 liters (3, 2).
//Empty the 3-liter jug (0, 2).
//Transfer the 2 liters from the 5-liter jug to the 3-liter jug (2, 0).
//Fill the 5-liter jug again (2, 5).
//Pour from the 5-liter jug into the 3-liter jug until the 3-liter jug is full. This leaves 4 liters in the 5-liter jug (3, 4).
//Empty the 3-liter jug. Now, you have exactly 4 liters in the 5-liter jug (0, 4).
//Reference: The Die Hard example.
//
//Example 2:
//
//Input: x = 2, y = 6, target = 5
//
//Output: false
//
//Example 3:
//
//Input: x = 1, y = 2, target = 3
//
//Output: true
//
//Explanation: Fill both jugs. The total amount of water in both jugs is equal to 3 now.

class  Waterr {
    public static void main(String[] args) {
       int x= 3,y=6,target=6;
        System.out.println(Jugs(x,y,target));
    }

    public static  boolean Jugs(int x,int y,int target){

        if(x+y<target){
            return  false;
        }
        return target % gcd(x,y)==0;
    }
    private static int gcd(int a, int b){

        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}


// 394. Decode String (08-10-2025)===
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//Given an encoded string, return its decoded string.
//
//The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
//
//You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
//
//The test cases are generated so that the length of the output will never exceed 105.
//
//
//
//Example 1:
//
//Input: s = "3[a]2[bc]"
//Output: "aaabcbc"
//Example 2:
//
//Input: s = "3[a2[c]]"
//Output: "accaccacc"
//Example 3:
//
//Input: s = "2[abc]3[cd]ef"
//Output: "abcabccdcdcdef"

class Decode {
    public static void main(String[] args) {
        String testcase ="3[a]2[bc]";
        System.out.println(DecodeString(testcase));
    }

    public  static String DecodeString(String s) {
        Stack<Integer> st1 = new Stack<>();
        Stack<String> st2 = new Stack<>();
        String str = "";
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                st1.push(k);
                st2.push(str);
                str = "";
                k = 0;
            } else if (c == ']') {
                int n = st1.pop();
                String prew = st2.pop();
                String temp = "";
                for (int i = 0; i < n; i++) {
                    temp += str;
                }
                str = prew + temp;
            } else {
                str += c;
            }
        }

        return str;
    }
}

// 1700. Number of Students Unable to Eat Lunch (08-10-2025)====
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers 0 and 1 respectively. All students stand in a queue. Each student either prefers square or circular sandwiches.
//
//The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a stack. At each step:
//
//If the student at the front of the queue prefers the sandwich on the top of the stack, they will take it and leave the queue.
//Otherwise, they will leave it and go to the queue's end.
//This continues until none of the queue students want to take the top sandwich and are thus unable to eat.
//
//You are given two integer arrays students and sandwiches where sandwiches[i] is the type of the i​​​​​​th sandwich in the stack (i = 0 is the top of the stack) and students[j] is the preference of the j​​​​​​th student in the initial queue (j = 0 is the front of the queue). Return the number of students that are unable to eat.
//
//
//
//Example 1:
//
//Input: students = [1,1,0,0], sandwiches = [0,1,0,1]
//Output: 0
//Explanation:
//- Front student leaves the top sandwich and returns to the end of the line making students = [1,0,0,1].
//- Front student leaves the top sandwich and returns to the end of the line making students = [0,0,1,1].
//- Front student takes the top sandwich and leaves the line making students = [0,1,1] and sandwiches = [1,0,1].
//- Front student leaves the top sandwich and returns to the end of the line making students = [1,1,0].
//- Front student takes the top sandwich and leaves the line making students = [1,0] and sandwiches = [0,1].
//- Front student leaves the top sandwich and returns to the end of the line making students = [0,1].
//- Front student takes the top sandwich and leaves the line making students = [1] and sandwiches = [1].
//- Front student takes the top sandwich and leaves the line making students = [] and sandwiches = [].
//Hence all students are able to eat.
//Example 2:
//
//Input: students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1]
//Output: 3

//
//class EatLunch {
//    public static void main(String[] args) {
//        int students[]={1,1,1,0,0,1};
//        int sandwiches []={1,0,0,0,1,1};
//        System.out.println(Number(students,sandwiches));
//    }
//    public static int Number(int[] students, int[] sandwiches){
//        Queue<Integer> q = new LinkedList<>();
//
//        for(int c : students){
//
//
//        }
//    }
//}

// 844. Backspace String Compare (08-10-2025)===
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
//
//Note that after backspacing an empty text, the text will continue empty.
//
//
//
//Example 1:
//
//Input: s = "ab#c", t = "ad#c"
//Output: true
//Explanation: Both s and t become "ac".
//Example 2:
//
//Input: s = "ab##", t = "c#d#"
//Output: true
//Explanation: Both s and t become "".
//Example 3:
//
//Input: s = "a#c", t = "b"
//Output: false
//Explanation: s becomes "c" while t becomes "b".

class Backspace {
    public static void main(String[] args) {
        String testcase1s="ab#c";
        String testcase1t="ad#c";
        String testcase2s="ab##";
        String testcase2t="c#d#";
        String testcase3s="a#c";
        String testcase3t="b";


        System.out.println(Becomes(testcase1s,testcase1t));
        System.out.println(Becomes(testcase2s,testcase2t));
        System.out.println(Becomes(testcase3s,testcase3t));
    }

    public static boolean Becomes(String s,String t){
        s=Remove(s);
        t=Remove(t);

        return s.equals(t);

    }

    public static String Remove(String s){

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){

            if(st.size() > 0 && s.charAt(i)=='#'){
                st.pop();
            } else if (s.charAt(i)!='#') {

                st.push(s.charAt(i));
            }
        }
   return st.toString();
    }
}


// 1021. Remove Outermost Parentheses (08-10-2025)==
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
//
//For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
//A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.
//
//Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
//
//Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
//
//
//
//Example 1:
//
//Input: s = "(()())(())"
//Output: "()()()"
//Explanation:
//The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
//After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
//Example 2:
//
//Input: s = "(()())(())(()(()))"
//Output: "()()()()(())"
//Explanation:
//The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
//After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
//Example 3:
//
//Input: s = "()()"
//Output: ""
//Explanation:
//The input string is "()()", with primitive decomposition "()" + "()".
//After removing outer parentheses of each part, this is "" + "" = "".


class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String testcase1 = "(()())(())";

        StringBuffer st = new StringBuffer();

        int open=0;

        for(char c : testcase1.toCharArray()){

            if(c=='('){
                if(open!=0){
                    st.append(c);
                }
                open++;
            }
            else {
                open--;
                if(open!=0){
                    st.append(c);
                }

            }

        }
        System.out.println(st.toString());
    }
}

// 136. Single Number (09-10-2025)======
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [2,2,1]
//
//Output: 1
//
//Example 2:
//
//Input: nums = [4,1,2,1,2]
//
//Output: 4
//
//Example 3:
//
//Input: nums = [1]
//
//Output: 1


class SingleNumber {
    public static void main(String[] args) {
        int testcase [] ={2,2,1};
        System.out.println(Number(testcase));
    }

    public static  int Number(int nums []){
        int n=0;

        for(int i=0;i<nums.length;i++){

            n = nums[i] ^ n;

        }
        return n;
    }
}

// 3304. Find the K-th Character in String Game I (10-10-2025)======
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Alice and Bob are playing a game. Initially, Alice has a string word = "a".
//
//You are given a positive integer k.
//
//Now Bob will ask Alice to perform the following operation forever:
//
//Generate a new string by changing each character in word to its next character in the
// English alphabet, and append it to the original word.
//For example, performing the operation on "c" generates "cd" and performing the operation on "zb" generates "zbac".
//
//Return the value of the kth character in word, after enough operations have been done for
// word to have at least k characters.
//
//
//
//Example 1:
//
//Input: k = 5
//
//Output: "b"
//
//Explanation:
//
//Initially, word = "a". We need to do the operation three times:
//
//Generated string is "b", word becomes "ab".
//Generated string is "bc", word becomes "abbc".
//Generated string is "bccd", word becomes "abbcbccd".
//Example 2:
//
//Input: k = 10
//
//Output: "c"



class Solutionn{

    public char kthCharacterrr(int k) {
        String word = "a";

        while (word.length() < k) {
            String temp = "";

            for (int i = 0; i < word.length(); i++) {
                temp += (char) (word.charAt(i) + 1);
            }

            word += temp;
        }

        return word.charAt(k - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for k: ");
        int k = scanner.nextInt();

        Solutionn sol = new Solutionn();
        char result = sol.kthCharacterrr(k);

        System.out.println("The " + k + "th character is: " + result);


    }
}


// 69. Sqrt(x)
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
// The returned integer should be non-negative as well.
//
//You must not use any built-in exponent function or operator.
//
//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
//
//
//Example 1:
//
//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2, so we return 2.
//Example 2:
//
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.


class Sqrt {
    public static void main(String[] args) {
       int testcase1 = 4;
       int testcase2= 8;
     System.out.println(Root(testcase1));
      System.out.println(Root(testcase2));
    }

    public static int Root(int x){
        int left=1;
        int right=x;
        int ans=0;

        while (left <= right){

            int mid = left + (right-left)/2;

            long m =(long) mid * mid;
            
            if(m==x){
                return  mid;
            } else if (m < x) {

                ans=mid;
                left=mid+1;
                
            } else {
                right=mid-1;
            }
        }
        return ans;
    }
}


// 3304. Find the K-th Character in String Game I (14-10-25)=====
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Alice and Bob are playing a game. Initially, Alice has a string word = "a".
//
//You are given a positive integer k.
//
//Now Bob will ask Alice to perform the following operation forever:
//
//Generate a new string by changing each character in word to its next character in the English alphabet,
// and append it to the original word.
//For example, performing the operation on "c" generates "cd" and performing the operation on "zb" generates "zbac".
//
//Return the value of the kth character in word, after enough operations have been done for word to have at least k characters.
//
//
//
//Example 1:
//
//Input: k = 5
//
//Output: "b"
//
//Explanation:
//
//Initially, word = "a". We need to do the operation three times:
//Generated string is "b", word becomes "ab".
//Generated string is "bc", word becomes "abbc".
//Generated string is "bccd", word becomes "abbcbccd".
//Example 2:
//
//Input: k = 10
//
//Output: "c"


class Kth  {
    public static void main (String [] args){
         int k =5;
        System.out.println(kthCharacter(k));
    }
    public static char kthCharacter(int k) {
        String word = "a";

        while (word.length() < k) {
            String temp = "";

            for (int i = 0; i < word.length(); i++) {
                temp += (char) (word.charAt(i) + 1);
            }

            word += temp;
        }

        return word.charAt(k - 1);
    }
}

// 1941. Check if All Characters Have Equal Number of Occurrences (23-10-2025)==============
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given a string s, return true if s is a good string, or false otherwise.
//
//A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).
//
//
//
//Example 1:
//
//Input: s = "abacbc"
//Output: true
//Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
//Example 2:
//
//Input: s = "aaabb"
//Output: false
//Explanation: The characters that appear in s are 'a' and 'b'.
//'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.

class EqualValue{
   static void main() {
        String s ="abacbc";
        System.out.println(Conterol(s));
    }
    public static boolean Conterol(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        int freq = map.values().iterator().next();

        for (int val : map.values()) {
            if (val != freq) {
                return false;
            }
        }

        return true;
    }
}


// 917. Reverse Only Letters
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given a string s, reverse the string according to the following rules:
//
//All the characters that are not English letters remain in the same position.
//All the English letters (lowercase or uppercase) should be reversed.
//Return s after reversing it.
//
//
//
//Example 1:
//
//Input: s = "ab-cd"
//Output: "dc-ba"
//Example 2:
//
//Input: s = "a-bC-dEf-ghIj"
//Output: "j-Ih-gfE-dCba"
//Example 3:
//
//Input: s = "Test1ng-Leet=code-Q!"
//Output: "Qedo1ct-eeLg=ntse-T!"
//

class ReverseOnlyLetters{
    static void main() {
        String testcase1="ab-cd";
        System.out.println(Letters(testcase1));
    }

    static String Letters(String s){

        char arr [] =s.toCharArray();
        int i=0;
        int j=s.length()-1;

        while (i<j){
            if(!Character.isLetter(arr[i])){
                i++;
            } else if (!Character.isLetter(arr[j])) {
                j--;
            } else {
                char temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}

//696. Count Binary Substrings
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given a binary string s, return the number of non-empty substrings that have the same number
// of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
//
//Substrings that occur multiple times are counted the number of times they occur.
//
//
//
//Example 1:
//
//Input: s = "00110011"
//Output: 6
//Explanation: There are 6 substrings that have equal number of consecutive
// 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
//Notice that some of these substrings repeat and are counted the number of times they occur.
//Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
//Example 2:
//
//Input: s = "10101"
//Output: 4
//Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
//

class CountBinary {
    static void main() {
   String testcase1="00110011";
       String testcase2="10101";

  System.out.println(Binary(testcase1));
        System.out.println(Binary(testcase2));
    }
    static int Binary(String s){
        int i=0;
        int j=1;
        int c=0;

        for(int k=1;k<s.length();k++){

            if(s.charAt(k)==s.charAt(k-1)){
                j++;
            } else {
                c +=Math.min(i,j);
                i = j;
                j=1;
            }

        }
        c +=Math.min(i,j);
        return c;
    }
}

// 633. Sum of Square Numbers
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
//
//
//
//Example 1:
//
//Input: c = 5
//Output: true
//Explanation: 1 * 1 + 2 * 2 = 5
//Example 2:
//
//Input: c = 3
//Output: false
//
class Sq {


    public static void main(String[] args) {
        int testcase1 = 5;
        int testcase2 = 3;
        System.out.println(Square(testcase1));
        System.out.println(Square(testcase2));
    }

    static boolean Square(int c) {

        long left = 0;
        long right = (long) Math.sqrt(c);


        while (left <= right) {

            long sum = left * left + right * right;

            if (sum == c) {
                return true;

            } else if (sum < c) {
                left++;

            } else {
                right--;
            }
        }
        return false;
    }
}
// 1365. How Many Numbers Are Smaller Than the Current Number (24-01-2025)===========
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
//
//Return the answer in an array.
//
//
//
//Example 1:
//
//Input: nums = [8,1,2,2,3]
//Output: [4,0,1,1,3]
//Explanation:
//For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
//For nums[1]=1 does not exist any smaller number than it.
//For nums[2]=2 there exist one smaller number than it (1).
//For nums[3]=2 there exist one smaller number than it (1).
//For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
//Example 2:
//
//Input: nums = [6,5,4,8]
//Output: [2,1,0,3]
//Example 3:
//
//Input: nums = [7,7,7,7]
//Output: [0,0,0,0]
//

class Smaller {
    public static void main(String[] args) {
        int testcase1[] = {8, 1, 2, 2, 3};
        int result[] = Many(testcase1);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] Many(int arr[]) {
        int ans[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                }
            }
            ans[i] = count; // store result, not overwrite input
        }

        return ans;
    }
}

// 506. Relative Ranks (25-10-2025)=======================================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition.
// All the scores are guaranteed to be unique.
//
//The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place
// athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
//
//The 1st place athlete's rank is "Gold Medal".
//The 2nd place athlete's rank is "Silver Medal".
//The 3rd place athlete's rank is "Bronze Medal".
//For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth
// place athlete's rank is "x").
//Return an array answer of size n where answer[i] is the rank of the ith athlete.
//
//
//
//Example 1:
//
//Input: score = [5,4,3,2,1]
//Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
//Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
//Example 2:
//
//Input: score = [10,3,8,9,4]
//Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
//Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].


class RelativeRanks {
    static void main() {
        int testcase1 []={5,4,3,2,1};
        System.out.println(Arrays.toString(Rank(testcase1)));
    }
    public static  String[] Rank(int arr []){

        Map<Integer,Integer> map = new HashMap<>();

        String result [] = new String[arr.length];

        for(int i=0;i<arr.length;i++){

            map.put(arr[i],i);
        }
        Arrays.sort(arr);

        for (int i=arr.length-1;i>=0;i--){
            int rank= arr.length-i;
//            System.out.println(rank + "This is Rank Value :: ");
//            System.out.println(arr[i]);

            if(rank==1){
                result[map.get(arr[i])]="Gold Medal";
            } else if (rank==2) {
                result[map.get(arr[i])]="Silver Medal";

            } else if (rank==3) {
                result[map.get(arr[i])]="Bronze Medal";

            } else {

                result[map.get(arr[i])]= rank+"";
            }
        }


        return result;

    }
}


// 190. Reverse Bits
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Reverse bits of a given 32 bits signed integer.
//
//
//
//Example 1:
//
//Input: n = 43261596
//
//Output: 964176192
//
//Explanation:
//
//Integer	Binary
//43261596	00000010100101000001111010011100
//964176192	00111001011110000010100101000000
//Example 2:
//
//Input: n = 2147483644
//
//Output: 1073741822
//
//Explanation:
//
//Integer	Binary
//2147483644	01111111111111111111111111111100
//1073741822	00111111111111111111111111111110



class ReverseBits {
    static void main() {
        int testcase1= 12;
        System.out.println(Reverse(testcase1));
    }

    public static  int Reverse(int n){
         int ans=0;
        for(int i=0;i<4;i++){

            ans=ans << 1;

            if((n&1)==1){
                ans =ans |1;
            }
            n =n >>>1;
        }
        return ans;
    }
}

// 1221. Split a String in Balanced Strings
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
//
//Given a balanced string s, split it into some number of substrings such that:
//
//Each substring is balanced.
//Return the maximum number of balanced strings you can obtain.
//
//
//
//Example 1:
//
//Input: s = "RLRRLLRLRL"
//Output: 4
//Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
//Example 2:
//
//Input: s = "RLRRRLLRLL"
//Output: 2
//Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
//Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
//Example 3:
//
//Input: s = "LLLLRRRR"
//Output: 1
//Explanation: s can be split into "LLLLRRRR".
//

class BalancedStrings {
    static void main() {
          String testcase1 ="RLRRLLRLRL";
        System.out.println(Balanced(testcase1));
    }
    public static int Balanced(String s){
        int l=0,r=0,max=0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='R'){
                r++;
            } else {
                l++;
            }if(l==r){
                max++;
            }

        }
        return max;
    }
}