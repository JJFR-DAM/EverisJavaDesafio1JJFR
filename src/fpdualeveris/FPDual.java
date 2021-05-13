package fpdualeveris;

import variables.Developer;

public class FPDual {

	public static void main(String[] args) {
		
		variablesChallenge();

	}
	
	/*
	 * Método que usaremos para introducir un grupo de 4 nuevos programadores a la plantilla.
	 */
	
	private static void variablesChallenge() {
		
		//Creando los desarrolladores:
		
		Developer d1 = new Developer("Joaquin");
		Developer d2 = new Developer("Tomás");
		Developer d3 = new Developer("Anastasia");
		Developer d4 = new Developer("Macarena");
		
		//Nombre de la empresa: 
		
		System.out.println("Todos los trabajadores pertenecen a \""+Developer.empresa+"\"\n");
		
		//Número de empleados totales:
		
		System.out.println("El primer desarrollador de la cuadrilla es el numero: "+d1.id+".");
		System.out.println("El cuarto desarrollador de la cuadrilla es el numero: "+d4.id+".\n");
		
		//Número de empleado:
		
		System.out.println(d1.nombre+" tiene id = "+d1.id+".");
		System.out.println(d2.nombre+" tiene id = "+d2.id+".");
		System.out.println(d3.nombre+" tiene id = "+d3.id+".");
		System.out.println(d4.nombre+" tiene id = "+d4.id+".\n");
		
		//Se le descontarán 2 días de vacaciones al segundo programador:
		
		d2.setVacaciones(d2.getVacaciones()-2);
		
		//Aprovechamos para 
		
		System.out.println(d1.nombre+" tiene "+d1.vacaciones+" días de vacaciones.");
		System.out.println(d2.nombre+" tiene "+d2.vacaciones+" días de vacaciones.");
		System.out.println(d3.nombre+" tiene "+d3.vacaciones+" días de vacaciones.");
		System.out.println(d4.nombre+" tiene "+d4.vacaciones+" días de vacaciones.");
	}
}
