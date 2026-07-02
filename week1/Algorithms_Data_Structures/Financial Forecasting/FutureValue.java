public class FutureValue {
    public static double futureValue(double principal, double rate, int years) {

        // Base case
        if (years == 0) {
            return principal;
        }

        // Recursive case
        return futureValue(principal, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {

        double principal = 10000;   
        double rate = 0.10;         
        int years = 5;

        double amount = futureValue(principal, rate, years);

        System.out.printf("Future Value after %d years = %.2f%n", years, amount);
    }
}