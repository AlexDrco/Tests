package optionals;

import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {
        Optional.ofNullable("test@teest.com")
                .ifPresentOrElse(email -> System.out.println("Send email to " + email),
                        () -> System.out.println("No email provided")
                );


    }
}
