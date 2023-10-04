package flujoControl;

import java.util.Scanner;

public class Ejercicios {
	public static void main(String[] args) {
		/*
		 * Condicion para determinar si el paciente es o no mayor de edad
         */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe tu edad");
		int edad = scanner.nextInt();
		scanner.close();
		
		
		//int edad = 18;
		
		if(edad >= 18) {
			System.out.println("Felicidades, ya no necesitas que tu mama te acompañe a hacer el tramite");
		}else {
			System.out.println("Dile a tu mama que venga");
		}
		
		String resultado = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
		System.out.println(resultado);
		
		
		boolean pago = false;
		String resultado2 = (pago) ? "ya pago" : "no pago";
		System.out.println("El paciente " + resultado2);
				
	}

}
