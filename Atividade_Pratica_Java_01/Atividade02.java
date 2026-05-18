

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double notas[] = new double[10]  ;

        for(int i = 0; i < notas.length; i++){
            System.out.println("informe a nota do aluno: "+ (i+1));
            notas[i] = sc.nextDouble();

        }
        double soma = 0;
        double media = 0;

        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        media = soma / notas.length;
        System.out.println("A média da turma é: "+ media);

        for(int i = 0; i < notas.length; i++ ){
            if(notas[i] < media){
                System.out.println("O aluno " + (i+1) + " ficou abaixo da media com uma nota de " + notas[i]);
            } else{
                System.out.println("O aluno " + (i+1) + " ficou acima da media com uma nota de " + notas[i]);
            }
        }
        sc.close();

    }

}
