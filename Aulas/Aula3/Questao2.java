package Aula3;

public class Questao2 {
    public static void main(String[] args) {
        Questao1 funcionario = new Questao1();

        funcionario.nome = "Victor";
        funcionario.salario = 2000;
        funcionario.dataDeEntrada = "10/10/1010";
        funcionario.rg = "00.000.000-0";
        funcionario.departamento = "Administracao";
        System.out.println(funcionario.calculaGanhoAnual());
        funcionario.recebeAumento(200);
        System.out.println(funcionario.salario);
        System.out.print(funcionario.calculaGanhoAnual());
        funcionario.mostra();
    }
}
