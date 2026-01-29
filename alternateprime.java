public class AlternatePrimes {
    public static void main(String[] args) {
        // Define the range up to which we want to check primes
        int limit = 50; // you can change this value

        int count = 0; // to track prime position

        System.out.println("Alternate prime numbers up to " + limit + ":");

        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                count++;
                // Print only alternate primes (odd positions: 1st, 3rd, 5th, ...)
                if (count % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
