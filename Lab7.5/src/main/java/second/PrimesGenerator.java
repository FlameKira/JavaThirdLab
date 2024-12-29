package second;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PrimesGenerator {
    private List<Integer> primes;

    public PrimesGenerator(int n) {
        primes = new LinkedList<>();
        generatePrimes(n);
    }

    private void generatePrimes(int n) {
        int count = 0;
        int num = 2; // Первое простое число
        while (count < n) {
            if (isPrime(num)) {
                primes.add(num);
                count++;
            }
            num++;
        }
    }

    private boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Integer> iterator() {
        return primes.iterator();
    }
}