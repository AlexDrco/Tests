package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDB.get());
    }

    static Supplier<String> getDB = () -> "jibberish";
}
