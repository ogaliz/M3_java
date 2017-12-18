
package examen2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author cf17oscar.galvez
 * Crea un programa per calcular els salaris setmanal d'uns empleats
 * als quals se'ls paga 20€ per hora.  El programa demana les hores del
 * treballador i retorna el salari que se li ha de pagar.  A més, ha de
 * preguntar si desitgem calcular un altre salari (resposta «si/no»), si
 * és així el programa es torna a repetir.
 * Els 20€ per hora es paguen si les hores no superen les 35. 
 * Cada hora per sobre de 35 es considerarà extra i es paga a 30€
 */
public class Ejercicio1 {
  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int continuar;
        int total_percibido=0, total=0;
        
        do{
        System.out.println("Cuantas horas has trabajado?");
        int horas = teclado.nextInt();
            
            if(horas>0 && horas<=35){
                total_percibido= horas*20;
                System.out.println("El total a percibir por ahora es de: "+total_percibido+" euros.");
                total +=total_percibido;
                
            }else if(horas>0 && horas>35){
                total_percibido= (horas-35)*30+(35*20);      //con esta operacion calculamos el sobrecoste de las horas extras
                System.out.println("El total a percibir por ahora es de: "+total_percibido+" euros.");
                total +=total_percibido;
                
            }else{
                System.out.println("Esa cantidad no la podemos tramitar");
            }
            
        continuar= JOptionPane.showConfirmDialog(null, "Desea realizar otra operacion?", "Continuar?", 1);
   
        }while(continuar==0);     //si no se acepta el cuadro se sale del programa
        
        System.out.println("\n");
        System.out.println("TOTAL NOMINAS: "+total+" euros");
        
    }//cierre del main
    
}//cierre del class
