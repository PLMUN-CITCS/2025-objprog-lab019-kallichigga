import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int n = getNonNegativeInteger();
        calculateFactorial(n);
    }

    public static int getNonNegativeInteger() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();
        input.close(); 
        return n;  
    }

    public static void calculateFactorial(int n) {
        long factorial = 1;
        int i = 1;
        
        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.printf("Factorial of %d = %d%n", n, factorial);
    }
}
