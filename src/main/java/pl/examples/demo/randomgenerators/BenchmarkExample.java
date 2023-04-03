package pl.examples.demo.randomgenerators;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;

import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;

public class BenchmarkExample {

    public static void main(String[] args) throws Exception {
        System.out.printf("Available random generators are: %s and default one is: %s\n",
                RandomGeneratorFactory.all()
                        .map(RandomGeneratorFactory::name).collect(Collectors.joining(", ")),
                RandomGenerator.getDefault().getClass().getSimpleName()
        );
        System.out.println("_______________________");
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public static void testL128X1024MixRandom() {
        generateRandomNumbers(RandomGenerator.of("L128X1024MixRandom"));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public static void testL128X128MixRandom() {
        generateRandomNumbers(RandomGenerator.of("L128X128MixRandom"));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public static void testL128X256MixRandom() {
        generateRandomNumbers(RandomGenerator.of("L128X256MixRandom"));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public static void testL32X64MixRandom() {
        generateRandomNumbers(RandomGenerator.of("L32X64MixRandom"));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public static void testL64X1024MixRandom() {
        generateRandomNumbers(RandomGenerator.of("L64X1024MixRandom"));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public static void testL64X128MixRandom() {
        generateRandomNumbers(RandomGenerator.of("L64X128MixRandom"));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public static void testL64X128StarStarRandom() {
        generateRandomNumbers(RandomGenerator.of("L64X128StarStarRandom"));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public static void testL64X256MixRandom() {
        generateRandomNumbers(RandomGenerator.of("L64X256MixRandom"));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public static void testRandom() {
        generateRandomNumbers(RandomGenerator.of("Random"));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public static void testSecureRandom() {
        generateRandomNumbers(RandomGenerator.of("SecureRandom"));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public static void testSplittableRandom() {
        generateRandomNumbers(RandomGenerator.of("SplittableRandom"));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public static void testXoroshiro128PlusPlus() {
        generateRandomNumbers(RandomGenerator.of("Xoroshiro128PlusPlus"));
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public static void testXoshiro256PlusPlus() {
        generateRandomNumbers(RandomGenerator.of("Xoshiro256PlusPlus"));
    }

    private static void generateRandomNumbers(RandomGenerator generator) {
        generator.nextLong();
        generator.nextInt();
        generator.nextFloat();
        generator.nextDouble();
    }
}
