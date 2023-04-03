package pl.examples.demo.sealed.records;

public record Dog(int numberOfLegs, String madeSound) implements Animal {

    @Override
    public void makeASound() {
        System.out.println("I'm a dog, I do: " + madeSound);
    }
}
