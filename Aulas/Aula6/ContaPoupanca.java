package Aula6;

public class ContaPoupanca extends Conta{
    public void atualiza(double valor){
        super.atualiza(valor * 3);
    }
}
