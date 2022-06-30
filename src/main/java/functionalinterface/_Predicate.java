package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(isValid.test("11134567098"));
        System.out.println(isValid.test("07111"));
        System.out.println(isValid.test("07112233445"));
    }

    static Predicate<String> isValid = phone -> phone.startsWith("07") && phone.length() == 11;
}
