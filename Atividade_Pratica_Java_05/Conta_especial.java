
public class Conta_especial extends Conta{
     public Conta_especial(String nomeTitular, int numero, double saldoInicial, double limite) {
        super(nomeTitular, saldoInicial, numero);
            this.limite = limite;
        
     
    }

private double limite ;


public double getLimit(){
    return limite;
}

public void setLimit(double limite){
    this.limite = limite;

}

public boolean sacar(double valor) {
    if (valor <=  this.limite + this.getSaldo()) {
        this.setSaldo(this.getSaldo() - valor);
        return true;
    }
    return false;
}

@Override
public void imprimirTipoconts(){
        System.out.println("Conta especial");
    }
}
