package Aula2;

public class Q7 {
    public static void main(String[] args) {
        long fib1 = 0;
        long fib2 = 1;
        int range = 101;
        for (int i = 0; i <= range; i += 2) {
            if (i == range) {
                System.out.printf("Fib de %d = %d\n", i, fib1);
            } else {
                System.out.printf("Fib de %d = %d\n", i, fib1);
                System.out.printf("Fib de %d = %d\n", i + 1, fib2);
            }
            fib1 += fib2;
            fib2 += fib1;
        }
    }
}

