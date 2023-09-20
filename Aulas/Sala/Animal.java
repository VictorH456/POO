package Sala;

abstract class Animal {
    protected String nome;
    public Animal(String nome){
        this.nome = nome;
    }
    abstract public String falar();
    abstract public void falarCom(Animal a);
    public abstract String toString();
}
