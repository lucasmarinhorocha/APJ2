package Atividade_Pratica_Java_03;
//package POO;

public class Conta {
    
    private String nome_titular;
    private Double saldo  ;
    private int numero;

    void depositar(double saldo){
        this.saldo += saldo;
    }

    void setNomeTitular(String nome){
        this.nome_titular = nome;
    }

    String getNomeTitular(){
        return this.nome_titular;
    }

    void setSaldo(double saldo){
        this.saldo = saldo;
    }

    int getNumero(){
        return this.numero;
    }

    int getSaldo(){
        return this.saldo.intValue();
    }

    void setNumero(int numero){
        this.numero = numero;
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
