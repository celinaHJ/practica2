/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapractica2;
import java.util.Scanner;
/**
 *
 * @author madeline
 */
public class CalculadoraPractica2 {

     public static void main (String args []){
        
        //define variables
    Scanner objinput = new Scanner (System.in);
    String strcontinuar = null;
    
    
    do{
        
        System.out.println(" selecciona una opcion  ");
        System.out.println("a si desea sumar ");
        System.out.println("b  si desea restar");
        System.out.println("c: si desea multiplicar");
        System.out.println("d: si desea dividir");
        System.out.println(" escriba su opción");
        
        //recibe el valor del buffer del teclado
        String strOpción = objinput.nextLine();
        
        //definir variables para las operaciones
        float [] fltarrNumeros = new float [2];
                float fltResultado = 0;
                
                //definir variables de error
                boolean blnError = true;
                
             switch(strOpción){
    
                 case "a":
                  strOpción = "suma" ;
                     System.out.println(" ");
                     
                     //solicitar los valores numericos
                     for(int i = 0;i<2; i++ ){
                     
                         System.out.println(" ingrese el numero "+(i+1) +":");
                         fltarrNumeros[i] = objinput.nextFloat();
                     }
                     fltResultado = fltarrNumeros [0] - fltarrNumeros[1];
                     //control
                     blnError= false;
                     break;
                     
                     
                      case "b":
                     strOpción = "resta" ;
                     System.out.println(" ");
                     
                     //solicitar los valores numericos
                     for(int i = 0;i<2; i++ ){
                     
                         System.out.println(" ingrese el numero "+(i+1) +":");
                         fltarrNumeros[i] = objinput.nextFloat();
                     }
                     fltResultado = fltarrNumeros [0] + fltarrNumeros[1];
                     //control
                     blnError= false;
                     break;
                     
                     
                      case "c":
                     strOpción = "multiplicación" ;
                     System.out.println(" ");
                     
                     //solicitar los valores numericos
                     for(int i = 0;i<2; i++ ){
                     
                         System.out.println(" ingrese el numero "+(i+1) +":");
                         fltarrNumeros[i] = objinput.nextFloat();
                     }
                     fltResultado = fltarrNumeros [0] * fltarrNumeros[1];
                     //control
                     blnError= false;
                     break;
                     
                      case "d":
                     strOpción = "division" ;
                     System.out.println(" ");
                     
                     //solicitar los valores numericos
                     for(int i = 0;i<2; i++ ){
                     
                         System.out.println(" ingrese el numero "+(i+1) +":");
                         fltarrNumeros[i] = objinput.nextFloat();
                     }
                     fltResultado = fltarrNumeros [0] / fltarrNumeros[1];
                     //control
                     blnError= false;
                     break;
                      default:
                          //en caso de error
                          blnError = true;
                          break;
            }
            System.out.println("");
            
            //despliega los datos si no hay error
            
            if(blnError== false ){
                System.out.println("el resultado es:"+fltResultado);
            }
            else if(blnError== true ){
                System.out.println("error no se puede realizar la operacion");
            }
            
            System.out.println("la opción seleccionada es:" + strOpción );
        
        //captura el buffer para continuar
        Scanner objinput2 = new Scanner (System.in);
        strcontinuar = objinput2.nextLine();
    
    }while(strcontinuar.equals("s") || strcontinuar.equals("S"));
    
    
    }
    
    
    
    
}
