package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCostumer(new Customer("Mario", "123098765"));

        greet.accept(new Customer("Juan", "000000"));
        greeto.accept(new Customer("Juan", "000000"), new Customer("Pedro", "111555"));
    }

    static Consumer<Customer> greet = customer -> System.out.println("Hello " + customer.customerName + " , thanks for number " + customer.customerPhoneNumber);

    static BiConsumer<Customer, Customer> greeto = (customer1, customer2) -> System.out.println("Hello " + customer1.customerName + " , thanks for number " + customer2.customerName);

    static void greetCostumer(Customer c){
        System.out.println("Hello " + c.customerName + " , thanks for number " + c.customerPhoneNumber);
    }

    static class Customer{
        final private String customerName;
        final private String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                    '}';
        }
    }
}
