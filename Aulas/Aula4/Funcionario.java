package Aula4;

public class Funcionario {
    String nome;
    public double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    void recebeAumento(double valor) {
        this.salario = this.salario + valor;
    }

    double calculaGanhoAnual() {
        return this.salario * 12;
    }

    void mostrarFuncionario() {
        System.out.printf("Nome: %s\nSalario: %.2f\n", this.nome, this.salario);
    }
}
