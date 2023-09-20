package Aula7;

public class ContaCorrente extends Conta {
    public void atualiza(double valor){
            if (valor > 0){
                valor = valor * 2;
                this.saldo += this.saldo * valor;
            }
        }
    double getSaldo() {
        return super.saldo;
    }

    public void deposita(double valor) {
        if (valor > 0){
            valor = valor - 0.1;
            this.saldo += valor;
        }else {
            System.out.println("Não é possível realizar a operação");
        }
    }
}