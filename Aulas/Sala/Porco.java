package Sala;

public class Porco extends Animal{
    public Porco(String nome) {
        super(nome);
    }
    public String falar() {
        return "Oink";
    }
    public void falarCom(Animal a) {
        System.out.println("Oi "+ a.nome);
    }
    public String toString() {
        return "Eu sou o " + this.nome + "e sou um porco";
    }
}
