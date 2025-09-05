import java.util.Scanner;
import java.util.Arrays;

public class Matrixs {
    public static void main(String[] args) {

        int arr [][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}

// Transpase Matrixs

class Trans {
    public static void main(String[] args) {

        int arr [][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int trans[][] = new int[4][4];

            OuterLoop:
            for(int row=0;row<4;row++){
             InnerLoop:
            for (int col=0;col<4;col++){
                trans[row][col]= arr[col][row];
            }
            }
        System.out.println("After Transpose ");
            PrintLoop:
            for(int row=0;row<4;row++){
            for (int col=0;col<4;col++){
                System.out.print(trans[row][col] + " ");
            }
                System.out.println();
        }


    }
}

// Pattan

class Pattan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row Value : n");
        int n= scan.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(i==0 || i==2){
                    if(j!=n-1){
                        System.out.print('R'+ " ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}



class TopThreeRepeatedTwoPointer {
    public static void main(String[] args) {
//        int[] array = {1,3,4,5,1,1,2,2,6,3,3,2};
        int array [] ={2,2,3,4,5,12,2,3,3,3,12};

        Arrays.sort(array);


        int topNum1 = 0, topNum2 = 0, topNum3 = 0;
        int topCount1 = 0, topCount2 = 0, topCount3 = 0;

        int n = array.length;
        int start = 0;
        while (start < n) {
            int end = start + 1;
            while (end < n && array[end] == array[start]) {
                end++;
            }
            int count = end - start;
            int currentNum = array[start];


            if (count > topCount1) {

                topCount3 = topCount2; topNum3 = topNum2;
                topCount2 = topCount1; topNum2 = topNum1;
                topCount1 = count; topNum1 = currentNum;
            } else if (count > topCount2) {
                topCount3 = topCount2; topNum3 = topNum2;
                topCount2 = count; topNum2 = currentNum;
            } else if (count > topCount3) {
                topCount3 = count; topNum3 = currentNum;
            }

            start = end;
        }

        System.out.println("Top 3 repeated numbers:");
        System.out.print(topNum1 + ", " + topNum2 + ", " + topNum3);
    }
}


