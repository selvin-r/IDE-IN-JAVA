import java.util.Arrays;

public class Control {
    public static void main(String[] args) {
        int nums[] ={1,2,3,4};
        int result [] = Function(nums);

        System.out.println(Arrays.toString(result));

    }
    public static int []Function(int [] nums){
        int n = nums.length;
        int  arr []= new int[n];

        for(int i=0;i<n;i++){
            arr[0]=1;
            arr[i] = arr [i-1] * nums[i-1];
        }

        return arr;
    }

}

