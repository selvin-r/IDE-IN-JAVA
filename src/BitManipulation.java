public class BitManipulation {
    static void main() {


        // 🔹 Example: Bitwise AND &


        int a = 5;  // 0101
        int b = 3;  // 0011
        System.out.println(a & b);  // Output: 1 (0001)


        // 🔹 Example: Bitwise OR |

        int a1 = 5;  // 0101
        int b1 = 3;  // 0011
        System.out.println(a1 | b1 );  // Output: 7 (0111)


      // 🔹 Example: Bitwise XOR ^

        int a2 = 5;  // 0101
        int b2 = 3;  // 0011
        System.out.println(a2 ^ b2);  // Output: 6 (0110)

     // 🔹 Example: Bitwise NOT ~

        int a3 = 4;  // 0101
        System.out.println(~a3);  // Output: -6


        // 🔹 Left Shift <<

        int a4 = 5;  // 0101
        System.out.println(a4 << 1);  // Output: 10 (1010)

        // 🔹 Right Shift >>

        int a5 = 20;  // 10100
        System.out.println(a5 >> 2);  // Output: 5 (0101)



    }
}



class EvenNumber {
    static void main() {

        int arr [] = {2,3,4,5,6,7};


        for(int i=0;i< arr.length;i++){

            if((i & 1)==0){
                System.out.println("Even Number " +i);
            } else {

                System.out.println("Odd Number " +i);
            }
        }
    }
}

// 2️⃣ Get the i-th bit

class Getthethbit {
    static void main() {

        int n =5;
        int i=2;

        int bit = ( n >>i) &1;

        System.out.println(bit);
    }

}

// 3️⃣ Set the i-th bit (make it 1)

class Settheithbit {
    static void main() {


        int n = 5;  // 0101
        int i = 1;
        int result = n | (1 << i);  // Output: 7 (0111)

        System.out.println(result);

    }
}

//4️⃣ Clear the i-th bit (make it 0)


class Cleartheithbit {
    static void main() {

        int n = 7;  // 0111
        int i = 1;
        int result = n & ~(1 << i);  // Output: 5 (0101)

        System.out.println(result);
    }


}