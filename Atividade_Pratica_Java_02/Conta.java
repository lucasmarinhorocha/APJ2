package Atividade_Pratica_Java_02;

public class Conta {
    
    String nome_titular;
    Double saldo = 0.0 ;
    String numero;

    void depositar(double saldo){
        this.saldo += saldo;
    }

    boolean sacar(double saque){


        if(saque <= this.saldo){
            this.saldo -= saque;
            return true ;
        } else {
            return false;
        }

    }



}
