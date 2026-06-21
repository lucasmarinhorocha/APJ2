package Treinp;

public abstract class Forma {

    public abstract double area();

    public abstract double perimetro();

    public void exibirInformacoes() {
        System.out.println("Area: " + area());
        System.out.println("Perimetro: " + perimetro());
    }

    public abstract double diagonal();

  
}
