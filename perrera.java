/**
 * Programación Orientada a Objetffgos
 * Profesor: Moises ALonso
 * Sección: 30
 */
/**
 * Laboratorio1
 * @author Bianca Calderón
 *
 */

import java.util.Scanner;

public class perrera {
	public static void main(String[] args) {
        persona voluntario = new persona(); //creamos nueva persona
        perro callejero = new perro(); //creamos nuevo perro
	    Scanner in = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; //Para guardar
	 
	        while (!salir) {
	        	
	        	System.out.println("1. Nueva persona");
	            System.out.println("2. Nuevo perro");
	            System.out.println("3. Sacar galleta");
	            System.out.println("4. Interactuar");
	            System.out.println("5. Salir");
	            
	 
	            try { //El try  en programación se utiliza para manejar fragmentos de código que son propensos a fallar, como puede ser: recibir un valor nulo
	            	  //Recuperado de: https://es.stackoverflow.com/questions/96278/para-que-sirve-el-try-y-catch-en-java
	 
	                System.out.println("Elige la opción a seguir");
	                opcion = in.nextInt();
	 
	                if (opcion==1) {
	                	System.out.println("Seleccionaste la opcion 1");
	                	System.out.println("La confiabilidad de la persona es: ");
	                 voluntario = new persona(); //Agregar nueva persona
	                 break;
	                        
	                }
	                        else if (opcion==2) {
	                        	System.out.println("Seleccionaste la opcion 2"); 
	                            callejero = new perro(); //Agregar nuevo perro
	                            callejero.psican(voluntario);
	                            break;
	                             
	                }  
	                        else if (opcion==3) {
	                        	System.out.println("Seleccionaste la opcion 3");
	                        	voluntario.darGalleta();//sacar galleta
	                          break;
	                
	                       
	                }
	                        else if (opcion==4) { 
	                        	//Interactuar con perro 
		                        System.out.println("Seleccionaste la opcion 4");
	                        	callejero.ladrar();
	                        	callejero.morder();
	                        	callejero.movercola();
	                        	break;
	                     
                    }
                            else if (opcion==5) {
                            System.out.println("Gracias por visitarnos!");
                    	    salir = true;
                            break;  
                          
                    }
	            } finally {//Recuperado de: https://stackoverflow.com/questions/5393122/what-is-the-cause-of-syntax-error-insert-finally-to-complete-trystatement
	        }
	        
	}
}
}

	        
	    