package CodeHacker;

import java.util.function.Predicate;

public class Filter {

    Predicate<String>  nameStartingWithPrefix(String prefix){
        return new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith(prefix);
            }
        };
    }
}
