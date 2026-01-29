public class SimpleInterest {
    public static void main(String[] args) {
        // Define the principal, rate of interest, and time
        double principal = 10000; // Principal amount
        double rate = 5;          // Annual interest rate in percent
        double time = 2;          // Time in years

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("Principal: " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest = " + simpleInterest);
    }
}
