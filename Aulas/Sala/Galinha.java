package Sala;

public class Galinha extends Animal{
    public Galinha(String nome) {
        super(nome);
    }
    public String falar() {
        return "Popopo";
    }
    public void falarCom(Animal a) {
        System.out.println("Oi "+ a.nome);
    }
    public String toString() {
        return "Eu sou o " + this.nome + "e sou uma galinha";
    }
}
