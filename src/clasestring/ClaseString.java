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

        String s = "iesmardealboran.com";

        //Tamaño de la cadena
        System.out.println("Tamaño: " + s.length());

        //Obtener char de una posicion concreta
        System.out.println("Char asociado a la posicion 5: " + s.charAt(5));

        //Obtener subcadena desde el caracter i hasta el final de la cadena
        String subcadena = s.substring(3);
        System.out.println("Subcadena " + subcadena);

        //Obtener subcadena desde el caracter i-esimo hasta el caracterj-esimo
        subcadena = s.substring(8, 15);
        System.out.println("Subcadena " + subcadena);

        //Concatenar cadenas. equivale al operador +
        String s1 = "ies";
        String s2 = "mardealboran.com";
        String nuevo = s1 + s2;
        String nuevo2 = s1.concat(s2);
        System.out.println("Nuevo " + nuevo);
        System.out.println("Nuevo2 " + nuevo2);

//      Devuelve el indice dentro de la cadena
//      de la primera aparicion de la cadena a buscar
        int indice = nuevo.indexOf("mar");
        System.out.println("Indice " + indice);

        indice = nuevo.indexOf("ran", 10);
        System.out.println("indice " + indice);

        // Metodos equals y equalsIgnoreCase
        System.out.println("Igualdad Java y java: " + "Java".equals("java"));
        System.out.println("Igualdad Java y java: " + "Java".equalsIgnoreCase("java"));

        /*Comparacion de cadenas (diccionario). Metodo compareTo()
        Devuelve 0 si las cadenas son iguales, 
        un positivo si s1 esta antes del diccionario (menor) 
        o un positivo si s1 esta despues de s2 (mayor)*/
        int compareTo = s1.compareTo(s1);
        System.out.println("Comparacion de s1 y s1: " + compareTo);

        compareTo = s1.compareTo("aes");
        System.out.println("Comparacion de s1 y aes: " + compareTo);

        compareTo = "aes".compareTo(s1);
        System.out.println("Comparacion entre aes y s1: " + compareTo);

        //conversion mayusculas a minusculas
        String mayusculas = s2.toUpperCase();
        System.out.println("s2 en mayus: " + mayusculas);
        System.out.println("String mayusculas en minusculas; " + mayusculas.toLowerCase());

        String espacios = " palabra palabra ";
        System.out.println("Tamaño de espacios: " + espacios.length());
        
        String sinEspacios=espacios.trim();
        System.out.println("Tamaño de sinEspacios: "+sinEspacios.length());
        
        //remplazo de caracteres
        System.out.println("String original: "+s2);
        String str2=s2.replace('a', 'x');
        System.out.println("String remplazado "+str2);
        
        //Contenido
        String aBuscar="dealbo";
        System.out.println("¿Contiene? "+s2+" la subcadena "+aBuscar+"?"+s2.contains(aBuscar));
        
        //Probar metodos endsWith, startsWith, isEmpty
        
        //Obtener un array de char de la cadena
        //declaracion de una variable array de tipo char
        char[] arrayChar;
        arrayChar=s2.toCharArray();
        
        //El atributo length existe en todos los arrays y me indica su tamaño equivalente al metodo length de los estring
        for (int i = 0; i < arrayChar.length; i++) {
            
            //Para acceder a cada posicion de memoria uso los corchetes
            System.out.println("posicion i = "+i+" contenido = "+arrayChar[i]);
            
        }

    }

}
