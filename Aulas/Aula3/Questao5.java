package Aula3;

public class Questao5 {
    public static void main(String[] args) {


        Questao1 f1 = new Questao1();
        f1.nome = "Victor";
        f1.salario = 2000;
        //f1.dataDeEntrada = "14/08/2023";
        f1.rg = "00.000.000-0";
        f1.departamento = "Administracao";

        //Questao1 f1 = new Questao1();
        f1.nome = "Victor";
        f1.salario = 2000;
        //f1.dataDeEntrada = "14/08/2023";
        f1.rg = "00.000.000-0";
        f1.departamento = "Administracao";
        if (f1 == f1){
            System.out.println("Iguais");
        }else {
            System.out.println("diferentes");
        }}
}