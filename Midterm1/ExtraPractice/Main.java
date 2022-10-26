package Midterm1.ExtraPractice;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
