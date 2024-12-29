package third;

import java.util.*;

public class HumanExample {
    public static void run() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("John", "Doe", 25));
        humans.add(new Human("Jane", "Smith", 30));
        humans.add(new Human("Alice", "Johnson", 22));
        humans.add(new Human("Bob", "Doe", 28));

        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("HashSet: " + hashSet);

        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("TreeSet: " + treeSet);

        Set<Human> treeSetWithComparator = new TreeSet<>(new HumanComparatorByLastName());
        treeSetWithComparator.addAll(humans);
        System.out.println("TreeSet с компаратором по фамилии: " + treeSetWithComparator);

        Set<Human> treeSetWithAnonymousComparator = new TreeSet<>(Comparator.comparingInt(Human::getAge));
        treeSetWithAnonymousComparator.addAll(humans);
        System.out.println("TreeSet с анонимным компаратором по возрасту: " + treeSetWithAnonymousComparator);

        // HashSet не гарантирует порядок, LinkedHashSet сохраняет порядок добавления,
        // TreeSet сортирует элементы по естественному порядку или заданному компаратору.
    }
}
