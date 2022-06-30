import java.util.Arrays;

public class Testing {

    public static void main(String[] args) {
        String a = "scriptjavx";
        String b = "javascript";

        //System.out.println(Arrays.asList(a.split("")).stream().collect(Collectors.toList()).containsAll(Arrays.asList(b.split("")).stream().collect(Collectors.toList())));
        boolean b1 = Arrays.asList(a.split("")).retainAll(Arrays.asList(b.split("")));
        System.out.println(b1);
    }

}

