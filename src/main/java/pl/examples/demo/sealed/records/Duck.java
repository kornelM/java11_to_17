package pl.examples.demo.sealed.records;

public record Duck(int numberOfLegs, String madeSound) implements Animal {

    @Override
    public void makeASound() {
        System.out.println("I'm a duck, I do: " + madeSound);
    }
}
