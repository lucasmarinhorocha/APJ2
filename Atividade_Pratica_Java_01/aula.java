
 import java.util.Scanner;

public class aula {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade ;
        

        System.out.println("informe sua idade");
        idade = sc.nextInt();

        if(idade < 16){
            
        System.out.println("Não votante");


        } else if((idade >= 16 && idade <= 17) || idade > 65 ){
        
        System.out.println("Voto facultativo");


        } else{
        System.out.println("Votante");

        }
        sc.close();


    }
}
