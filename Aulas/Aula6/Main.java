package Aula6;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Banco banco = new Banco(5);
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        for (int i = 0 ;i < 5 ;i++){
            int numeroAleatorio = random.nextInt(6);
            if (i % numeroAleatorio == 0){
                banco.adiciona(new ContaPoupanca());
            }   else {
                banco.adiciona(new ContaCorrente());
            }
            banco.pegaConta(i).deposita(1000 + 100 * i);
        }

        for (int i = 0 ;i < 5 ;i++){
            System.out.printf("Conta %d:\n",i);
            adc.roda(banco.pegaConta(i));
            System.out.println();
        }
    }
}