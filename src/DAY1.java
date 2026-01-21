import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


    // Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
       return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}



// Demo

import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


// Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}






import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


// Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}




import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


// Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}






import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


// Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}




import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


// Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}






import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


// Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}





import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


// Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}





import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


// Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}





import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


// Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}





import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


// Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}





import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


// Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}





import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


// Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}






import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


// Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}






import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


// Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}






import java.util.Arrays;

public class DAY1 {

    // 90% Degrees Clockwish
    // After Transpose
    //   7 4 1
    //   8 5 2
    //   9 6 3
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


// Meeting Room--------------------------------

class Meeting {
    public static void main(String[] args) {
        int arr[][]={{1,4}, {7,10}, {10,15} };
        int arr1[][]={{2,4},{9,12},{6,10}};
        System.out.println(Room(arr));
        System.out.println(Room(arr1));
    }

    public static boolean Room(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

}

class Meeting2 {
    public static void main(String[] args) {

        int [] start ={1, 10, 7};
        int [] end ={4, 15, 10};

        int start1 [] ={2, 9, 6};
        int  end1 [] ={4, 12, 10};

        System.out.println(Room1(start,end));
        System.out.println(Room1(start1,end1));

    }

    public static int Room1(int start [] ,int  end[]){

        Arrays.sort(start);
        Arrays.sort(end);

        int Room=0,MaxRoom=0;
        int i=0,j=0;

        while(i< start.length){
            if(start[i]<end[j]){
                Room++;
                MaxRoom=Math.max(MaxRoom,Room);
                i++;
            } else {
                Room--;
                j++;
            }
        }
        return MaxRoom;

    }
}

// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows


class NonPalindromeWords {
    public static void main(String[] args) {
        String s = "he know malayalam";

        String result [] =s.split(" ");

        StringBuffer sb = new StringBuffer();


        for(String Value : result){

            if(!isPalindrome(Value)){
                sb.append(Value);
            }
        }


        System.out.println(sb);
    }
    static boolean isPalindrome(String word) {

        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i) !=word.charAt(j)){
                return  false;
            }

            i++;
            j--;
        }

        return true;


    }
}
// 55 ) Here is the question covered in plain text format:
//
//From the input sentence given, find the strings which are not palindrome and print them.
//
//Input: he knows malayalam
//
//Output: he knows

class Demo22 {
    public static void main(String[] args) {

        String s ="he know mala";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i);

            if(c!=' '){
                sb.append(c);
            }
            if(c==' ' || i==s.length()-1){

                if(!Not(sb.toString())){

                    System.out.println(sb.toString().concat(" "));
                    sb.setLength(0);
                }

            }
        }

    }

    public static  boolean Not (String wo){

        int i=0;
        int j =wo.length()-1;

        while (i<j){
            if(wo.charAt(i) !=wo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}





