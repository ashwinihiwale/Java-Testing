package com.testing.software_testing;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(25)); // false
        System.out.println(isPrime(23)); // true
        System.out.println(isPrime(37)); // true
        System.out.println(isPrime(48)); // false
		
	}
	
	public static boolean isPrime(int num) {
        return isPrime(num, 2);
    }
	public static boolean isPrime(int num, int i) {
        // Base cases
        if (num <= 2) {
            // 0, 1, and 2 are not prime or prime respectively
            return num == 2;
        }
        if (num % i == 0) {
            // if the number is divisible by any number between 2 and sqrt(num), it's not prime
            return false;
        }
        if (i * i > num) {
            // if we've checked all numbers up to sqrt(num) and haven't found a divisor, the number is prime
            return true;
        }

        // Recursive case
        return isPrime(num, i + 1);
    }
}
