package Aula2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        while (true){
            if (x%2 == 0){
                x = x/2;
            } else{
                x = 3 * x + 1;
            }
            if (x == 1){
                System.out.printf("%d", x);
                break;
            }
            System.out.printf("%d-> ", x);
        }
    }
}
