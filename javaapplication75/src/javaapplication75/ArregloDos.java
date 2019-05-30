/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

/**
 *
 * @author reroes
 */
public class ArregloDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] c = {10, 20, 30, 40};                    // declaramos el array
        // c = new int[12];                            // Inicializamos el array
        
        String[] b = new String[100];
        String[] x = new String[10];
        
        for(int contador = 0; contador < c.length; contador++){
            System.out.printf("\n%d\t%d\t%.02f", contador, c[contador], Math.pow(c[contador], 2));
        }
        
    }
    
}
