package Atividade_Pratica_Java_06.Banco;


public class Conta_popanca extends Conta implements Investimento {

    
public Conta_popanca(String nomeTitular, int numero, double saldoInicial) {
        super(nomeTitular, saldoInicial,numero);
    }

    //metodos da sub classe 
public void reajuste( double percentual){
    double saldo = this.getSaldo();
    double reajuste = saldo * percentual;
    this.depositar(reajuste);
}

@Override
public void imprimirTipoconts(){
        System.out.println("Conta poupança");
    }

public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }

}
