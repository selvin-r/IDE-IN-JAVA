import java.math.BigInteger;
import java.util.*;

public class LeetCode {
    public static void main(String[] args) {

    }
}

// 1935. Maximum Number of Words You Can Type  (Date 15-09-20025 )===========================================

class MaxNumber {
    public static void main(String[] args) throws Exception {

        String text = "hello World";
        String brokenLetters = "ad";
        String text1 = "leet code", brokenLetters1 = "lt";

        String text2 = "leet code", brokenLetters2 = "e";

        System.out.println(" Test Case one  count " + Count(text, brokenLetters));
        System.out.println(" Test Case Two  count " + Count(text1, brokenLetters1));
        System.out.println("Test Case 3  count " + Count(text2, brokenLetters2));

    }

    public static int Count(String text, String brokenletters) {

        Set<Character> sb = new HashSet<>();

        for (char c : brokenletters.toCharArray()) {
            sb.add(c);

        }
        String[] arr = text.split(" ");
        int sum = 0;

        for (String world : arr) {
            boolean value = true;

            for (char s : world.toCharArray()) {
                if (sb.contains(s)) {
                    value = false;
                    break;
                }

            }
            if (value) {
                sum++;
            }
        }

        return sum;

    }
}

// 191. Number of 1 Bits

class NumberBits {
    public static void main(String[] args) {
        int testcase1 = 11;
        int testcase2 = 128;
        int testcase3 = 2147483645;
        System.out.println(Bits(testcase1));
        System.out.println(Bits(testcase2));
        System.out.println(Bits(testcase3));
    }

    public static int Bits(int n) {

        int count = 0;
        String s = Integer.toBinaryString(n);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}

// 204. Count Primes (Sieve of Eratosthenes algorithm) (26-09-25)

class CountPrimes {
    public static void main(String[] args) {

        int testcase1 = 10;
        int testcase2 = 0;

        System.out.println(Primes(testcase1));
        System.out.println(Primes(testcase2));

    }

    public static int Primes(int n) {

        boolean check[] = new boolean[n];

        int limit = (int) Math.sqrt(n);

        for (int i = 2; i <= limit; i++) {

            if (check[i] == false) {

                for (int j = i * i; j < n; j += i) {
                    check[j] = true;
                }
            }
        }
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (check[i] == false) {
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

class MinimumSize {
    public static void main(String[] args) {

        int testcase1[] = {2, 3, 1, 2, 4, 3};
        int target1 = 7;
        int[] testcase2 = {1, 4, 4};
        int target2 = 4;

        int testcase3[] = {1, 1, 1, 1, 1, 1, 1, 1};
        int target3 = 11;

        System.out.println(SubarraySum(testcase1, target1));
        System.out.println(SubarraySum(testcase2, target2));
        System.out.println(SubarraySum(testcase3, target3));
    }

    public static int SubarraySum(int[] nums, int target) {

        int left = 0, right = 0, sum = 0, min = Integer.MAX_VALUE;

        while (right < nums.length) {

            sum += nums[right];

            while (sum >= target) {

                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
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
        String testcase1[] = {"2", "1", "+", "3", "*"};
        String testcase2[] = {"4", "13", "5", "/", "+"};
        String testcase3[] = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(ReversePolish(testcase1));
        System.out.println(ReversePolish(testcase2));
        System.out.println(ReversePolish(testcase3));
    }

    public static int ReversePolish(String str[]) {

        int res[] = new int[str.length / 2 + 1];
        int i = 0;

        for (String poin : str) {

            switch (poin) {
                case "+":
                    res[i - 2] = res[i - 2] + res[i - 1];
                    i--;
                    break;

                case "-":
                    res[i - 2] = res[i - 2] - res[i - 1];
                    i--;
                    break;
                case "*":
                    res[i - 2] = res[i - 2] * res[i - 1];
                    i--;
                    break;
                case "/":
                    res[i - 2] = res[i - 2] / res[i - 1];
                    i--;
                    break;
                default:
                    res[i++] = Integer.parseInt(poin);
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

        int testcase1[] = {5, 7, 1, 4};
        int k1 = 2;
        int testcase2[] = {1, 2, 3, 4};
        int k2 = 0;
        int testcase3[] = {2, 4, 9, 3};
        int k3 = -2;
        System.out.println(Arrays.toString(Bomb(testcase1, k1)));
        System.out.println(Arrays.toString(Bomb(testcase2, k2)));
        System.out.println(Arrays.toString(Bomb(testcase3, k3)));
    }

    public static int[] Bomb(int arr[], int k) {

        int n = arr.length;
        int[] result = new int[n];


        for (int i = 0; i < n; i++) {

            if (k > 0) {
                int sum = 0;

                for (int j = 1; j <= k; j++) {
                    sum += arr[(i + j) % n];
                    result[i] = sum;
                }
            }
            if (k < 0) {
                int sum = 0;
                int start = i + n + k;
                int count = 0;
                for (int j = start; count < Math.abs(k); j++, count++) {
                    sum += arr[j % n];
                    result[i] = sum;

                }
            }
        }
        return result;
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
        String testcase1 = "/home/";
        String testcase2 = "/home//foo/";
        String testcase3 = "/home/user/Documents/../Pictures";
        String testcase4 = "/../";
        String testcase5 = "/.../a/../b/c/../d/./";

        System.out.println(Path(testcase1));
        System.out.println(Path(testcase2));
        System.out.println(Path(testcase3));
        System.out.println(Path(testcase4));
        System.out.println(Path(testcase5));

    }

    public static String Path(String s) {

        Stack<String> sb = new Stack<>();
        String arr[] = s.split("/");


        for (String change : arr) {

            if (change.equals(".") || change.isBlank()) {
                continue;
            } else if (change.equals("..")) {

                if (!sb.empty()) {
                    sb.pop();
                }

            } else {
                sb.push(change);
            }

        }
        return "/" + String.join("/", sb);
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


class Rotated {
    public static void main(String[] args) {
        int testcase1[] = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        int teatcase2[] = {5, 4, 5, 6, 7, 0, 1, 2};
        int target2 = 5;
        System.out.println(Search(testcase1, target1));
        System.out.println(Search(teatcase2, target2));
    }

    public static int Search(int arr[], int target) {
        int left = 0, right = arr.length - 1;

        if (arr.length == 0)
            return -1;
        if (arr.length == 1 && arr[0] == target)
            return 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[left] <= arr[mid]) {

                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } else {
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
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
        int numBottles1 = 9;
        int numExchaneg1 = 3;
        int numBottles2 = 15;
        int numExchange2 = 4;

        System.out.println(Bottles(numBottles1, numExchaneg1));
        System.out.println(Bottles(numBottles2, numExchange2));

    }

    public static int Bottles(int numBottles, int numExchange) {

        int ans = numBottles;

        while (true) {
            int Q = numBottles / numExchange;
            int R = numBottles % numExchange;

            if (Q == 0) {
                break;
            }

            ans += Q;
            numBottles = Q + R;
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
        int testcase1[] = {3, 4, 5, 1, 2};
        int testcase2[] = {4, 5, 6, 7, 0, 1, 2};
        int testcase3[] = {11, 13, 15, 17};
        System.out.println(Mini(testcase1));
        System.out.println(Mini(testcase2));
        System.out.println(Mini(testcase3));
    }

    public static int Mini(int arr[]) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] < arr[right]) {
                right = mid;
            } else {
                left = mid + 1;
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
        int testcase1[] = {3, 0, 1};
        int testcase2[] = {0, 1};
        int testcase3[] = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(Number(testcase1));
        System.out.println(Number(testcase2));
        System.out.println(Number(testcase3));
    }

    public static int Number(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;


        for (int i = 0; i < n; i++) {
            if (i != arr[i]) {
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
        String testcase1[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String testcase2[] = {"please wait", "continue to fight", "continue to win"};
        String testcase3[] = {"please wait", "continue to fight", "continue to win"};

        System.out.println(MaximumNumber(testcase1));
        System.out.println(MaximumNumber(testcase2));
        System.out.println(MaximumNumber(testcase3));
    }

    public static int MaximumNumber(String[] arr) {
        int maxx = Integer.MIN_VALUE;

        for (String c : arr) {
            int count = 0;

            for (char ch : c.toCharArray()) {
                if (ch == ' ') {
                    count++;
                }
            }
            maxx = Math.max(maxx, count + 1);
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

        int testcase1[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int testcase2[] = {1};
        int testcase3[] = {5, 4, -1, 7, 8};
        System.out.println(Subarray(testcase1));
        System.out.println(Subarray(testcase2));
        System.out.println(Subarray(testcase3));
    }

    public static int Subarray(int arr[]) {
        int cursum = 0;
        int maxsum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            cursum = cursum + arr[i];

            if (maxsum < cursum) {
                maxsum = cursum;

            }
            if (cursum < 0) {
                cursum = 0;
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

class Waterr {
    public static void main(String[] args) {
        int x = 3, y = 6, target = 6;
        System.out.println(Jugs(x, y, target));
    }

    public static boolean Jugs(int x, int y, int target) {

        if (x + y < target) {
            return false;
        }
        return target % gcd(x, y) == 0;
    }

    private static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
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
        String testcase = "3[a]2[bc]";
        System.out.println(DecodeString(testcase));
    }

    public static String DecodeString(String s) {
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
        String testcase1s = "ab#c";
        String testcase1t = "ad#c";
        String testcase2s = "ab##";
        String testcase2t = "c#d#";
        String testcase3s = "a#c";
        String testcase3t = "b";


        System.out.println(Becomes(testcase1s, testcase1t));
        System.out.println(Becomes(testcase2s, testcase2t));
        System.out.println(Becomes(testcase3s, testcase3t));
    }

    public static boolean Becomes(String s, String t) {
        s = Remove(s);
        t = Remove(t);

        return s.equals(t);

    }

    public static String Remove(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (st.size() > 0 && s.charAt(i) == '#') {
                st.pop();
            } else if (s.charAt(i) != '#') {

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

        int open = 0;

        for (char c : testcase1.toCharArray()) {

            if (c == '(') {
                if (open != 0) {
                    st.append(c);
                }
                open++;
            } else {
                open--;
                if (open != 0) {
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
        int testcase[] = {2, 2, 1};
        System.out.println(Number(testcase));
    }

    public static int Number(int nums[]) {
        int n = 0;

        for (int i = 0; i < nums.length; i++) {

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


class Solutionn {

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
        int testcase2 = 8;
        System.out.println(Root(testcase1));
        System.out.println(Root(testcase2));
    }

    public static int Root(int x) {
        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            long m = (long) mid * mid;

            if (m == x) {
                return mid;
            } else if (m < x) {

                ans = mid;
                left = mid + 1;

            } else {
                right = mid - 1;
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


class Kth {
    public static void main(String[] args) {
        int k = 5;
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

class EqualValue {
    static void main() {
        String s = "abacbc";
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

class ReverseOnlyLetters {
    static void main() {
        String testcase1 = "ab-cd";
        System.out.println(Letters(testcase1));
    }

    static String Letters(String s) {

        char arr[] = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (!Character.isLetter(arr[i])) {
                i++;
            } else if (!Character.isLetter(arr[j])) {
                j--;
            } else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
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
        String testcase1 = "00110011";
        String testcase2 = "10101";

        System.out.println(Binary(testcase1));
        System.out.println(Binary(testcase2));
    }

    static int Binary(String s) {
        int i = 0;
        int j = 1;
        int c = 0;

        for (int k = 1; k < s.length(); k++) {

            if (s.charAt(k) == s.charAt(k - 1)) {
                j++;
            } else {
                c += Math.min(i, j);
                i = j;
                j = 1;
            }

        }
        c += Math.min(i, j);
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
        int testcase1[] = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(Rank(testcase1)));
    }

    public static String[] Rank(int arr[]) {

        Map<Integer, Integer> map = new HashMap<>();

        String result[] = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], i);
        }
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            int rank = arr.length - i;
//            System.out.println(rank + "This is Rank Value :: ");
//            System.out.println(arr[i]);

            if (rank == 1) {
                result[map.get(arr[i])] = "Gold Medal";
            } else if (rank == 2) {
                result[map.get(arr[i])] = "Silver Medal";

            } else if (rank == 3) {
                result[map.get(arr[i])] = "Bronze Medal";

            } else {

                result[map.get(arr[i])] = rank + "";
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
        int testcase1 = 12;
        System.out.println(Reverse(testcase1));
    }

    public static int Reverse(int n) {
        int ans = 0;
        for (int i = 0; i < 4; i++) {

            ans = ans << 1;

            if ((n & 1) == 1) {
                ans = ans | 1;
            }
            n = n >>> 1;
        }
        return ans;
    }
}

// 1221. Split a String in Balanced Strings (27-10-2025)=-============================
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
        String testcase1 = "RLRRLLRLRL";
        System.out.println(Balanced(testcase1));
    }

    public static int Balanced(String s) {
        int l = 0, r = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'R') {
                r++;
            } else {
                l++;
            }
            if (l == r) {
                max++;
            }

        }
        return max;
    }
}

// 2485. Find the Pivot Integer (27-10-2025)====================================
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given a positive integer n, find the pivot integer x such that:
//
//The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
//Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most
// one pivot index for the given input.
//
//
//
//Example 1:
//
//Input: n = 8
//Output: 6
//Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
//Example 2:
//
//Input: n = 1
//Output: 1
//Explanation: 1 is the pivot integer since: 1 = 1.
//Example 3:
//
//Input: n = 4
//Output: -1
//Explanation: It can be proved that no such integer exist.


class PivotInteger {
    static void main() {
        int testcase1 = 8;
        System.out.println(Pivot(testcase1));
    }

    public static int Pivot(int n) {
        int sum = n * (n + 1) / 2;
        int left = 0;
        for (int x = 1; x <= n; x++) {

            left += x;

            if (left == sum - left + x) {
                return x;
            }
        }
        return -1;
    }
}

// 1423. Maximum Points You Can Obtain from Cards (27-10-2025)=================================================
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//Hint
//There are several cards arranged in a row, and each card has an associated number of points. The points
// are given in the integer array cardPoints.
//
//In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
//
//Your score is the sum of the points of the cards you have taken.
//
//Given the integer array cardPoints and the integer k, return the maximum score you can obtain.
//
//
//
//Example 1:
//
//Input: cardPoints = [1,2,3,4,5,6,1], k = 3
//Output: 12
//Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first
// will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final
// score of 1 + 6 + 5 = 12.
//Example 2:
//
//Input: cardPoints = [2,2,2], k = 2
//Output: 4
//Explanation: Regardless of which two cards you take, your score will always be 4.
//Example 3:
//
//Input: cardPoints = [9,7,7,9,7,7,9], k = 7
//Output: 55
//Explanation: You have to take all the cards. Your score is the sum of points of all cards.
//

class CardPoints {
    static void main() {
        int testcase1[] = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        System.out.println(Card(testcase1, k));
    }

    public static int Card(int arr[], int k) {

        int n = arr.length;

        int sum = 0;
        for (int i = 0; i < k; i++) {


            sum += arr[i];
        }
        int ans = sum;

        for (int i = 0; i < k; i++) {

            sum = sum - arr[k - i - 1] + arr[n - i - 1];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}


// 905. Sort Array By Parity (28-10-2025)===========================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Given an integer array nums, move all the even integers at the beginning of the array followed by
// all the odd integers.
//
//Return any array that satisfies this condition.
//
//
//
//Example 1:
//
//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
//Example 2:
//
//Input: nums = [0]
//Output: [0]
//

class ArrayByParity {
    static void main() {
        int testcase1[] = {3, 1, 2, 4};
        System.out.println(Arrays.toString(Partiy(testcase1)));
    }

    public static int[] Partiy(int[] nums) {
        int left = 0, right = nums.length - 1;

        int[] result = new int[nums.length];

        for (int num : nums) {

            if (num % 2 == 0) {
                result[left++] = num;
            } else {
                result[right--] = num;
            }
        }
        return result;
    }
}

// 66. Plus One (28-10-2025)============================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
// The digits are ordered from most significant to least significant in left-to-right order. The large integer does
// not contain any leading 0's.
//
//Increment the large integer by one and return the resulting array of digits.
//
//
//
//Example 1:
//
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//Example 2:
//
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
//Example 3:
//
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].


class PlsuOne {
    static void main() {
//        int testcase1 [] = {1,2,3};
        int testcase2[] = {9};
//        System.out.println(Arrays.toString(One(testcase1)));
        System.out.println(Arrays.toString(One(testcase2)));

    }

    public static int[] One(int[] arr) {

        int n = arr.length - 1;

        for (int x = n; x >= 0; x--) {

            if (arr[x] < 9) {

                arr[x] = arr[x] + 1;
                return arr;

            } else {
                arr[x] = 0;
            }
        }

        int zero[] = new int[n + 2];

        if (arr[0] == 0) {
            zero[0] = 1;
            return zero;
        }

        return arr;
    }
}

// 912. Sort an Array (28-10-2025)========
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//Given an array of integers nums, sort the array in ascending order and return it.
//
//You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest
// space complexity possible.
//
//
//
//Example 1:
//
//Input: nums = [5,2,3,1]
//Output: [1,2,3,5]
//Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while
// the positions of other numbers are changed (for example, 1 and 5).
//Example 2:
//
//Input: nums = [5,1,1,2,0,0]
//Output: [0,0,1,1,2,5]
//Explanation: Note that the values of nums are not necessarily unique.


class CountingSort {
    static void main() {

        int testcase1[] = {5, 2, 3, 1, 1, 1};
        System.out.println(Arrays.toString(SortCount(testcase1)));
    }

    public static int[] SortCount(int num[]) {

        Map<Integer, Integer> map = new HashMap<>();

        int min = num[0], max = num[0];

        for (int i = 0; i < num.length; i++) {

            map.put(num[i], map.getOrDefault(num[i], 0) + 1);
            System.out.println(map);

            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }
        int index = 0;

        for (int i = min; i <= max; i++) {

            while (map.getOrDefault(i, 0) > 0) {
                num[index++] = i;

                map.put(i, map.get(i) - 1);
            }

        }
        return num;
    }
}

// 463. Island Perimeter (29-10-2025)=================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
//
//Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there
// is exactly one island (i.e., one or more connected land cells).
//
//The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a
// square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
//
//
//
//Example 1:
//
//
//Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
//Output: 16
//Explanation: The perimeter is the 16 yellow stripes in the image above.
//Example 2:
//
//Input: grid = [[1]]
//Output: 4
//Example 3:
//
//Input: grid = [[1,0]]
//Output: 4


class IslandPerimeter {
    static void main() {

        int testcase1[][] = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        System.out.println((Island(testcase1)));

    }

    public static int Island(int[][] gird) {

        int perimeter = 0;

        int row = gird.length;
        int col = gird[0].length;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                if (gird[i][j] == 1) {

                    perimeter += 4;

                    if (i > 0 && gird[i - 1][j] == 1) {
                        perimeter -= 2;
                    }
                    if (j > 0 && gird[i][j - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }
}

// 1046. Last Stone Weight (30-10-2025)======================================================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//You are given an array of integers stones where stones[i] is the weight of the ith stone.
//
//We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together.
// Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
//
//If x == y, both stones are destroyed, and
//If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
//At the end of the game, there is at most one stone left.
//
//Return the weight of the last remaining stone. If there are no stones left, return 0.
//
//
//
//Example 1:
//
//Input: stones = [2,7,4,1,8,1]
//Output: 1
//Explanation:
//We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
//we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
//we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
//we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.
//Example 2:
//
//Input: stones = [1]
//Output: 1


class Stones {
    static void main() {
        int[] testcase1 = {2, 7, 4, 1, 8, 1};
        int[] testcase2 = {31, 26, 33, 21, 40};
        int[] testcase3 = {-1, -1};
        System.out.println(Weight(testcase1));
        System.out.println(Weight(testcase2));
        System.out.println(Weight(testcase3));
    }

    public static int Weight(int arr[]) {

        List<Integer> list = new ArrayList<>();

        for (int c : arr) {
            list.add(c);

        }
        System.out.println("list value :: " + list);

        while (list.size() > 1) {
            Collections.sort(list);

            System.out.println("list value  sort :: " + list);

            int max1 = list.remove(list.size() - 1);
            int max2 = list.remove(list.size() - 1);

            if (max1 != max2) {
                list.add(max1 - max2);
            }
        }
        return list.isEmpty() ? 0 : list.get(0);
    }
}


// 1464. Maximum Product of Two Elements in an Array
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value
// of (nums[i]-1)*(nums[j]-1).
//
//
//Example 1:
//
//Input: nums = [3,4,5,2]
//Output: 12
//Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is,
// (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
//Example 2:
//
//Input: nums = [1,5,4,5]
//Output: 16
//Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
//Example 3:
//
//Input: nums = [3,7]
//Output: 12


class MaximumProduct {
    static void main() {
        int testcase1[] = {3, 4, 5, 2};
        System.out.println(Product(testcase1));
    }

    public static int Product(int[] nums) {

        int max1 = 0, max2 = 0;
        for (int n : nums) {
            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max2 = n;
            }
        }
        return (max1 - 1) * (max2 - 1);

    }
}

//   215. Kth Largest Element in an Array (30-10-2025)=============================================================
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//Given an integer array nums and an integer k, return the kth largest element in the array.
//
//Note that it is the kth largest element in the sorted order, not the kth distinct element.
//
//Can you solve it without sorting?
//
//
//
//Example 1:
//
//Input: nums = [3,2,1,5,6,4], k = 2
//Output: 5
//Example 2:
//
//Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
//Output: 4
//


class KthLargestElement {
    static void main() {

        int testcase1[] = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(Kth(testcase1, k));
    }

    public static int Kth(int arr[], int k) {

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int c : arr) {
            q.offer(c);

            if (q.size() > k) {
                q.poll();
            }
        }

        return q.peek();
    }
}


// 350. Intersection of Two Arrays II   (31-10-2025)============================================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear
// as many times as it shows in both arrays and you may return the result in any order.
//
//
//
//Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
//Example 2:
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9]
//Explanation: [9,4] is also accepted.

class Intersection {
    static void main() {
        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2};

        System.out.println(Arrays.toString(Also(nums1, nums2)));
    }

    public static int[] Also(int nums1[], int nums2[]) {

        List<Integer> list = new ArrayList<>();


        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;

            } else {
                j++;
            }
        }
        int[] result = new int[list.size()];

        int d = 0;

        for (int c : list) {
            result[d++] = c;

        }
        return result;
    }
}

// 205. Isomorphic Strings  (31-10-2025)==============================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Given two strings s and t, determine if they are isomorphic.
//
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//All occurrences of a character must be replaced with another character while preserving the order of
// characters. No two characters may map to the same character, but a character may map to itself.
//
//
//
//Example 1:
//
//Input: s = "egg", t = "add"
//
//Output: true
//
//Explanation:
//
//The strings s and t can be made identical by:
//
//Mapping 'e' to 'a'.
//Mapping 'g' to 'd'.
//Example 2:
//
//Input: s = "foo", t = "bar"
//
//Output: false
//
//Explanation:
//
//The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
//
//Example 3:
//
//Input: s = "paper", t = "title"
//
//Output: true


class Isomorphic {
    static void main() {
        String s = "egg", t = "add";
        System.out.println(Mapping(s, t));
    }

    public static boolean Mapping(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] maps = new int[256];
        int[] mapt = new int[256];


        for (int i = 0; i < s.length(); i++) {

            char S = s.charAt(i);
            char T = t.charAt(i);

            if (maps[S] != mapt[T]) {
                return false;
            } else {
                maps[S] = i + 1;
                mapt[T] = i + 1;

            }
        }
        return true;
    }
}

// 128. Longest Consecutive Sequence (31-10-2025)===================
//Medium
//Topics
//premium lock icon
//Companies
//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//
//You must write an algorithm that runs in O(n) time.
//
//
//
//Example 1:
//
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
//Example 2:
//
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9
//Example 3:
//
//Input: nums = [1,0,1,2]
//Output: 3

class LongestConsecutiveSequence {
    static void main() {

        int testcase1[] = {100, 4, 200, 1, 3, 2};
        System.out.println(Sequence(testcase1));
    }

    public static int Sequence(int nums[]) {

        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int curr = 1;
        int longest = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] == nums[i - 1] + 1) {
                curr++;
            } else {
                longest = Math.max(longest, curr);
                curr = 1;
            }
        }
        return Math.max(longest, curr);


    }
}

// 3289. The Two Sneaky Numbers of Digitville  (31-10-2025)================================
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//In the town of Digitville, there was a list of numbers called nums containing integers
// from 0 to n - 1. Each number was supposed to appear exactly once in the list, however,
// wo mischievous numbers sneaked in an additional time, making the list longer than usual.
//
//As the town detective, your task is to find these two sneaky numbers. Return an array of
// size two containing the two numbers (in any order), so peace can return to Digitville.
//
//
//
//Example 1:
//
//Input: nums = [0,1,1,0]
//
//Output: [0,1]
//
//Explanation:
//
//The numbers 0 and 1 each appear twice in the array.
//
//Example 2:
//
//Input: nums = [0,3,2,1,3,2]
//
//Output: [2,3]
//
//Explanation:
//
//The numbers 2 and 3 each appear twice in the array.
//
//Example 3:
//
//Input: nums = [7,1,5,4,3,4,6,0,9,5,8,2]
//
//Output: [4,5]
//
//Explanation:
//
//The numbers 4 and 5 each appear twice in the array.
//
//

class TwoSneakyNumbers {
    static void main() {
        int testcase1[] = {0, 1, 1, 0};
        System.out.println(Arrays.toString(Digitville(testcase1)));
    }

    public static int[] Digitville(int[] nums) {

        int ans[] = new int[2];

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    ans[count++] = nums[i];
                }
            }
        }
        return ans;

    }
}

//852. Peak Index in a Mountain Array  (01-11-2025)===================================================================
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//
//Return the index of the peak element.
//
//Your task is to solve it in O(log(n)) time complexity.
//
//
//
//Example 1:
//
//Input: arr = [0,1,0]
//
//Output: 1
//
//Example 2:
//
//Input: arr = [0,2,1,0]
//
//Output: 1
//
//Example 3:
//
//Input: arr = [0,10,5,2]
//
//Output: 1
//
//

class MountainArray {

    static void main() {

        int testcase1[] = {0, 1, 2, 1};
        System.out.println(Mountain(testcase1));
    }

    public static int Mountain(int arr[]) {

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            int mid = (l + r) / 2;

            if (arr[mid] < arr[mid + 1]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}


// 228. Summary Ranges (01-11-2025)============================================
//Easy
//Topics
//premium lock icon
//Companies
//You are given a sorted unique integer array nums.
//
//A range [a,b] is the set of all integers from a to b (inclusive).
//
//Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is,
// each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the
// ranges but not in nums.
//
//Each range [a,b] in the list should be output as:
//
//"a->b" if a != b
//"a" if a == b
//
//
//Example 1:
//
//Input: nums = [0,1,2,4,5,7]
//Output: ["0->2","4->5","7"]
//Explanation: The ranges are:
//[0,2] --> "0->2"
//[4,5] --> "4->5"
//[7,7] --> "7"
//Example 2:
//
//Input: nums = [0,2,3,4,6,8,9]
//Output: ["0","2->4","6","8->9"]
//Explanation: The ranges are:
//[0,0] --> "0"
//[2,4] --> "2->4"
//[6,6] --> "6"
//[8,9] --> "8->9"


class SummaryRanges {
    static void main() {
        int testcas1[] = {0, 1, 2, 4, 5, 7};
        System.out.println(Ranges(testcas1));
    }

    public static List<String> Ranges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0) return result;


        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                start = nums[i];
            }
        }
        if (start == nums[nums.length - 1]) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[nums.length - 1]);
        }
        return result;
    }
}


// 693. Binary Number with Alternating Bits (03-11-2025)=================================
//Easy
//Topics
//premium lock icon
//Companies
//Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have
// different values.
//
//
//
//Example 1:
//
//Input: n = 5
//Output: true
//Explanation: The binary representation of 5 is: 101
//Example 2:
//
//Input: n = 7
//Output: false
//Explanation: The binary representation of 7 is: 111.
//Example 3:
//
//Input: n = 11
//Output: false
//Explanation: The binary representation of 11 is: 1011.
//


class BinaryNumber {
    public static void main(String[] args) {
        int testcase1 = 5;
        System.out.println(Bites(testcase1));
    }

    public static boolean Bites(int n) {
        while (n != 0) {
            int a = (n & 1);
            n >>= 1;
            int b = (n & 1);
            if (a == b)
                return false;
        }
        return true;
    }
}


// 287. Find the Duplicate Number (03-11-2025)=====================================================
//Medium
//Topics
//premium lock icon
//Companies
//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//There is only one repeated number in nums, return this repeated number.
//
//You must solve the problem without modifying the array nums and using only constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [1,3,4,2,2]
//Output: 2
//Example 2:
//
//Input: nums = [3,1,3,4,2]
//Output: 3
//Example 3:
//
//Input: nums = [3,3,3,3,3]
//Output: 3


class FindtheDuplicate {                   //      xxxxxxxxxx Answer
    static void main() {
        int testcase1[] = {1, 3, 4, 2, 2};

        System.out.println(Find(testcase1));
    }

    public static int Find(int nums[]) {

        int slow = nums[0];
        int fast = nums[0];


        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}

// Binary Search Approach

class FindtheDuplicate1 {
    public static void main(String[] args) {
//        int[] testcase1 = {1, 3, 4, 2, 2};
        int[] testcase2 = {3, 1, 3, 4, 2};
        int[] testcase3 = {3, 3, 3, 3, 3};

//        System.out.println(findDuplicate(testcase1));
        System.out.println(findDuplicate(testcase2));
        System.out.println(findDuplicate(testcase3));
    }

    public static int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 1;
        int duplicate = -1;

        while (low <= high) {
            int mid = (high + low) / 2;


            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            if (count > mid) {

                duplicate = mid;
                high = mid - 1;
            } else {

                low = mid + 1;
            }
        }

        return duplicate;
    }
}


// 1009. Complement of Base 10 Integer  *(03-11-2025)===================================
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in
// its binary representation.
//
//For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
//Given an integer n, return its complement.
//
//
//
//Example 1:
//
//Input: n = 5
//Output: 2
//Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
//Example 2:
//
//Input: n = 7
//Output: 0
//Explanation: 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.
//Example 3:
//
//Input: n = 10
//Output: 5
//Explanation: 10 is "1010" in binary, with complement "0101" in binary, which is 5 in base-10.


class Complement {
    static void main() {
        int testcase1 = 5;
        System.out.println(Bits(testcase1));
    }

    public static int Bits(int n) {

        int m = 0;
        int temp = n;

        while (temp > 0) {

            m = (m << 1) | 1;

            temp >>= 1;
        }

        return n ^ m;
    }
}


// 476. Number Complement  (03-11-2025)==================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its
// binary representation.
//
//For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
//Given an integer num, return its complement.
//
//
//
//Example 1:
//
//Input: num = 5
//Output: 2
//Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
//Example 2:
//
//Input: num = 1
//Output: 0
//Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
//


class NumberComplement {
    static void main() {
        int testcase1 = 5;
        System.out.println(Complement(testcase1));
    }

    public static int Complement(int n) {

        int m = 0;
        int t = n;

        while (t > 0) {

            m = (m << 1) | 1;

            t >>= 1;
        }

        return n ^ m;
    }
}

// 231. Power of Two  (03-11-2025)====================================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Given an integer n, return true if it is a power of two. Otherwise, return false.
//
//An integer n is a power of two, if there exists an integer x such that n == 2x.
//
//
//
//Example 1:
//
//Input: n = 1
//Output: true
//Explanation: 20 = 1
//Example 2:
//
//Input: n = 16
//Output: true
//Explanation: 24 = 16
//Example 3:
//
//Input: n = 3
//Output: false
//


class PowerofTwo {
    static void main() {
        int testcase1 = 5;
        System.out.println(Power(testcase1));
    }

    public static boolean Power(int n) {


        if (n > 0 && (n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }
}


// 55. Jump Game   (04-11-2025)=========================================================
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the
// array represents your maximum jump length at that position.
//
//Return true if you can reach the last index, or false otherwise.
//
//
//
//Example 1:
//
//Input: nums = [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
//Example 2:
//
//Input: nums = [3,2,1,0,4]
//Output: false
//Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible
// to reach the last index.


class JumpGame {
    static void main() {
        int testcase1[] = {2, 3, 1, 1, 4};
        System.out.println(Game(testcase1));
    }

    public static boolean Game(int nums[]) {
        int point = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > point) {
                return false;
            }

            point = Math.max(point, i + nums[i]);

        }
        return true;
    }
}


// 746. Min Cost Climbing Stairs (04-11-2025)=========================================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost,
// you can either climb one or two steps.
//
//You can either start from the step with index 0, or the step with index 1.
//
//Return the minimum cost to reach the top of the floor.
//
//
//
//Example 1:
//
//Input: cost = [10,15,20]
//Output: 15
//Explanation: You will start at index 1.
//- Pay 15 and climb two steps to reach the top.
//The total cost is 15.
//Example 2:
//
//Input: cost = [1,100,1,1,1,100,1,1,100,1]
//Output: 6
//Explanation: You will start at index 0.
//- Pay 1 and climb two steps to reach index 2.
//- Pay 1 and climb two steps to reach index 4.
//- Pay 1 and climb two steps to reach index 6.
//- Pay 1 and climb one step to reach index 7.
//- Pay 1 and climb two steps to reach index 9.
//- Pay 1 and climb one step to reach the top.
//The total cost is 6.


class ClimbingStairs {
    static void main() {
//          int testcase1 [] ={10,15,20};
        int testcase2[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
//        System.out.println(Stairs(testcase1));
        System.out.println(Stairs(testcase2));
    }

    public static int Stairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(cost[i - 1] + dp[i - 1], cost[i - 2] + dp[i - 2]);
        }
        return dp[n];
    }
}


// 338. Counting Bits (04-11-2025)=============================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
// ans[i] is the number of 1's in the binary representation of i.
//
//
//
//Example 1:
//
//Input: n = 2
//Output: [0,1,1]
//Explanation:
//0 --> 0
//1 --> 1
//2 --> 10
//Example 2:
//
//Input: n = 5
//Output: [0,1,1,2,1,2]
//Explanation:
//0 --> 0
//1 --> 1
//2 --> 10
//3 --> 11
//4 --> 100
//5 --> 101
//

class CountingBits {
    static void main() {
        int testcase1 = 2;
        System.out.println(Arrays.toString(Bitess(testcase1)));
    }

    public static int[] Bitess(int n) {
        int f[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            f[i] = f[i >> 1] + (i & 1);
        }
        return f;
    }
}


// 724. Find Pivot Index   (07-11-2025)==================================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given an array of integers nums, calculate the pivot index of this array.
//
//The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the
// sum of all the numbers strictly to the index's right.
//
//If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
// This also applies to the right edge of the array.
//
//Return the leftmost pivot index. If no such index exists, return -1.
//
//
//
//Example 1:
//
//Input: nums = [1,7,3,6,5,6]
//Output: 3
//Explanation:
//The pivot index is 3.
//Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//Right sum = nums[4] + nums[5] = 5 + 6 = 11
//Example 2:
//
//Input: nums = [1,2,3]
//Output: -1
//Explanation:
//There is no index that satisfies the conditions in the problem statement.
//Example 3:
//
//Input: nums = [2,1,-1]
//Output: 0
//Explanation:
//The pivot index is 0.
//Left sum = 0 (no elements to the left of index 0)
//Right sum = nums[1] + nums[2] = 1 + -1 = 0
//


class FindPivot {
    static void main() {

        int testcase1[] = {1, 7, 3, 6, 5, 6};
        System.out.println(Find(testcase1));
    }

    public static int Find(int arr[]) {
        int sum = 0;
        for (int c : arr) {
            sum += c;
        }

        int left = 0;

        for (int i = 0; i < arr.length; i++) {

            int right = sum - left - arr[i];

            if (right == left) {
                return i;
            }
            left += arr[i];
        }
        return -1;
    }
}

//1991. Find the Middle Index in Array (07-11-2025)====================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).
//
//A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2]
// + ... + nums[nums.length-1].
//
//If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side
// sum is considered to be 0.
//
//Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
//
//
//
//Example 1:
//
//Input: nums = [2,3,-1,8,4]
//Output: 3
//Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
//The sum of the numbers after index 3 is: 4 = 4
//Example 2:
//
//Input: nums = [1,-1,4]
//Output: 2
//Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
//The sum of the numbers after index 2 is: 0
//Example 3:
//
//Input: nums = [2,5]
//Output: -1
//Explanation: There is no valid middleIndex.
//
//
//Constraints:
//
//1 <= nums.length <= 100
//-1000 <= nums[i] <= 1000


class FindPivott {
    static void main() {

        int testcase1[] = {2, 3, -1, 8, 4};
        System.out.println(Find(testcase1));
    }

    public static int Find(int arr[]) {
        int sum = 0;
        for (int c : arr) {
            sum += c;
        }

        int left = 0;

        for (int i = 0; i < arr.length; i++) {

            int right = sum - left - arr[i];

            if (right == left) {
                return i;
            }
            left += arr[i];
        }
        return -1;
    }
}


// 1422. Maximum Score After Splitting a String  (07-11-2025)==============================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings
// (i.e. left substring and right substring).
//
//The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right
// substring.
//
//
//
//Example 1:
//
//Input: s = "011101"
//Output: 5
//Explanation:
//All possible ways of splitting s into two non-empty substrings are:
//left = "0" and right = "11101", score = 1 + 4 = 5
//left = "01" and right = "1101", score = 1 + 3 = 4
//left = "011" and right = "101", score = 1 + 2 = 3
//left = "0111" and right = "01", score = 1 + 1 = 2
//left = "01110" and right = "1", score = 2 + 1 = 3
//Example 2:
//
//Input: s = "00111"
//Output: 5
//Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
//Example 3:
//
//Input: s = "1111"
//Output: 3
//


class ScoreAfteSplitting {
    static void main() {
        String testcase1 = "011101";
        System.out.println(ScoreAfter(testcase1));
    }

    public static int ScoreAfter(String s) {

        int max = 0, zero = 0, ones = 0;
        int n = s.length();


        for (char c : s.toCharArray()) {

            if (c == '1') {
                ones++;
            }
        }


        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                zero++;
            } else {
                ones--;
            }
            max = Math.max(max, ones + zero);
        }
        return max;

    }
}

// 150. Evaluate Reverse Polish Notation (10-11-2025)==============================================
//Solved
//Medium
//Topics
//premium lock icon
//Companies
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
//= ((10 * (6 / (12 * -11))) + 17) + 5
//= ((10 * (6 / -132)) + 17) + 5
//= ((10 * 0) + 17) + 5
//= (0 + 17) + 5
//= 17 + 5
//= 22
//
//
//Constraints:
//
//1 <= tokens.length <= 104
//tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].


class EvaluateReverse {
    static void main() {
        String testcase1[] = {"2", "1", "+", "3", "*"};
        System.out.println(Reverse(testcase1));
    }

    public static int Reverse(String tokens[]) {
        int arr[] = new int[tokens.length];

        int i = 0;


        for (String c : tokens) {
            switch (c) {
                case "+":
                    arr[i - 2] = arr[i - 2] + arr[i - 1];
                    i--;
                    break;

                case "-":
                    arr[i - 2] = arr[i - 2] - arr[i - 1];
                    i--;
                    break;
                case "*":
                    arr[i - 2] = arr[i - 2] * arr[i - 1];
                    i--;
                    break;
                case "/":
                    arr[i - 2] = arr[i - 2] / arr[i - 1];
                    i--;
                    break;
                default:
                    arr[i++] = Integer.parseInt(c);
                    break;

            }
        }
        return arr[0];
    }
}


// 35. Search Insert Position    (11-11-2025)========================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
// return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4
//
//
//Constraints:
//
//1 <= nums.length <= 104
//-104 <= nums[i] <= 104
//nums contains distinct values sorted in ascending order.
//-104 <= target <= 104


class SearchInsert {
    static void main() {

        int testcase1[] = {1, 3, 5, 6};
        int target = 5;
        System.out.println(Insert(testcase1, target));

    }

    public static int Insert(int arr[], int n) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;


            if (arr[mid] == n) {
                return mid;
            }

            if (arr[mid] < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}


// 832. Flipping an Image  (12-11-2025)=============================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
//
//To flip an image horizontally means that each row of the image is reversed.
//
//For example, flipping [1,1,0] horizontally results in [0,1,1].
//To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
//
//For example, inverting [0,1,1] results in [1,0,0].
//
//
//Example 1:
//
//Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//Output: [[1,0,0],[0,1,0],[1,1,1]]
//Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
//Example 2:
//
//Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
//Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
//Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//
//
//Constraints:
//
//n == image.length
//n == image[i].length
//1 <= n <= 20
//images[i][j] is either 0 or 1.


class Image {
    static void main() {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        System.out.println(Arrays.deepToString(FlippingImage(image)));

    }

    public static int[][] FlippingImage(int[][] image) {
        int n = image.length;

        for (int i = 0; i < n; i++) {
            int left = 0, right = image[i].length - 1;


            while (left <= right) {
                if (left == right) {
                    image[i][left] ^= 1;
                } else {
                    int templeft = image[i][left] ^= 1;
                    image[i][left] = image[i][right] ^= 1;
                    image[i][right] = templeft;
                }
                left++;
                right--;
            }

        }
        return image;
    }
}

// 485. Max Consecutive Ones   (12-11-2025)=========================================================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//
//
//
//Example 1:
//
//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
//Example 2:
//
//Input: nums = [1,0,1,1,0,1]
//Output: 2
//
//
//Constraints:
//
//1 <= nums.length <= 105
//nums[i] is either 0 or 1.


class Max1s {
    static void main() {
        int testcase[] = {1, 0, 1, 1, 1, 1, 0};
        System.out.println(ConsecutiveOnes(testcase));
    }

    static int ConsecutiveOnes(int arr[]) {
        int count = 0, res = 0, max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {

                res = Math.max(res, count);
                count = 0;
            }
        }
        return Math.max(res, max);
    }
}

// 1281. Subtract the Product and Sum of Digits of an Integer  (13-11-2025)============================================
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given an integer number n, return the difference between the product of its digits and the sum of its digits.
//
//
//Example 1:
//
//Input: n = 234
//Output: 15
//Explanation:
//Product of digits = 2 * 3 * 4 = 24
//Sum of digits = 2 + 3 + 4 = 9
//Result = 24 - 9 = 15
//Example 2:
//
//Input: n = 4421
//Output: 21
//Explanation:
//Product of digits = 4 * 4 * 2 * 1 = 32
//Sum of digits = 4 + 4 + 2 + 1 = 11
//Result = 32 - 11 = 21
//
//
//Constraints:
//
//1 <= n <= 10^5


class SumofDigits {
    static void main() {
        int testcase = 234;
        System.out.println(SubtractProduct(testcase));
    }

    static int SubtractProduct(int n) {
        int sum = 0;
        int pro = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            pro *= digit;
            n /= 10;
        }

        return pro - sum;
    }
}


// 316. Remove Duplicate Letters
//Medium
//Topics
//premium lock icon
//Companies
//Hint
//Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your
// result is the smallest in lexicographical order among all possible results.
//
//
//
//Example 1:
//
//Input: s = "bcabc"
//Output: "abc"
//Example 2:
//
//Input: s = "cbacdcbc"
//Output: "acdb"
//
//
//Constraints:
//
//1 <= s.length <= 104
//s consists of lowercase English letters.


class RemoveDuplicatee {
    static void main() {
        String testcase = "bcabc";
        System.out.println(Remo(testcase));
    }

    public static String Remo(String s) {

        int[] arr = new int[26];

        for (char c : s.toCharArray()) {

            arr[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        char ch = 'a';

        for (int i : arr) {
            if (i >= 1) {
                sb.append(ch);
            }
            ch++;
        }

        return sb.toString();
    }
}


// 1768. Merge Strings Alternately (15-11-2025)=======================================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
// If a string is longer than the other, append the additional letters onto the end of the merged string.
//
//Return the merged string.
//
//
//
//Example 1:
//
//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
//Explanation: The merged string will be merged as so:
//word1:  a   b   c
//word2:    p   q   r
//merged: a p b q c r
//Example 2:
//
//Input: word1 = "ab", word2 = "pqrs"
//Output: "apbqrs"
//Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//word1:  a   b
//word2:    p   q   r   s
//merged: a p b q   r   s
//Example 3:
//
//Input: word1 = "abcd", word2 = "pq"
//Output: "apbqcd"
//Explanation: Notice that as word1 is longer, "cd" is appended to the end.
//word1:  a   b   c   d
//word2:    p   q
//merged: a p b q c   d
//
//
//Constraints:
//
//1 <= word1.length, word2.length <= 100
//word1 and word2 consist of lowercase English letters.


class MergeStrings {
    static void main() {

        String word1 = "abc", word2 = "pqr";

        System.out.println(Merge(word1, word2));

    }

    public static String Merge(String s, String s1) {

        String result = " ";


        int max = Math.max(s.length(), s1.length());


        for (int i = 0; i < max; i++) {

            if (i < s.length()) {

                result += s.charAt(i);
            }
            if (i < s1.length()) {
                result += s1.charAt(i);
            }
        }

        return result;

    }
}


// 3228. Maximum Number of Operations to Move Ones to the End   (15-11-2025)===========================================
//Medium
//Topics
//premium lock icon
//Companies
//Hint
//You are given a binary string s.
//
//You can perform the following operation on the string any number of times:
//
//Choose any index i from the string where i + 1 < s.length such that s[i] == '1' and s[i + 1] == '0'.
//Move the character s[i] to the right until it reaches the end of the string or another '1'. For example,
// for s = "010010", if we choose i = 1, the resulting string will be s = "000110".
//Return the maximum number of operations that you can perform.
//
//
//
//Example 1:
//
//Input: s = "1001101"
//
//Output: 4
//
//Explanation:
//
//We can perform the following operations:
//
//Choose index i = 0. The resulting string is s = "0011101".
//Choose index i = 4. The resulting string is s = "0011011".
//Choose index i = 3. The resulting string is s = "0010111".
//Choose index i = 2. The resulting string is s = "0001111".
//Example 2:
//
//Input: s = "00111"
//
//Output: 0
//
//
//
//Constraints:
//
//1 <= s.length <= 105
//s[i] is either '0' or '1'.


class MoveOnestheEnd {
    static void main() {
        String s = "1001101";
        System.out.println(MoveOne(s));
    }

    public static int MoveOne(String ss) {

        int count = 0;
        int max = 0;


        for (int i = 0; i < ss.length(); i++) {

            if (ss.charAt(i) == '1') {
                max++;
            } else if (i > 0 && ss.charAt(i - 1) == '1') {

                count += max;

            }
        }

        return count;
    }
}

// 389. Find the Difference  16-11-2025)================================================================================
//Easy
//Topics
//premium lock icon
//Companies
//You are given two strings s and t.
//
//String t is generated by random shuffling string s and then add one more letter at a random position.
//
//Return the letter that was added to t.
//
//
//
//Example 1:
//
//Input: s = "abcd", t = "abcde"
//Output: "e"
//Explanation: 'e' is the letter that was added.
//Example 2:
//
//Input: s = "", t = "y"
//Output: "y"
//
//
//Constraints:
//
//0 <= s.length <= 1000
//t.length == s.length + 1
//s and t consist of lowercase English letters.

class FindDifference {
    static void main() {
        String s = "abcd";
        String t = "eabcd";

        System.out.println(Find(s, t));
    }

    public static char Find(String s, String t) {

        char c = 0;
        for (char cs : s.toCharArray())

            c ^= cs;

        for (char ct : t.toCharArray())

            c ^= ct;

        return c;
    }
}

// 48. Rotate Image  (17-11-2025)=======================================================================================
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//
//You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT alloca
// another 2D matrix and do the rotation.
//
//
//
//Example 1:
//
//
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[7,4,1],[8,5,2],[9,6,3]]
//Example 2:
//
//
//Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
//
//
//Constraints:
//
//n == matrix.length == matrix[i].length
//1 <= n <= 20
//-1000 <= matrix[i][j] <= 1000


class RotateImage {
    public static void main(String[] args) {

        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = mat.length;


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][k];
                mat[i][k] = temp;
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// 1886. Determine Whether Matrix Can Be Obtained By Rotation  (17-11-2025)==============================
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat
// in 90-degree increments, or false otherwise.
//
//
//
//Example 1:
//
//
//Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
//Output: true
//Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
//Example 2:
//
//
//Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
//Output: false
//Explanation: It is impossible to make mat equal to target by rotating mat.
//Example 3:
//
//
//Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
//Output: true
//Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
//
//
//Constraints:
//
//n == mat.length == target.length
//n == mat[i].length == target[i].length
//1 <= n <= 10
//mat[i][j] and target[i][j] are either 0 or 1.


class ObtainedRotation {
    static void main() {

        int mat[][] = {
                {0, 1},
                {1, 0}
        };


        int n = mat.length;


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = mat[i][j];

                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {

                int temp = mat[i][j];

                mat[i][j] = mat[i][k];
                mat[i][k] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(mat[i][j]);
            }
            System.out.println();

        }
    }

}

// 2154. Keep Multiplying Found Values by Two (22-11-2025)====================================================
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//You are given an array of integers nums. You are also given an integer original which is the first number that needs to be searched for in nums.
//
//You then do the following steps:
//
//If original is found in nums, multiply it by two (i.e., set original = 2 * original).
//Otherwise, stop the process.
//Repeat this process with the new number as long as you keep finding the number.
//Return the final value of original.
//
//
//
//Example 1:
//
//Input: nums = [5,3,6,1,12], original = 3
//Output: 24
//Explanation:
//- 3 is found in nums. 3 is multiplied by 2 to obtain 6.
//- 6 is found in nums. 6 is multiplied by 2 to obtain 12.
//- 12 is found in nums. 12 is multiplied by 2 to obtain 24.
//- 24 is not found in nums. Thus, 24 is returned.
//Example 2:
//
//Input: nums = [2,7,9], original = 4
//Output: 4
//Explanation:
//- 4 is not found in nums. Thus, 4 is returned.

class MultiplyingFoundValues {
    static void main() {

        int nums[] = {5, 3, 6, 1, 12};
        int original = 3;
        System.out.println(Found(nums, original));
    }

    public static int Found(int nums[], int original) {
        boolean found = true;

        while (found) {
            found = false;

            for (int num : nums) {
                if (num == original) {
                    original = original * 2;
                    found = true;
                    break;
                }
            }
        }

        return original;
    }
}

// 3190. Find Minimum Operations to Make All Elements Divisible by Three  (22-11-2025)======================
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.
//
//Return the minimum number of operations to make all elements of nums divisible by 3.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//
//Output: 3
//
//Explanation:
//
//All array elements can be made divisible by 3 using 3 operations:
//
//Subtract 1 from 1.
//Add 1 to 2.
//Subtract 1 from 4.
//Example 2:
//
//Input: nums = [3,6,9]
//
//Output: 0
//
//
//
//Constraints:
//
//1 <= nums.length <= 50
//1 <= nums[i] <= 50


class FindMinimumOperations {

    static void main() {

        int nums[] = {1, 2, 3, 4};
        System.out.println(Operations(nums));
    }

    public static int Operations(int nums[]) {

        int count = 0;


        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 3 != 0) {

                nums[i] = nums[i] + 1;
                count++;
            }
        }
        return count;
    }
}


// 1018. Binary Prefix Divisible By 5  *  *(24.11.2025)=================================================
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//You are given a binary array nums (0-indexed).
//
//We define xi as the number whose binary representation is the subarray nums[0..i] (from most-significant-bit to least-significant-bit).
//
//For example, if nums = [1,0,1], then x0 = 1, x1 = 2, and x2 = 5.
//Return an array of booleans answer where answer[i] is true if xi is divisible by 5.
//
//
//
//Example 1:
//
//Input: nums = [0,1,1]
//Output: [true,false,false]
//Explanation: The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.
//Only the first number is divisible by 5, so answer[0] is true.
//Example 2:
//
//Input: nums = [1,1,1]
//Output: [false,false,false]
//
//
//Constraints:
//
//1 <= nums.length <= 105
//nums[i] is either 0 or 1.


class BinaryPrefix {

    static void main() {

        int nums[] = {0, 1, 1};
        System.out.println(Prefix(nums));
    }

    public static List<Boolean> Prefix(int nums[]) {

        List<Boolean> ans = new ArrayList<>();
        int msb = 0;
        for (int x : nums) {
            msb = ((msb << 1) + x) % 5;
            ans.add(msb == 0);
        }
        return ans;
    }
}

// 2810. Faulty Keyboard (25-11-2025)===================================================
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have
// written. Typing other characters works as expected.
//
//You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.
//
//Return the final string that will be present on your laptop screen.
//
//
//
//Example 1:
//
//Input: s = "string"
//Output: "rtsng"
//Explanation:
//After typing first character, the text on the screen is "s".
//After the second character, the text is "st".
//After the third character, the text is "str".
//Since the fourth character is an 'i', the text gets reversed and becomes "rts".
//After the fifth character, the text is "rtsn".
//After the sixth character, the text is "rtsng".
//Therefore, we return "rtsng".
//Example 2:
//
//Input: s = "poiinter"
//Output: "ponter"
//Explanation:
//After the first character, the text on the screen is "p".
//After the second character, the text is "po".
//Since the third character you type is an 'i', the text gets reversed and becomes "op".
//Since the fourth character you type is an 'i', the text gets reversed and becomes "po".
//After the fifth character, the text is "pon".
//After the sixth character, the text is "pont".
//After the seventh character, the text is "ponte".
//After the eighth character, the text is "ponter".
//Therefore, we return "ponter".
//
//
//Constraints:
//
//1 <= s.length <= 100
//s consists of lowercase English letters.
//s[0] != 'i'


class FaultyKeyboard {

    static void main() {

        String s = "poiinter";
        System.out.println(Keyboard(s));
    }

    static String Keyboard(String s) {


        String str = "";


        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != 'i') {

                str = str + s.charAt(i);
            } else {

                str = new StringBuilder(str).reverse().toString();
            }
        }
        return str;
    }
}

// 541. Reverse String II   (25-11-2025)===============================================================================
//Easy
//Topics
//premium lock icon
//Companies
//Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of
// the string.
//
//If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal
// to k characters, then reverse the first k characters and leave the other as original.
//
//
//
//Example 1:
//
//Input: s = "abcdefg", k = 2
//Output: "bacdfeg"
//Example 2:
//
//Input: s = "abcd", k = 2
//Output: "bacd"
//
//
//Constraints:
//
//1 <= s.length <= 104
//s consists of only lowercase English letters.
//1 <= k <= 104


class ReversStringII {

    static void main() {
        String s = "abcdef";
        int k = 2;
        System.out.println(ReversII(s, k));
    }

    static String ReversII(String s, int k) {

        char c[] = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, s.length() - 1);
            while (left < right) {
                char temp = c[right];
                c[right] = c[left];
                c[left] = temp;
                right--;
                left++;
            }
        }
        return new String(c);
    }
}


// 3512. Minimum Operations to Make Array Sum Divisible by K  (29-11-2025)====================
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//You are given an integer array nums and an integer k. You can perform the following operation any number of times:
//
//Select an index i and replace nums[i] with nums[i] - 1.
//Return the minimum number of operations required to make the sum of the array divisible by k.
//
//
//
//Example 1:
//
//Input: nums = [3,9,7], k = 5
//
//Output: 4
//
//Explanation:
//
//Perform 4 operations on nums[1] = 9. Now, nums = [3, 5, 7].
//The sum is 15, which is divisible by 5.
//Example 2:
//
//Input: nums = [4,1,3], k = 4
//
//Output: 0
//
//Explanation:
//
//The sum is 8, which is already divisible by 4. Hence, no operations are needed.
//Example 3:
//
//Input: nums = [3,2], k = 6
//
//Output: 5
//
//Explanation:
//
//Perform 3 operations on nums[0] = 3 and 2 operations on nums[1] = 2. Now, nums = [0, 0].
//The sum is 0, which is divisible by 6.
//
//
//Constraints:
//
//1 <= nums.length <= 1000
//1 <= nums[i] <= 1000
//1 <= k <= 100


class MinimumOperations {
    static void main() {
        int nums[] = {3, 9, 7};
        int k = 5;
        System.out.println(Operations(nums, k));
    }

    static int Operations(int num[], int k) {

        int sum = 0;

        for (int x : num) {
            sum += x;
        }

        return sum % k;
    }
}

// 316. Remove Duplicate Letters   (1-12-2025)===============================================
//Attempted
//Medium
//Topics
//premium lock icon
//Companies
//Hint
//Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure
// your result is the smallest in lexicographical order among all possible results.
//
//
//
//Example 1:
//
//Input: s = "bcabc"
//Output: "abc"
//Example 2:
//
//Input: s = "cbacdcbc"
//Output: "acdb"
//
//
//Constraints:
//
//1 <= s.length <= 104
//s consists of lowercase English letters.
//
//
//Note: This question is the same as 1081: https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/
//
//
//Seen this question in a real interview before?
//1/5
//Yes
//No
//Accepted
//416,736/796.8K
//Acceptance Rate
//52.3%


//class RemoveDuplicate1 {
//    static void main() {
//        String s ="bcabc";
//        System.out.println();
//    }
//    static String Letters(String s){
//
//        Map<Character,Integer> count = new HashMap<>();
//
//        for(char c :s.toCharArray()){
//             count.put(c)++
//        }
//    }
//}


// 415. Add Strings  (01-12-2025)===============================================================
//Easy
//Topics
//premium lock icon
//Companies
//Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
//
//You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
// You must also not convert the inputs to integers directly.
//
//
//
//Example 1:
//
//Input: num1 = "11", num2 = "123"
//Output: "134"
//Example 2:
//
//Input: num1 = "456", num2 = "77"
//Output: "533"
//Example 3:
//
//Input: num1 = "0", num2 = "0"
//Output: "0"
//
//
//Constraints:
//
//1 <= num1.length, num2.length <= 104
//num1 and num2 consist of only digits.
//num1 and num2 don't have any leading zeros except for the zero itself.


class AddString {
    static void main() {

        String s = "6913259244", s1 = "71103343";
        System.out.println(Add(s, s1));
    }

    static String Add(String num1, String num2) {

        BigInteger no1 = new BigInteger(num1);
        BigInteger no2 = new BigInteger(num2);
        BigInteger sum = no1.add(no2);
        return sum.toString();


    }
}

// 459. Repeated Substring Pattern  (02-12-2025)==============================================
//Easy
//Topics
//premium lock icon
//Companies
//Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of
// the substring together.
//
//
//
//Example 1:
//
//Input: s = "abab"
//Output: true
//Explanation: It is the substring "ab" twice.
//Example 2:
//
//Input: s = "aba"
//Output: false
//Example 3:
//
//Input: s = "abcabcabcabc"
//Output: true
//Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
//
//
//Constraints:
//
//1 <= s.length <= 104
//s consists of lowercase English letters.


class RepeatedSubstring {
    static void main() {
        String s = "ababc";
        System.out.println(Repeated(s));
    }

    static boolean Repeated(String s) {

        String bron = s + s;

        String sub = bron.substring(1, bron.length() - 1);

        return sub.contains(s);

    }

}