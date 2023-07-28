/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import exercise3.services.AlumnoService;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        AlumnoService as = new AlumnoService();
        int opcion;
        
        while(true){
            
            System.out.println("--- MENU ---");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Mostrar nota final");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = read.nextInt();
            
            if(opcion!=1 && opcion!=2 && opcion!=3){
                System.out.println("Debe ingresar una opción válida\n");
            }else if (opcion==3){
                break;
            } else{
                switch(opcion){
                    case 1:
                        as.cargarAlumnos();
                        break;
                    case 2:
                        System.out.println("--- Buscar alumno ---");
                        System.out.print("Ingrese el nombre del alumno: ");
                        as.notaFinalPorAlumno(read.next());
                        break;
                    default:
                        System.out.println("Usted ingresó una opción incorrecta\n");
                }
            } 
        }
    }
}
