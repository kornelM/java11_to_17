package pl.examples.demo.sealed.records;

public sealed interface Animal permits Duck, Dog {

    void makeASound();
}
