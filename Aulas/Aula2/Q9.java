package Aula2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um valor: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
           for (int j = 1; j <= i;j++){
               System.out.printf("%d ",j*i);
           }
            if(i != n) {
                System.out.println();
            }
        }
    }
}
