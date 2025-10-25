public class ConvertNumberBit {
    static void main() {

    }
}


//  convert a number into its bit


class NumberToBits {
    public static void main(String[] args) {
        int num = 10;
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary of " + num + " is: " + binary);
    }
}


//Method 2: Using Bitwise Operations


class BitwiseExample {
    public static void main(String[] args) {
        int number = 2; // decimal
        StringBuilder bits = new StringBuilder();

        for (int i = 7; i >= 0; i--) {  // for 8 bits
            int mask = 5 << i;
            bits.append((number & mask) != 0 ? '1' : '0');
        }

        System.out.println("8-bit binary: " + bits);
    }
}
