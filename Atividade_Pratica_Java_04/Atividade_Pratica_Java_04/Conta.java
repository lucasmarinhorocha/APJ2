package Atividade_Pratica_Java_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Conta {
    public String nome_titular;
    public Double saldo  ;
    public int numero;


    public Conta(String nome_titular,  Double saldo, int numero) {
        this.nome_titular = nome_titular;
        this.saldo = saldo;
        this.numero = numero;
    }

    void depositar(double saldo){
        this.saldo += saldo;
    }

    boolean sacar(double saque) {
        if (saque <= this.saldo) {
            this.saldo -= saque;
            return true;
        }
        return false;
    }

public String getNomeTitular() {
        return nome_titular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nome_titular = nomeTitular;
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

    

    public int getConta(Scanner sc, ArrayList<Conta> conta) {
        System.out.println("Informe qual conta você quer utilizar de 1 a " + conta.size());
        mostrarContas(conta);
        int valor = sc.nextInt();
        return valor - 1;
    }
       public void imprimirTipoconts(){
        System.out.println("Conta comum");
    }

    public void mostrarContas(ArrayList<Conta> conta) {
        System.out.println("Contas disponíveis:");
        for (int i = 0; i < conta.size(); i++) {
            System.out.print((i + 1) + ". " + conta.get(i).getNumero() + " - " + conta.get(i).getNomeTitular() + " - ");
            conta.get(i).imprimirTipoconts();
        }
    }

    public boolean vericar(int numeroConta) {
        return this.numero == numeroConta;
    }

   
}




       

    



