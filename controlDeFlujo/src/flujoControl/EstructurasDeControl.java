package flujoControl;

public class EstructurasDeControl {
	public static void main(String[] args) {
		
		//Primero definir una variable del tipo String donde almaceno un dato 
		String citaProgramada = null; // Dejamos en Null y despues lo cambiamos a una fecha "28-09-23"
		//La variable declarada, se inicia en null a proposito para tener un espacio de memoria ya asignado y solo reemplazarlo con un nuevo dato.
		if (citaProgramada != null) {
			System.out.println("Ya hay una cita programada, una disculpa");//Por que la variable ya esta ocupada o llena
		} else {
			System.out.println("Puede registrar su cita");//Podemos registrar otra cita o una cita 
		}
		
		//Seleccionando una opcion y almacenando la variable opcion 
		int opcion = 1;
		
		//Creamos un menu
		System.out.println("Menu del dinte feliz Consultorio dental");
		System.out.println("1. Desea programar un cita?");
		System.out.println("2. Verificar una cita");
		System.out.println("3. Cancelar cita");
		System.out.println("4. Salir del menu");
		System.out.println("Seleccione una opcion del menu (1 - 4): ");
		
		switch (opcion) {
		case 1:
			System.out.println("Usted ha seleccionado la opcion programar cita.");// Agrega la logica para programar una cita 
			break;
		
		case 2: 
			System.out.println("Usted ha seleccionado la opcion verificar cita.");
			break;
			
		case 3: 
			System.out.println("Usted ha seleccionado la opcion de cancelar cita :c");
			break;
			
		case 4:
			System.out.println("Usted ha seleccionado la opcion salir del menu");
			break;
			
		default:
				System.out.println("La opcion que usted ha seleccionado no es valida. Porfavor, seleccione una opcion de nuestro menu (1-4).");
				break;
		}//fin del switch 
		
		
		
		
	}
}
