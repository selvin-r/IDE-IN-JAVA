package Stream;

/*
 * Stream It represents a group of elements from a source
 *  creation of stream -> stream();
 * configure the stream -> fliter(),map(),sorted(c);
 *
 * result -bulk operation -> collect(),max(),min(c),forEach(),count()
 *
 * */


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamDemo {
    static void main() {


        List<Integer> list = new ArrayList<>();


        for (int i = 0; i <= 10; i++)

            list.add(i);
        System.out.println(list);

//
//        for (Integer il : list)
//
//            if (i % 2 == 1)
//                System.out.println(il);


        List<Integer> list2 = list.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());
        System.out.println(list2);


        List<Integer> s = list.stream().map(i -> i * i).
                filter(i -> i % 2 == 0).
                collect(Collectors.toList());
        System.out.println(s);
//                forEach(System.out::println);


        long n = list.stream()
                .map(i -> i * i).
                filter(i -> i > 10).count();
        System.out.println(n);


        List<Integer> b = list.stream().sorted().collect(Collectors.toList());
        System.out.println(b);


//Comparable<Integer> c=(i1,i2)->i2.compareTo(i1);


//        list.stream().forEach(System.out::println());
//
//        list.stream().close();



    }
}








