/*
Feu un programa en Java que llegeixi una frase escrita en una sola línia 
des del teclat, i ens digui el número de paraules que té. Heu de tenir en
compte que les paraules poden estar separades per mes d'un espai en blanc. 
La frase però, no començarà ni acabarà amb blancs.
 */
package examen2;

import java.util.Scanner;
/**
 * @author cf17oscar.galvez
 */
public class Compta_paraules {
        public static void main(String[] args) {
            
            Scanner teclado = new Scanner(System.in);
            char espacio=' ';
            int contador_espacios=0;
            String frase; 
            
            do{
                
            System.out.println("Escribe tu frase");
            frase = teclado.nextLine();
           
            }while(frase.charAt(0)==' ' || frase.charAt(frase.length())==' ');
            
                for(int i=0; i<frase.length(); i++){
                
                    if(frase.charAt(i)==' '){
                    
                    contador_espacios++;
                    
                    }
              
                }//cierre del for
            
            System.out.println("Su frase consta de: "+contador_espacios+" espacios, y "+contador_espacios+" palabras.");
            
              
        }//cierre del main
}//cierre del class
