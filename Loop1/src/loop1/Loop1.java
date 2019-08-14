
package loop1;

import java.util.Scanner;


public class Loop1 {

   
    public static void main(String[] args) {
       
         Scanner leia = new Scanner (System.in);
       int entrada = 0;
       int total = 0;
       int media = 0;
       int maiorValor = 0;
       
       for (int i = 1; i <= 15; i++) {
           System.out.println ("Informe o valor:");
           entrada = leia.nextInt();
          
           total += entrada;
           media = total / 15;
           System.out.println("Somatória: "+total);
           
           
           
       }
       System.out.println("");
       System.out.println("O total é: "+total);
       System.out.println("A média dos preços é: "+media);
    }
    
}
