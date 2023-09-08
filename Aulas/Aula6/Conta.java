package Aula6;

public class Conta {
    protected double saldo = 0;

    public double getSaldo() {
        return saldo;
    }
    public void deposita(double valor){
        if (valor > 0){
            this.saldo += valor;
        }else {
            System.out.println("Não é possível realizar a operação");
        }
    }

    public void saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }else{
            System.out.println("Não é possível realizar a operação");
        }
    }

    public void atualiza(double valor){
        if (valor > 0){
            this.saldo += this.saldo * valor;
        }
    }
}
