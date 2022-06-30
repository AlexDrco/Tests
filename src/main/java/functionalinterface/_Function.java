package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(incrementByOne.andThen(multiplyBy10).apply(2));
        System.out.println(incrementBi.apply(2,3));

    }

    static Function<Integer, Integer> incrementByOne = number -> ++number;

    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementBi = (number1, number2) -> (number1 + 1) * number2;

    static int increment(int number) {
        return number + 1;
    }
}
