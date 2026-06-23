public class Cliente extends Conta{
    
    String nome_titular;
    double saldo;
    int numero;
     public Cliente(String nome_titular, Double saldo, int numero) {
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
