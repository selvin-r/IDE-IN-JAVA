package Lambda;

/*
* Lambda Expression work with For Only Functional interface
*
*
* Realist Date Java 8 versions
*
* before call
*
* Sam
*
* Single abstract methods
*
*
* */

@FunctionalInterface
public interface A {

    void show(int i);


}

@FunctionalInterface
interface B {
    int add(int i, int j,int k);
}

class Demo {

    public static void main(String[] args) {

        A obj = ( i) ->
                System.out.println("In Show " + i);

        obj.show(10);

    }

}

/*
* Only One Statement Return u put return statement u return tow value
*
* return Not Put return Statement
*
* */

class Demo1 {
    public static void main(String[] args) {
        B obj1 = (i, j,k) -> i+j+k;

        int result = obj1.add(1, 2,10);
        System.out.println(result);
    }
}