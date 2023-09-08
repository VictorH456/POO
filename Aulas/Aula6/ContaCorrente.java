package Aula6;

public class ContaCorrente extends Conta{
    public void atualiza(double valor){
        super.atualiza(valor * 2);
    }
    public void deposita(double valor) {
        super.deposita(valor - 0.1);
    }
}