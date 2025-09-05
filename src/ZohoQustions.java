public class ZohoQustions {
    public static void main(String[] args) {

    }
}
// 20. Print longest sequence between same character

//Ex I/p abcccccbba
//O/p 8 (from a to a)
//I/p aaaaaaaa
//O/p 6
//
class LongestSequence{
    public static void main(String[] args) {
        System.out.println(Longest("abccccba"));
        System.out.println(Longest("abausshsjjsnsjhsjdhd"));
        System.out.println(Longest("aaaaaaaaeeeeeeeeeeeeeeeeeeee"));
    }
  public static int Longest(String s){
        int maxlen =0;
        int n=s.length();

        for(int i=0;i<n;i++){

            for(int j=n-1;j>i;j--){

                if(s.charAt(i)==s.charAt(j)){
                    int len = j -i+1;
                    if(len > maxlen){
                        maxlen = len;
                    }
                   // break;
                }
            }

        }
        return  maxlen;

  }

}
