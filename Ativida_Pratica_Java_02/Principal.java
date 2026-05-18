package Ativida_Pratica_Java_02;
import java.util.ArrayList;
import java.util.Scanner;



public class Principal {
    static    ArrayList<Conta> contas = new ArrayList<>();

   static int getConta(Scanner sc,ArrayList<Conta> conta) {
    System.out.println("Informe qual conta você quer utilizar de 1 a " + conta.size());
    int valor = sc.nextInt();
    return valor - 1;
}


    public static void main(String[] args) {

        boolean execucao = true;

        Scanner sc = new Scanner(System.in);
        
       

       while(execucao){

        System.out.println("------SEJA BEM VINDO------");
            System.out.println("DIGITE 1 PARA CRIAR CONTA\nDIGITE 2 PARA VER SALDO\nDIGITE 3 PARA SACAR\nDIGITE 4 PARA DEPOSITAR\nDIGITE QUALQUER OUTRO VALOR PARA SAIR");        String escolha = sc.next();

        switch (escolha) {

            case "1": 


            Conta conta_usuario = new Conta();

            System.out.println("informe o nome");
              conta_usuario.nome_titular = sc.next();
                System.out.println("informe o numero da conta");
                conta_usuario.numero = sc.next();
                contas.add(conta_usuario); // <-- adiciona na lista
                System.out.println("Conta criada com sucesso");
                break;

            case "2":

            int conta_atual = getConta(sc,contas);
            System.out.print("saldo da conta:\n" + contas.get(conta_atual).saldo);
            
            break;

            case "4":

            int conta_atualDEP = getConta(sc,contas);
                System.out.println("informe quanto voce quer depositar\nseu saldo atual é:" + contas.get(conta_atualDEP).saldo);
            double deposito = sc.nextDouble();

            contas.get(conta_atualDEP).depositar(deposito);
            
                System.out.println("deposito realizado/nseu saldo atual é: " + contas.get(conta_atualDEP).saldo);
                
                break;
            
            case "3": System.out.println("informe quanto voce quer sacar\nseu saldo atual é:");
            int conta_atualSAC = getConta(sc,contas);
            double saque = sc.nextDouble();
            if(contas.get(conta_atualSAC).sacar(saque)){
                System.out.println("Saque efetudo com sucesso\nseu saldo atual é: " + contas.get(conta_atualSAC).saldo);
            } else {
                System.out.println("Saque não efetuado\nseu saldo atual é: " + contas.get(conta_atualSAC).saldo);
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
        */
    }
    
}
