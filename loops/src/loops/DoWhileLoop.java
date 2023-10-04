package loops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		//* Do-While. Evalúa su expresión en la parte inferior del ciclo. POr lo tanto, las declaraciones dentro del bloque "do" siempre se ejecutan al menos una vez
		
		//Cuenta del 1 al 10
		int cuenta = 1;
		do {
			System.out.println(cuenta);
			cuenta++;
		}while(cuenta < 0);//Output: 1 (ya que se ejecuto al menos una vez)
		
		//Crear un programa para un cajero bancario
		// - El programa me mostrara 3 opciones:
		//1. Consultar saldo
		//2. Ingresar dineros
		//3. Retirar dineros
		//4. Salir
		// Mostrar mensaje de bienvenida al usuario, darle contexto y solicitar que elija una opcion (numero)
		// - Mostrar al usuario la opcion que eligio y permitir que elija otra opcion
		// - El usuario puede salir del programa escribiendo 4 (salir)
		
		
		System.out.println("Bienvenido al banco Generation, elige cualquiera de las opciones, para ello escribe el numero que corresponda:");
		System.out.println("1. Consultar saldo");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Retirar dineros");
		System.out.println("4. Salir");
		
		Scanner skner = new Scanner(System.in);
		int opcionSeleccionada = skner.nextInt();
		
		do {
		
		switch(opcionSeleccionada) {
		case 1:
			System.out.println("Consultar saldo");
			break;
		case 2:
			System.out.println("Ingresar dineros");
			break;
		case 3:
			System.out.println("Retirar dineros");
			break;
		case 4: 
			System.out.println("Salir");
			break;
			default:
				System.out.println("Elige una opcion valida");
				break;
		}
		}while(opcionSeleccionada != 4);
		
	
	}

}
