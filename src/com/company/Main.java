package com.company;


import java.math.BigInteger;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        // Max of two integers arguments.
        BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> Math.max(a, b);
        System.out.println(biFunction.apply(100,200));

        //Lambda expression that accepts seven string arguments and returns a string
        // in upper case concatenated from all of them.
        MyFunctionalInterface myFunctionalInterface = (a, b, c, d, e, f, g) ->
                (a + b + c + d + e + f +g).toUpperCase();
        System.out.println(myFunctionalInterface.addWords("BMW",
                "Toyota", "Audi", "Nissan", "Ford", "Volkswagen", "Mercedes"));

        //Production of all numbers in the range.
        BiFunction<Integer, Integer, Integer> numbers = (minNumber, maxNumber) -> {
            Integer newNumber = minNumber;
            for (int i = minNumber; i < maxNumber; i++) {
                newNumber = newNumber * (i+1);
            }
            return newNumber;
        };
        System.out.println(numbers.apply(3,8));

        //Checking if a number is prime
        Predicate<Integer> isPrime = a -> {
            BigInteger bigInteger = BigInteger.valueOf(a);
        return bigInteger.isProbablePrime((int) Math.log(a));
        };
        System.out.println(isPrime.test(13));

        //Calculating a factorial
        Function<Integer, Integer> function = number -> {
            int result = 1;
            for (int i = 1; i <= number ; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println(function.apply(3));
    }
}
