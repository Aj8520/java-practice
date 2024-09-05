package main.IntefacesStream;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        // Represents a supplier of results. which does not accept any input but
        // produces a result.
        Supplier<Double> randomNumberSupplier = () -> Math.random();

        double randomNumber = randomNumberSupplier.get();

        System.out.println("random number" + randomNumber);

    }

}
