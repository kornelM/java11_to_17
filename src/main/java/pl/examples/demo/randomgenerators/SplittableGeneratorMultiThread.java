package pl.examples.demo.randomgenerators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SplittableGeneratorMultiThread {

    public static List<Integer> generateNumbersInMultipleThreads() {
        List<Integer> numbers = Collections.synchronizedList(new ArrayList<>());
        ExecutorService executorService = Executors.newCachedThreadPool();

        RandomGenerator.SplittableGenerator sourceGenerator = RandomGeneratorFactory
                .<RandomGenerator.SplittableGenerator>of("L128X256MixRandom")
                .create();

        List<RandomGenerator.SplittableGenerator> splits = sourceGenerator.splits(20).collect(Collectors.toList());
        splits.forEach((splitGenerator) -> {
            executorService.submit(() -> {
                numbers.add(splitGenerator.nextInt(10));
            });
        });

        return numbers;
    }

    public static void main(String[] args) {
        SplittableGeneratorMultiThread.generateNumbersInMultipleThreads();
    }
}
