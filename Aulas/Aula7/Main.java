package Aula7;
public class Main {
    public static void main(String[] args) {
        Conta a = new ContaCorrente();
        Conta b = new ContaPoupanca();
        b.deposita(1000);
        a.deposita(1200);
        System.out.println(a.getSaldo());
        System.out.println(b.getSaldo());
    }
}