package Sala;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }
    public String falar() {
        return "Au Au";
    }
    public void falarCom(Animal a) {
        System.out.println("Oi " + a.nome);
    }
    public String toString() {
        return "Eu sou o " + this.nome + "e sou um cachorro";
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
