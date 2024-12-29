package first;

import java.util.*;

public class CollectionsExample {
    public static void run() {
        int N = 10;
        int[] array = new Random().ints(N, 0, 101).toArray();
        System.out.println("Массив случайных чисел: " + Arrays.toString(array));

        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        System.out.println("Список: " + list);

        Collections.sort(list);
        System.out.println("Отсортированный список по возрастанию: " + list);

        Collections.reverse(list);
        System.out.println("Список в обратном порядке: " + list);

        Collections.shuffle(list);
        System.out.println("Перемешанный список: " + list);

        if (!list.isEmpty()) {
            Integer first = list.remove(0);
            list.add(first);
        }
        System.out.println("Список после циклического сдвига: " + list);

        Set<Integer> uniqueSet = new HashSet<>(list);
        list.clear();
        list.addAll(uniqueSet);
        System.out.println("Список с уникальными элементами: " + list);

        List<Integer> duplicates = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        System.out.println("Список с дублирующимися элементами: " + duplicates);

        Integer[] newArray = list.toArray(new Integer[0]);
        System.out.println("Массив из списка: " + Arrays.toString(newArray));

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Частота вхождения чисел: " + frequencyMap);
    }
}