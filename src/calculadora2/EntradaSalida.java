/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class EntradaSalida {
    private static Scanner sc=new Scanner(System.in); 
    public static int mostrarMenu()
    {
        
        System.out.println("Introduzca la opción:");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-SALIR");
        int opcion=sc.nextInt();
        return opcion;
    }
    public static int pedirNumero()
    {   
        
        System.out.println("Introduce un numero");
        int n=sc.nextInt();
        return n;
    }
    public static void mostrarResultado(int j)
    {
        System.out.println("El resultado es "+j);
    }
}
