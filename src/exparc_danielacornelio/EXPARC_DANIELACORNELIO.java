/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exparc_danielacornelio;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EXPARC_DANIELACORNELIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("EXAMEN PARCIAL - NUMEROS PRIMOS");
    int numero, c=0;
    Scanner tec= new Scanner(System.in);
    System.out.println("Ingrese un número :  ");
    numero=tec.nextInt();
    
    for(int x=numero;x>0;x--)
    {
        if(numero%x==0)
        {
            c=c+1;                
        }
        
    }   
         if(c==2) {System.out.println("El numero "+ numero +" es Primo");}
         else     {System.out.println("El numero "+ numero +" no es Primo");}
    }
    
}
