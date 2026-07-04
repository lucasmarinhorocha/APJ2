package Treinp;

public abstract class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }
  
    public String getNome() {
        return nome;
    }


// Atributos e métodos comuns a todas as formas usando o abstract class Forma, que serve como base para Retangulo e Circulo
    public abstract double area();

    public abstract double perimetro();

    public abstract double diagonal();

    
    public void exibirInformacoes() {
        System.out.println("Area: " + area());
        System.out.println("Perimetro: " + perimetro());
        System.out.println("Diagonal: " + diagonal());
    }

    

  
}
