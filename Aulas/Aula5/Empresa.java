package Aula5;

public class Empresa {
    //Classe empresa
    private Funcionario[] empregados;
    private String cnpj;
    private int quantidadeFuncionarios = 0;

    public void setQuantidadeF(int quantidade){
        this.empregados = new Funcionario[quantidade];
    }
    public void adiciona(Funcionario f){
        this.empregados[quantidadeFuncionarios] = f;
        quantidadeFuncionarios++;
    }
    public void mostraFuncionario(){
        for (Funcionario i : this.empregados){
            i.mostrarFuncionario();
        }
    }
    public void verificarExistencia(String string){
        int cont = 0;
        for (Funcionario i : this.empregados){
            if (i.getNome().equals(string)){
                cont = 1;
                System.out.println("Esse funcionário existe");
                i.mostrarFuncionario();
            }
        }
        if (cont == 0){
            System.out.println("Esse funcionario não existe");
        }
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }
}
