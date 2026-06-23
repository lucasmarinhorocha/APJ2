package Atividade_Pratica_Java_06.Banco;


public class Cliente extends Conta{
    
 
     public Cliente(String nome_titular,int numero, Double saldo) {
        super(nome_titular, saldo, numero);
     }

    @Override
    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
