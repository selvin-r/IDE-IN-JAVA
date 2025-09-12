public class DAY1 {

    // 90% Degrees Clockwish
        public static void main(String[] args) {

            int arr [][] = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}

            };

            int trans[][] = new int[4][4];

            OuterLoop:
            for(int row=0;row<3;row++){
                InnerLoop:
                for (int col=0;col<3;col++){
                    trans[row][col]= arr[col][row];
                }
            }
            System.out.println("After Transpose ");
            PrintLoop:
            for(int row=0;row<3;row++){
                for (int col=0,k=arr.length-1;col<k;col++,k--){

                    int temp = trans[row][col];
                    trans[row][col]=trans[row][k];
                    trans[row][k]=temp;
                }
            }
            for(int row=0;row<3;row++){
                for(int col=0;col<3;col++){
                    System.out.print(trans[row][col] +" ");
                }
                System.out.println();
            }

        }
    }

    class Spiralorder{
        public static void main(String[] args) {

            int arr[][]={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };
            int n= arr.length;

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(arr[j][i]+ " ");
                }
                System.out.println();
            }
        }
    }