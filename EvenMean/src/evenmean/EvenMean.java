package evenmean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EvenMean {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < 20; i++) {
            numbers.add(rnd.nextInt(20) * 2);
        }

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        double sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double mean = (sum - min - max) / (numbers.size() - 2);
        System.out.printf("The mean is: %.2f\n", mean);
    }
}