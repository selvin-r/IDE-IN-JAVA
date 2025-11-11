import java.util.Arrays;

public class Umamageswari {
    public static void main(String [] args){

    }
}

// revers the String

class ReversString {
    void main(String[] args) {
        String str = "Welcome";
        reverse(str, 0, str.length() - 1);
    }

    //reverse the string
    //emocleW
    static void reverse(String s, int i, int n) {
//head recursion
        String str = "";
        char ch;
        if (s == null || i == (s.length()) || n < 0)
            return;
        else {
            ch = s.charAt(i);
            str += ch;
            reverse(s, i + 1, n - 1);
            System.out.print(" " + str);
        }
    }
}


// Binary Serach



//Binary Search

class Binary
{
    static int binarySearch(int arr[], int low, int high, int target){
        int mid=0;
        while(low<=high){
            mid=(high+low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target<arr[mid]){
                return binarySearch(arr,low,mid-1,target);
            }else{
                return binarySearch(arr,mid+1,high,target);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={4,3,2,1,5,9,8,7,6};
        Arrays.sort(arr);
        int n=arr.length;
        System.out.print(binarySearch(arr,0,n-1,3));
    }
}