package Sala;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }

    public String falar() {
        return "Miau";
    }

    public void falarCom(Animal a) {
        System.out.println("Oi "+ a.nome);
    }
    public String toString() {
        return "Eu sou o " + this.nome + "e sou um Gato";
    }
}
