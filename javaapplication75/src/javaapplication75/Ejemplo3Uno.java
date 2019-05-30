/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejemplo3Uno {
    public static void main (String []args){
        // Creamos el obj. entrada
        Scanner entrada = new Scanner (System.in);
        
        // Creamos un array String con un valor inicial 
        String[] indicador = {"0 - 8", "8.1 - 12", "12.1 - 16", "16.1 - 19", "19.1 - 20", "20.1 - infinito"};
                // Posiciones:   0          1            2            3           4              5
                
        // Creamos un array notas con un tamano de 6        
        int [] notas = {0, 0, 0, 0, 0, 0};
        
        // Creamos un String reporte con un contenido inicial "Notas Ingresadas \n Rangos:"
        String reporte =  "Notas Ingresadas \n Rangos:\n";
        
        // Creamos la bandera con un valor inicial de true;   [true continua | false para]
        boolean bandera = true;
        
        // Creamos un while que se ejecute siempre que bandera sea true
        while(bandera){
            
            System.out.print("Ingrese la nota:");
            // El usuario ingresa la nota 
            double notaTemp = entrada.nextDouble();
            
            // con un if - elseif -else ingresamos la nota en la posicion indicada
            if(notaTemp >= 0){
                if (notaTemp >= 0 && notaTemp <=8){
                    notas[0]++;
                }else if(notaTemp > 8 && notaTemp <= 12){
                    notas[1]++;
                }else if(notaTemp>12 && notaTemp<=16){
                    notas[2]++;
                }else if(notaTemp>16 && notaTemp<=19){
                    notas[3]++;
                }else if(notaTemp>19 && notaTemp<=20){
                    notas[4]++;
                }else{
                    notas[5]++;
                }
            }else{
                System.out.println("Nota invalida, debe ser mayor o igual a 0");
            }
            
            
            // Consultamos al user si desea seguir ingresando notas
            System.out.println("Desea seguir ingresando datos? [SI / NO]");
            
            if(entrada.next().equalsIgnoreCase("no")){
                bandera = false;
            }
            
        }
     
        // Con un for almacenamos ambos arrays separadas por \t en el reporte
        for (int contador = 0; contador < 6; contador++){
            reporte += indicador [contador] + "\t" + notas[contador] + "\n";
        }
        
        // Finalmente imprimimos el reporte
        System.out.println(reporte);
    }
}
