package Aula7;

abstract class Conta {
    protected double saldo = 0;

    abstract double getSaldo();
    abstract public void deposita(double valor);

    public void saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }else{
            System.out.println("Não é possível realizar a operação");
        }
    }

    abstract void atualiza(double valor);
}
