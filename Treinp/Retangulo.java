package Treinp;

public class Retangulo extends Forma {

        private double largura;
        private double altura;
    
        public Retangulo(double largura, double altura) {
            super("Retangulo");
            this.largura = largura;
            this.altura = altura;
        }
    @Override
    public double area(){

        return largura*altura;
    }
    
    @Override
    public double perimetro(){
        return 2*(largura+altura);
    }
    
    @Override
    public double diagonal(){
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }
}
