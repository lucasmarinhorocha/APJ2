package Treinp;

public class Principal {
    public static void main(String[] args) {
        
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            while (true) {
                System.out.println("Escolha a forma:\n 1 - Retangulo,\n 2 - Circulo,\n 3 - Sair");
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1:
                        System.out.println("Digite a largura do retangulo:");
                        double largura = scanner.nextDouble();
                        System.out.println("Digite a altura do retangulo:");
                        double altura = scanner.nextDouble();
                        Forma retangulo = new Retangulo(largura, altura);
                        retangulo.exibirInformacoes();
                        System.out.println("Area do retangulo: " + retangulo.area());
                        System.out.println("Perimetro do retangulo: " + retangulo.perimetro());
                        System.out.println("Diagonal do retangulo: " + retangulo.diagonal());

                        break;
                    case 2:
                        System.out.println("Digite o raio do circulo:");
                        double raio = scanner.nextDouble();
                        Forma circulo = new Circulo(raio);
                        circulo.exibirInformacoes();
                        System.out.println("Area do circulo: " + circulo.area());
                        System.out.println("Perimetro do circulo: " + circulo.perimetro());
                        
                        break;
                    case 3:
                        System.out.println("Saindo...");
                        return;
                    default:
                        System.out.println("Escolha invalida, tente novamente.");
                }
            }
        }

    }
}