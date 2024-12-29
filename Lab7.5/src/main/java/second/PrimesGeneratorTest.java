package second;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PrimesGeneratorTest {
    public static void run(int N) {
        PrimesGenerator generator = new PrimesGenerator(N);

        System.out.println("Первые " + N + " простых чисел в прямом порядке:");
        Iterator<Integer> iterator = generator.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("Первые " + N + " простых чисел в обратном порядке:");
        List<Integer> primesList = new LinkedList<>();
        iterator = generator.iterator();
        while (iterator.hasNext()) {
            primesList.add(iterator.next());
        }
        Collections.reverse(primesList);
        for (Integer prime : primesList) {
            System.out.print(prime + " ");
        }
        System.out.println();
    }
}
