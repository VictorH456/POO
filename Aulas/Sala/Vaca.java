package Sala;

public class Vaca extends Animal{
    public Vaca(String nome) {
        super(nome);
    }
    public String falar() {
        return "Muu";
    }
    public void falarCom(Animal a) {
        System.out.println("Oi "+ a.nome);
    }
    public String toString() {
        return "Eu sou o " + this.nome + "e sou uma vaca";
    }
}
