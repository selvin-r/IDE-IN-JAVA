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