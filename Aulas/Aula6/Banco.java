package Aula6;

public class Banco {
    private int totalDeContas = 0;
    private Conta[] contas;

    public void adiciona(Conta c){
        this.contas[this.totalDeContas] = c;
        this.totalDeContas++;
    }

    public Banco(int qntContas){
        this.contas = new Conta[qntContas];
    }

    public Conta pegaConta(int x){
        return this.contas[x];
    }

    public int pegaTotalDeContas() {
        return totalDeContas;
    }
}
