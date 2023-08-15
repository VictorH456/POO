package Aula2;

public class Q4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            int fat = 1;
            for (int j = 1; j <= i; j++){
                fat *= j;
            }
            System.out.printf("Fatorial de %d = %d\n", i, fat);
        }
    }
}
