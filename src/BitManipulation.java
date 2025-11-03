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

// 5️⃣ Toggle the i-th bit (flip)

class Toggletheithbit {
    static void main() {
        int n = 5;  // 0101
        int i = 2;
        int result = n ^ (1 << i);
        System.out.println(result);// Output: 1 (0001)

    }
}

// 6️⃣ Count set bits (number of 1’s)


class Countsetbuits {
    static void main() {

        int count = 0, n = 13; // 1101
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        System.out.println(count);  // Output: 3

    }
}

//7️⃣ Check if a number is power of 2

class NumberisPower {
    static void main() {

        int n=4;

        if ((n & (n - 1)) == 0)
            System.out.println("Power of 2");
        else
            System.out.println("Not power of 2");


    }
}

// 8️⃣ Swap two numbers without using a temp variable


class Swap {
    static void main() {

        int a = 5, b = 7;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b); // 7 5


    }
}

