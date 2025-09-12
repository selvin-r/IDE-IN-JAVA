
//Buddy String
public class DAY2 {

    public  static  boolean Buddy(String s,String gols){

        char [] arr = s.toCharArray();
        int i=0,j=arr.length-1;

        while(i<j){
            char swap = arr[i];
            arr[i]=arr[j];
            arr[j]=swap;
            i++;
            j--;

            StringBuffer sb = new StringBuffer();

            for(char c : arr){
                sb.append(c);

            }

            String res = sb.toString();

            if(res.equals(gols)){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {

        String s = "aa";
        String gols ="aa";

        System.out.println(Buddy(s,gols));


    }

}
