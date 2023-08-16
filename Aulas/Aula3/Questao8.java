package Aula3;

public class Questao8 extends FuncionarioQuestao6{
    void mostra() {
        System.out.printf("Nome: %s\nDepartamento: %s\nData de entrada: %s\nRg: %s\nSalario: %.2f", this.nome, this.departamento, this.dataDeEntrada, this.rg, this.salario);
    }
}
