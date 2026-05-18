
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double valores = 0;
        ArrayList<Double> registro = new ArrayList<>();
        
        double soma = 0;

        while(valores >= 0){
            System.out.println("Informe um valor:");
            valores = sc.nextDouble();

            if(valores >=0){
               registro.add(valores); 
            }
            
           
        }
        for(int i = 0; i < registro.size(); i++){
           soma += registro.get(i);
        }
        
        System.out.println("foram informados "+ registro.size() + " numeros");
        System.out.println("possue media igual a: "+ soma/registro.size());


        sc.close();
    }
}