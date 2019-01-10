/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasestring;

/**
 *
 * @author salva
 */
public class ClaseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String s="iesmardealboran.com";
        
        //Tamaño de la cadena
        System.out.println("Tamaño: "+s.length());
        
        //Obtener char de una posicion concreta
        System.out.println("Char asociado a la posicion 5: "+s.charAt(5));
        
        //Obtener subcadena desde el caracter i hasta el final de la cadena
        String subcadena=s.substring(3);
        System.out.println("Subcadena "+subcadena);
        
        //Obtener subcadena desde el caracter i-esimo hasta el caracterj-esimo
        subcadena=s.substring(8,15);
        System.out.println("Subcadena "+subcadena);
        
        //Concatenar cadenas. equivale al operador +
        String s1="ies";
        String s2="mardealboran.com";
        String nuevo=s1+s2;
        String nuevo2=s1.concat(s2);
        System.out.println("Nuevo "+nuevo);
        System.out.println("Nuevo2 "+nuevo2);
        
        
        
        
    }
    
}
