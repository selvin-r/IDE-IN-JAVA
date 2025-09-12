public class Demo {
    public static void main(String[] args) {
        String s = "madam";
        boolean isPalindrome = new StringBuilder(s).reverse().toString().equals(s);
        System.out.println(isPalindrome);

        if(isPalindrome){
            System.out.println("This is Palindrom");
        } else {
            System.out.println("Not palindrom");
        }

    }

}
