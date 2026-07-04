package Atividade_Pratica_Java_03;

public class Conta_popanca extends Conta{

    
public Conta_popanca(String nomeTitular, int numero, double saldoInicial) {
        super(nomeTitular, numero, saldoInicial);
    }

    //metodos da sub classe 
public void reajuste(double percentual){
    double saldo = this.getSaldo();
    double reajuste = saldo * percentual;
    this.depositar(reajuste);
}

@Override
public void imprimirTipoconts(){
        System.out.println("Conta poupança");
    }



}
