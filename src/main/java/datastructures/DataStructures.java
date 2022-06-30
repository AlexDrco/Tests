package datastructures;

import java.util.*;
import java.util.stream.Collectors;

public class DataStructures {

    public static void main(String[] args) {

        Set<Ball> set = new HashSet<>();
        set.add(new Ball("blue"));
        set.add(new Ball("red"));
        set.add(new Ball("green"));

    }

    private static void linkedList() {
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Alex", 30));
        people.add(new Person("Maria", 20));
        people.stream().forEach(System.out::println);
        people.add(1, new Person("John", 45));
        people.stream().forEach(System.out::println);
    }

    private static void queues() {
        Queue<Person> market = new LinkedList<>();
        market.add(new Person("Alex", 30));
        market.add(new Person("Maria", 20));
        market.add(new Person("Jose", 32));
        market.add(new Person("Jisus", 32));
    }

    record Person(String name, int age){}

    record Ball(String color){}
}
