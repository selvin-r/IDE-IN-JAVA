//public class Hackerrank {
//    public static void main(String[] args) {
//
//    }
//}
//
////If we list all the natural numbers below  that are multiples of  or , we get  and . The sum of these multiples is .
////
////Find the sum of all the multiples of  or  below .
////
////Input Format
////
////First line contains  that denotes the number of test cases. This is followed by  lines, each containing an integer, .
////
////Constraints
////
////Output Format
////
////For each test case, print an integer that denotes the sum of all the multiples of  or  below .
////
////Sample Input 0
////
////2
////10
////100
////Sample Output 0
////
////23
////2318
//
//class Natural{
//    public static void main(String[] args) {
//        int t=2;
//        int n = 100;
//
//        while(t-->0){
//            int sum=0;
//
//            for(int i=0;i<n;i++){
//                if(i%3==0 || i%5==0){
//                    sum +=i;
//                }
//            }
//            System.out.println(sum);
//
//        }
//
//    }
//}
