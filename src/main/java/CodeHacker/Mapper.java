package CodeHacker;

import streams.CharacterCount;

import java.util.function.Function;

public class Mapper {
    public static Function<String, CharacterCount> getDistinctCharactersCount() {
        return new Function<String, CharacterCount>() {
            @Override
            public CharacterCount apply(String s) {
                return null;
            }
        };
    }
}
