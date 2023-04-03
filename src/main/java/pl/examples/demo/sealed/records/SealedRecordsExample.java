package pl.examples.demo.sealed.records;

public class SealedRecordsExample {

    public static void main(String[] args) {
        Dog dog = new Dog(4, "Hau hau");
        Duck duck = new Duck(2, "Kwa kwa");

        dog.makeASound();
        duck.makeASound();
        printDiagnostics(dog);
        printDiagnostics(duck);
    }

    static void printDiagnostics(Animal animal) {
        System.out.println("__________________");
        System.out.println("Animal child class name: " + animal.getClass().getSimpleName());
        printAnimalDetails(animal);
    }

    private static void printAnimalDetails(Animal animal) {
        switch (animal) {
            case Dog dog ->
                    System.out.printf("Animal is a dog, does '%s' sound and has %s legs.%n", dog.madeSound(), dog.numberOfLegs());
            case Duck duck ->
                    System.out.printf("Animal is a duck, does '%s' sound and has %s legs.%n", duck.madeSound(), duck.numberOfLegs());
        }
    }
}
