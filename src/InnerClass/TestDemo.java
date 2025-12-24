package InnerClass;

public class TestDemo {
    static void main() {
        Test t = new Test() {  //Anonymous Inner Class
            @Override
            public void show(String s) {
                System.out.println(s);
            }

            @Override
            public int length(String s) {
                return s.length();
            }
        };
        t.show("Chan");
        System.out.println(t.length("Chan"));
    }
}
