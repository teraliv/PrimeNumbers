/**
 * Prime Numbers.
 *
 * created by Alex terikov
 * on 12/23/15.
 */

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {


    public static void main(String[] args) {

        for (Integer i : findPrimes(15))
            System.out.println(i);
    }

    /**
     * A method to make a list of integers which are the prime
     * numbers between 2 and "N" (inclusive).
     *
     * @param theNum - find primes till this number.
     */
    public static List<Integer> findPrimes(int theNum) {

        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= theNum; i++) {
            if (isPrime(i))
                primes.add(i);
        }

        return primes;
    }

    /**
     * A method to check if the given number a prime number.
     *
     * @param theNum - the number to check.
     * @return - returns true if a number is prime, otherwise false.
     */
    public static boolean isPrime(int theNum) {

        boolean result = true;

        for (int i = 2; i < theNum; i ++) {

            if (theNum % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }

}
