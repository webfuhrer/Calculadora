/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

/**
 *
 * @author luis
 */
public class Calculadora2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion_seleccionada=EntradaSalida.mostrarMenu();
       int x, y, resultado;
        while(opcion_seleccionada!=4)
        {
            switch(opcion_seleccionada)
            {
                case 1://Sumar
                   x=EntradaSalida.pedirNumero();
                   y=EntradaSalida.pedirNumero();
                   resultado=Operacion.sumar(x, y);
                   EntradaSalida.mostrarResultado(resultado);
                    break;
                case 2://Restar
                     x=EntradaSalida.pedirNumero();
                    y=EntradaSalida.pedirNumero();
                    resultado=Operacion.restar(x, y);
                   EntradaSalida.mostrarResultado(resultado);
                    break;
                case 3://Multiplicar
                     x=EntradaSalida.pedirNumero();
                    y=EntradaSalida.pedirNumero();
                    resultado=Operacion.multiplicar(x, y);
                   EntradaSalida.mostrarResultado(resultado);
                    break;
            }
            opcion_seleccionada=EntradaSalida.mostrarMenu();
        }
        System.out.println("Bye bye");
    }
    
}
