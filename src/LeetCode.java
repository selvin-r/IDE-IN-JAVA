import java.util.HashSet;
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

