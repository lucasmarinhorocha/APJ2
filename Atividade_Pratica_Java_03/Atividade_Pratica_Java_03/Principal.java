package Atividade_Pratica_Java_03;



import java.util.ArrayList;
import java.util.Scanner;



public class Principal {
static    ArrayList<Conta> contas = new ArrayList<>();

   static int getConta(Scanner sc,ArrayList<Conta> conta) {
    System.out.println("Informe qual conta você quer utilizar de 1 a " + conta.size());
    mostrarContas(conta);
    int valor = sc.nextInt();
    return valor - 1;
}

   static void mostrarContas(ArrayList<Conta> conta) {
    System.out.println("Contas disponíveis:");
    for (int i = 0; i < conta.size(); i++) {
        System.out.println((i + 1) + ". " + conta.get(i).getNumero() + " - " + conta.get(i).getNomeTitular()+" - " );
        conta.get(i).imprimirTipoconts();
    }
}

public static void main(String[] args) {

 Conta c = null ;

Scanner scan = new Scanner(System.in);
boolean condition = true ;
int opcao ;
int numeroConta = 0;
while (condition) {
    

System.out.println("Informe o tipo de conta que deseja criar\n1 - Conta comum\n2 - Conta poupança\n3 - Conta especial");

opcao = scan.nextInt();

switch (opcao) {
    case 1:
        c = new Conta(null, 0, 0);
       
        break;
    case 2:
        c = new Conta_popanca(null, 0, 0);
       
        break;
    case 3:
        c = new Conta_especial(null, 0, 0, 500);
       
        break;
    default:
        System.out.println("Opção inválida");
        break;

}
c.imprimirTipoconts();
   


                System.out.println("informe o nome");
              
                c.setNomeTitular(scan.next()); 
                
                c.setNumero(++numeroConta);
                contas.add(c); // <-- adiciona na listacfxd
                System.out.println("numero da conta: " + c.getNumero());
                
                System.out.println("Conta criada com sucesso");

                System.out.println("Deseja criar outra conta? (s/n)");
                String resposta = scan.next();
                if (!resposta.equalsIgnoreCase("s")) {
                    condition = false;
                }
            }


            mostrarContas(contas);
            scan.close();
}















    /*static    ArrayList<Conta> contas = new ArrayList<>();

   static int getConta(Scanner sc,ArrayList<Conta> conta) {
    System.out.println("Informe qual conta você quer utilizar de 1 a " + conta.size());
    mostrarContas(conta);
    int valor = sc.nextInt();
    return valor - 1;
}

   static void mostrarContas(ArrayList<Conta> conta) {
    System.out.println("Contas disponíveis:");
    for (int i = 0; i < conta.size(); i++) {
        System.out.println((i + 1) + ". " + conta.get(i).getNumero() + " - " + conta.get(i).getNomeTitular());
    }
}

    public static void main(String[] args) {

        boolean execucao = true;

        Scanner sc = new Scanner(System.in);
        
       int numeroConta = 0;

       while(execucao){

            System.out.println("\n------SEJA BEM VINDO------\n ");
                System.out.println("DIGITE 1 PARA CRIAR CONTA\nDIGITE 2 PARA VER SALDO\nDIGITE 3 PARA SACAR\nDIGITE 4 PARA DEPOSITAR\nDIGITE QUALQUER OUTRO VALOR PARA SAIR");        String escolha = sc.next();

            switch (escolha) {

                    case "1": 

                Conta conta_usuario = new Conta(null, 0, 0);
                System.out.println("informe o nome");
                conta_usuario.setNomeTitular(sc.next()); 
                
                conta_usuario.setNumero(++numeroConta);
                contas.add(conta_usuario); // <-- adiciona na listacfxd
                System.out.println("numero da conta: " + conta_usuario.getNumero());
                
                System.out.println("Conta criada com sucesso");

                    break;

                    case "2":

                    int conta_atual = getConta(sc,contas);
                    System.out.print("saldo da conta:\n" + contas.get(conta_atual).getSaldo());
                    
                    break;

                    case "4":
                    System.out.println("Informe qual conta você quer utilizar para depositar");
                    int conta_atualDEP = getConta(sc,contas);
                        System.out.println("informe quanto voce quer depositar\nseu saldo atual é:" + contas.get(conta_atualDEP).getSaldo());
                    double deposito = sc.nextDouble();

                    contas.get(conta_atualDEP).depositar(deposito);
                    
                        System.out.println("deposito realizado\n seu saldo atual é: " + contas.get(conta_atualDEP).getSaldo());
                        
                        break;
                    
                    case "3": System.out.println("informe quanto voce quer sacar\n seu saldo atual é:" );
                    int conta_atualSAC = getConta(sc,contas);
                    System.out.println("informe quanto voce quer sacar\nseu saldo atual é:" + contas.get(conta_atualSAC).getSaldo());
                    double saque = sc.nextDouble();
                    
                    if(contas.get(conta_atualSAC).sacar(saque)){
                        System.out.println("Saque efetudo com sucesso\nseu saldo atual é: " + contas.get(conta_atualSAC).getSaldo());
                    } else {
                        System.out.println("Saque não efetuado\nseu saldo atual é: " + contas.get(conta_atualSAC).getSaldo());
                    }   
                    break;

                    default:
                        System.out.println("Saindo...");
                        execucao = false;
                        sc.close();
                        break;

                        
                }

            }






            /* 
            Conta conta = new Conta();
            Conta conta2 = new Conta();

            conta.depositar(500);
            conta.nome = "jorge";
            conta2.depositar(1000);
            conta2.nome = "maria";

                System.out.println(conta.nome);
                System.out.println(conta.saldo);
                boolean permicao = conta.sacar(450);

                if(permicao){
                    System.out.println("Permitido");
                } else {
                    System.out.println("Proibido");
                }
                System.out.println(conta.saldo);


                System.out.println(conta2.nome);
                System.out.println(conta2.saldo);
}
                */












            }
            
        
        
