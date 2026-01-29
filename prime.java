public class PrimeCheck {
    public static void main(String[] args) {
        // Define the number to check
        int number = 29; // you can change this value

        boolean isPrime = true;

        // Prime check logic
        if (number <= 1) {
            isPrime = false; // numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
