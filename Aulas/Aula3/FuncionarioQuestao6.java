package Aula3;

public class FuncionarioQuestao6{
        String nome;
        String departamento;
        Questao9 dataDeEntrada;
        String rg;
        double salario;
        void recebeAumento(double valor){
            this.salario = this.salario + valor;
        }
        double calculaGanhoAnual() {
            return this.salario * 12;
        }
        void mostra() {
                System.out.printf("Nome: %s\nDepartamento: %s\nData de entrada: %s\nRg: %s\nSalario: %.2f", this.nome, this.departamento, this.dataDeEntrada, this.rg, this.salario);
        }
}


