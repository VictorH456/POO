package Aula7;

public class ContaPoupanca extends Conta {
    double getSaldo() {
        return super.saldo;
    }

    public void deposita(double valor) {
        if (valor > 0){
            this.saldo += valor;
        }else {
            System.out.println("Não é possível realizar a operação");
        }
    }

    public void atualiza(double valor){
        if (valor > 0){
            valor = valor * 3;
            this.saldo += this.saldo * valor;
        }
    }
}
