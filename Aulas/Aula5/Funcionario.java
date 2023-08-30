package Aula5;

public class Funcionario {
    private String nome;
    private double salario;

    private static int identificador = 0;

    public Funcionario(String nome){
        this.nome = nome;
        //Achei essa a forma mais prática, na minha opinião de
        //atualizar o identificador a cada criação
        identificador ++;
    }
    public Funcionario(){
        identificador ++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }

    public double getSalario() {return salario;}

    public int getIdentificador(){return identificador;}

    public void recebeAumento(double valor) {
        this.salario = this.salario + valor;
    }

    public double calculaGanhoAnual() {
        return this.salario * 12;
    }

    public void mostrarFuncionario() {
        System.out.printf("Nome: %s\nSalario: %.2f\n", this.nome, this.salario);
    }
}
