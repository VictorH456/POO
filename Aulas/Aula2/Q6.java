package Aula2;

public class Q6 {
    public static void main(String[] args) {
        long fatorial = 1;
        for (int n = 1; n<= 6; n++){
            fatorial *= n;
        }
        System.out.println(fatorial);
        // As respostas começam a ficar erradas, pois chegam no limite do tamanho do int.
    }
}