import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input
        System.out.print("Enter a number: "); // Prompt user
        int n = sc.nextInt();                 // Read input value
        System.out.println("Fibonacci of " + n + " = " + fibo(n));
        // System.out.println("Fibonacci Series is " +printFibonacci(n));
        printFibonacci(n);
        sc.close();       
    }
    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2); // Recursive call
    }

     public static void printFibonacci(int n) {
        int a = 0, b = 1; // First two terms of Fibonacci series

        // Handle the case where n = 1 separately
        if (n >= 1) {
            System.out.print(a + " ");
        }

        // Handle the case where n = 2 separately
        if (n >= 2) {
            System.out.print(b + " ");
        }

        // Loop to calculate and print remaining terms
        for (int i = 3; i <= n+1; i++) {
            int c = a + b;       // Next Fibonacci number
            System.out.print(c + " ");
            a = b;               // Update values for next iteration
            b = c;
        }
    }

    
}
