

public abstract class Conta {
    String nome_titular;
    Double saldo = 0.0 ;
    int numero;
    public Conta(String nome_titular, Double saldo, int numero) {
        this.nome_titular = nome_titular;
        this.saldo = saldo;
        this.numero = numero;
    }

    void depositar(double saldo){
        this.saldo += saldo;
    }

    abstract boolean sacar(double saque);


       

    


}
