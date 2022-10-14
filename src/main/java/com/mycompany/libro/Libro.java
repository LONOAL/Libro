

package com.mycompany.libro;

import java.util.Scanner;


/**
 *
 * @author PC-LORENZO
 */
public class Libro {
             
    public static void main(String[] args) {
        //Inicializar los atributos
             String titu;
            String aut;
            int an;
            short pag;
        //Instancio el objeto scanner
           Scanner scan= new Scanner(System.in);
        //Pido los valores con el objeto scanner
        System.out.print("Teclee el titulo del libro: ");
            titu= scan.nextLine();
        System.out.print("Teclee el nombre del autor: ");
            aut= scan.nextLine();
        System.out.print("Teclee el año en el que se publicó: ");
            an= scan.nextInt();
        System.out.print("Teclee el numero de páginas: ");
            pag= scan.nextShort(); 
        //Inicializo el objeto con el constructor
            ObxLibro obxLibro1 = new ObxLibro(titu, aut, an, pag);   
        //Obtengo los valores con el objeto
            obxLibro1.amosar();
           
            ObxLibro obxLibro2 = new ObxLibro(titu, aut, an, pag);
            obxLibro2.amosar();
            
        
        
   
        
        
    }
}
