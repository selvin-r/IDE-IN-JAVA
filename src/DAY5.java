import java.util.*;

public class DAY5 {
    public static void main(String[] args){
        String num1="123";
        String num2="456";

        System.out.println("Product: "+multiply(num1,num2));
    }

    public static String multiply(String num1,String num2){

        if((num1.equals("0") || num2.equals("0"))){
            return "0";
        }

        int n=num1.length();
        int m=num2.length();

        int[] result=new int[n+m];

        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int digits1=num1.charAt(i)-'0';
                int digits2=num2.charAt(j)-'0';

                int tempValue=digits1*digits2+result[i+j+1];

                result[i+j+1]=tempValue%10;
                result[i+j]=result[i+j]+tempValue/10;
            }
        }

        StringBuilder sb=new StringBuilder();

        for(int val:result){
            if(!(sb.length()==0 && val==0)){
                sb.append(val);
            }
        }
        return sb.toString();
    }
}

//Profit


class MaxProfit {
    public static int getMaxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        int [] prices3 ={3,2,6,5,0,3};

        System.out.println("Max Profit 1: " + getMaxProfit(prices1));
        System.out.println("Max Profit 2: " + getMaxProfit(prices2));
        System.out.println("Max profit 3" +  getMaxProfit(prices3));
    }
}

// IP

class ValidateIPv4 {
    public static boolean isValidIPv4(String ip) {
        String[] parts = ip.split("\\.");
        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
            if (part.isEmpty()) {
                return false;
            }

            if (part.length() > 1 && part.charAt(0) == '0') {
                return false;
            }

            for (char c : part.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }

            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidIPv4("172.16.254.1"));   // true
        System.out.println(isValidIPv4("256.100.5.0"));    // false

    }
}
