package FunctionalInterfaces;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 5;
            }
        };
        // we can replace with
        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(predicate.test(3));
        System.out.println(predicate.test(13));

        Consumer<Integer> consumer = x -> System.out.println(x);
        Function<Integer, String> function = x -> x.toString();
        Supplier<Integer> supplier = () -> new Integer(5);
        UnaryOperator<Integer> unaryOperator = x -> x * 5;
        BinaryOperator<Integer> binaryOperator = (x, y) -> x * y;
        MyPredicate<Integer> myPredicate = x -> System.out.println(x);
        myPredicate.apply(5);
        MyPredicate<String> myPredicate1 = x -> {
            System.out.println(x);
            System.out.println(x);
            System.out.println(x);
            System.out.println(x);
            System.out.println(x);
        };
        myPredicate1.apply("five");
    }
}

interface MyPredicate<T> {
    void apply(T t);
}















