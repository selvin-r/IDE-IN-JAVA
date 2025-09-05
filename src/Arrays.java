import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {

        int [] arr1 ={1,2,3,4,5,8};
        int [] arr2 ={1,2,3,4,9};

        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        for (int i=0;i<arr1.length;i++){

            first.add(arr1[i]);
        }
        for (int j=0;j<arr2.length;j++){

            if(!first.contains(arr2[j])){

                first.add(arr2[j]);
            } else {

                second.add(arr2[j]);
            }
        }
        Collections.sort(first);
        System.out.println("First Arrays :"+ first);
        System.out.println("Second Arrays :" + second);
    }
}
