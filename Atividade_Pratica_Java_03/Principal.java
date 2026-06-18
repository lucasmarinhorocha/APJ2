
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Conta> contas = new ArrayList<>();
/* 
    static int getConta(Scanner sc, ArrayList<Conta> conta) {
        System.out.println("Informe qual conta você quer utilizar de 1 a " + conta.size());
        mostrarContas(conta);
        int valor = sc.nextInt();
        return valor - 1;
    }

    static void mostrarContas(ArrayList<Conta> conta) {
        System.out.println("Contas disponíveis:");
        for (int i = 0; i < conta.size(); i++) {
            System.out.print((i + 1) + ". " + conta.get(i).getNumero() + " - " + conta.get(i).getNomeTitular() + " - ");
            conta.get(i).imprimirTipoconts();
        }
    }
*/
    public static void main(String[] args) {
        double limiteEspecial ; // Limite para contas especiais
        Conta c = null;
        Scanner scan = new Scanner(System.in);
        boolean condition = true;
        int opcao;
        int numeroConta = 0;

        while (condition) {
            System.out.println("\n------SEJA BEM VINDO------\n");
            System.out.println("DIGITE 1 PARA CRIAR CONTA\nDIGITE 2 PARA VER SALDO\nDIGITE 3 PARA SACAR\nDIGITE 4 PARA DEPOSITAR\nDIGITE QUALQUER OUTRO VALOR PARA SAIR");

            opcao = scan.nextInt();
            
            // Tratamento caso o usuário escolha operar uma conta sem antes criar uma
            if ((opcao >= 2 && opcao <= 4) && contas.isEmpty()) {
                System.out.println("Nenhuma conta cadastrada ainda. Crie uma conta primeiro!");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Informe o tipo de conta que deseja criar:\n1 - Conta Comum\n2 - Conta Poupança\n3 - Conta Especial");
                    int tipoConta = scan.nextInt();
                    switch (tipoConta) {
                        case 1:
                            c = new Conta(null, 0, 0);
                            break;
                        case 2:
                            c = new Conta_popanca(null, 0, 0); // Ajuste conforme o nome exato da sua classe (ex: ContaPoupanca)
                           
                            break;
                        case 3:
                             // Ajuste conforme o nome exato da sua classe
                             System.out.println("informe o limite para a conta especial:");
                            limiteEspecial = scan.nextDouble();
                            c = new Conta_especial(null, 0, 0, limiteEspecial);
                            break;
                        default:
                            System.out.println("Tipo inválido! Criando conta padrão comum.");
                            c = new Conta(null, 0, 0);
                            break;
                    }
                    
                    System.out.println("Informe o nome:");
                    scan.nextLine(); // Limpa o buffer do teclado
                    c.setNomeTitular(scan.nextLine());

                    c.setNumero(++numeroConta);
                    contas.add(c);
                    System.out.println("Número da conta: " + c.getNumero());
                    System.out.println("Conta criada com sucesso!");
                    break;

                case 2:
                    int conta_atual = c.getConta(scan, contas);
                    System.out.println("Saldo da conta: " + contas.get(conta_atual).getSaldo());
                    break;

                case 4:
                    System.out.println("Informe qual conta você quer utilizar para depositar:");
                    int conta_atualDEP = c.getConta(scan, contas);
                    System.out.println("Informe quanto você quer depositar. Seu saldo atual é: " + contas.get(conta_atualDEP).getSaldo());
                    double deposito = scan.nextDouble();

                    contas.get(conta_atualDEP).depositar(deposito);
                    System.out.println("Depósito realizado! Seu saldo atual é: " + contas.get(conta_atualDEP).getSaldo());
                    break;

                case 3:
                    System.out.println("Informe qual conta você quer utilizar para sacar:");
                    int conta_atualSAC = c.getConta(scan, contas);
                    System.out.println("Informe quanto você quer sacar. Seu saldo atual é: " + contas.get(conta_atualSAC).getSaldo());
                    double saque = scan.nextDouble();

                    if (contas.get(conta_atualSAC).sacar(saque)) {
                        System.out.println("Saque efetuado com sucesso! Seu saldo atual é: " + contas.get(conta_atualSAC).getSaldo());
                    } else {
                        System.out.println("Saque não efetuado (Saldo/Limite insuficiente). Seu saldo atual é: " + contas.get(conta_atualSAC).getSaldo());
                    }
                    break;

                default:
                    System.out.println("Saindo...");
                    condition = false;
                    break;
            }
        }
        
        scan.close();
        System.out.println("\n--- Resumo de Contas ao Finalizar ---");
        c.mostrarContas(contas);
    }
}