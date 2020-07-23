/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro Montalvo
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClaseP  {
    public static void main(String[] args) throws Exception {
        
        // patron complejo que inicie con a
        //String patronComplejo = "^a.*";
        System.out.println("--------------------------------");
        String cadena = " babarc corbata media asdasd jbbnabaa  ";
        
        String patronA= " [a-z]+["+"ba*]+"+"[a-z]+";
        System.out.println("patron complejo:" + patronA);
        System.out.println(cadena);

        Pattern patron= Pattern.compile(patronA);
        Matcher mat = patron.matcher(cadena);

        // buscar ocurrencias
        while (mat.find()) {
            
            System.out.println("Encontrado " +mat.group());
          
        }

            System.out.println("-------------------------------------------");
        String cadena1 = " asldkasd barco barba haasd bc bebac asdasd ";
        
        String patronbc= " [^bc]+ ";
        System.out.println("patron complejo:" + patronbc);
        System.out.println(cadena1);

        Pattern patron1= Pattern.compile(patronbc);
        Matcher mat2 = patron1.matcher(cadena1);

        // buscar ocurrencias
        while (mat2.find()) {
            
            System.out.println("Encontrado " +mat2.group());
          
        }
        System.out.println("");
        String patronComplejo3 = " [2]+("+"[0-9]*)+"+1;
        String cadenaNumero = "2201 22221 asdasdasdi 20101 00125 1023 255222aaa1 ajsdnaskdl54a1d2 blah 201201 21 12  2001";
        
        System.out.println("patron Complejo:" + patronComplejo3);
        System.out.println(cadenaNumero);

        Pattern pattern = Pattern.compile(patronComplejo3);
        Matcher mat0 = pattern.matcher(cadenaNumero);
        while (mat0.find()) {
            
            System.out.println("Encontrado " +mat0.group());
          
        }
        
        System.out.println("-------------------------------------");
        String cadena3 = "aksjdab asljdaoaisb ab cdab";
        
        String patron3= "[a-b]{2}+";
        System.out.println("patron complejo:" + patron3);
        System.out.println(cadena3);

        Pattern patron4= Pattern.compile(patron3);
        Matcher mat3 = patron4.matcher(cadena3);

        // buscar ocurrencias
        while (mat3.find()) {
            
            System.out.println("Encontrado " +mat3.group());
          
        }
    }
}
