package Aula3;

public class Questao7 {
        public static void main(String[] args) {
            FuncionarioQuestao6 funcionario = new FuncionarioQuestao6();
            funcionario.dataDeEntrada = new Questao9();

            funcionario.nome = "Victor";
            funcionario.salario = 2000;
            funcionario.dataDeEntrada.dia = 10;
            funcionario.dataDeEntrada.mes = 10;
            funcionario.dataDeEntrada.ano = 1010;
            funcionario.rg = "00.000.000-0";
            funcionario.departamento = "Administracao";
            System.out.println(funcionario.calculaGanhoAnual());
            funcionario.recebeAumento(200);
            System.out.println(funcionario.salario);
            System.out.println(funcionario.calculaGanhoAnual());
            funcionario.mostra();
            System.out.print("\n"+funcionario.dataDeEntrada.DataFormated());

        }
}


