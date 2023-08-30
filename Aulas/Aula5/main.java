package Aula5;

public class main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João");
        //Quando crio privado não consigo alterar o nome diretamente
        //funcionario1.nome = "João";
        //funcionario1.salario = 2000

        //funcionario1.setNome("João");
        funcionario1.setSalario(2000);
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: " + funcionario1.getSalario());
        System.out.println("Identificador: " + funcionario1.getIdentificador());

        Funcionario funcionario2 = new Funcionario();

        funcionario2.setNome("Sujiro");
        funcionario2.setSalario(4000);
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Salário: " + funcionario2.getSalario());
        System.out.println("Identificador: " + funcionario2.getIdentificador());

    }
}
