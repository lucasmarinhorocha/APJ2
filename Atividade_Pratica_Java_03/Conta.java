//package Atividade_Pratica_Java_03;

public class Conta {

    private String nomeTitular;
    private double saldo;
    private int numero;

    // Construtor 
    public Conta(String nomeTitular, int numero, double saldoInicial) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    // Métodos de acesso (getters e setters)

    public void imprimirTipoconts(){
        System.out.println("Conta comum");
    }
    /* 
     public void imprimirTipoconts(char tipo){
        System.out.println("Conta comum"+ tipo);
    }*/

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Métodos de operação
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

   
}




