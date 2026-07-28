package Atividade_Pratica_Java_06.Interfaces.Exemplo;



public class Triatleta extends Pessoa implements Nadador, Corredor, Ciclista {
    public Triatleta(String nome) {
        super(nome);
    }

   
    public void aquecer() {
        System.out.println(this.getNome() + " está aquecendo...");
    }
    public void nadar() {
        System.out.println(this.getNome() + " está nadando...");
    }
    
   
    public void correr() {
        System.out.println(this.getNome() + " está correndo...");
    }

    
    public void pedalar() {
        System.out.println(this.getNome() + " está pedalando...");
    }
    
}
