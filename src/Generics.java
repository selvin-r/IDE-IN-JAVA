import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generics {

    static <T> void main(String[] args) {

        List<T> list = new ArrayList<T>((Collection<? extends T>) List.of(12.4, 3.4, 5.6, 7.8));

        System.out.println("List  : " + list);

        double result = compute((List<Double>) list);
        System.out.println("Sum   : " + result);
    }

    // Generic method: works for List<Integer>, List<Double>, etc.
    public static <T extends Number> double compute(List<Double> l) {

        double sum = 0.0;

        for (Double x : l) {
            sum += x.doubleValue();
        }

        return sum;
    }
}
