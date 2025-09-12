import java.util.*;

public class DAY4 {
    public static void main(String[] args) {
//        int [] people ={3,2,2,1};
        int [] people={3,5,3,4};
        int limit =4;
         Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int boats=0;

        while(left<=right){

            if(people[left] + people[right] <=limit){
                left++;
            }
            right--;
            boats++;
        }
        System.out.println("Boats Value :" +boats);
    }
}

//// Compare
//
//class Compare {
//    public static void main(String[] args) {
//        String s ="1.0";
//        String s1 ="1.10";
//        System.out.println(Com(s,s1));
//    }
//    public static int Com(String s,String s1){
//
//       String b="";
//       String c="";
//
//
//    }
//}