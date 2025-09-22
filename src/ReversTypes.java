import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversTypes {
    public static void main(String[] args) {

    }
}

// Using StringBuilder.reverse():
class builder {
    public static void main(String[] args) {
        String s = "Update life ";
        StringBuilder res = new StringBuilder(s);
        res.reverse();
        System.out.println(res);
    }
}

// Using Loop:

class Usingloop {
    public static void main(String[] args) {
        String str = "Java";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);

    }
}


// Using Character Array:

class Usingchar {
    public static void main(String[] args) {

        String s = "Geeks";
        char[] arr = s.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }
}

// Using Collections.reverse():

class UsingCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        Collections.reverse(list);
        System.out.println(list); // Output: [Blue, Green, Red]

    }
}

// Using While Loop:

class UsingWhileloop{
    public static void main(String[] args) {
        int num = 1234, rev = 0;
        while(num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println(rev); // Output: 4321

    }
}