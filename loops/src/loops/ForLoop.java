package loops;

public class ForLoop {
	public static void main(String[] args) {
		//El ciclo for proporciona una forma compacta de iterar sobre valores.
		//for (inicializacion; condicion; contador (incremento/decremento){
		//bloque de 
		//}
		//for con variable local
		for (int numero = 1; numero <= 10; numero++) {
			System.out.println("Numero igual a " + numero);
		}
		
		//for con variable global
		int contador = 1;
		for (contador = 1 ; contador <= 5; contador++) {
			System.out.println(contador);
		}
		
		/*
		 * Bucles anidados. Cucle dentro de otro bucle
		 */
		//Imprimir una forma triangular de asteriscos
		int filas = 5;
		
		for (int i = 0; i < filas; i++) {
			//bloque de codigo que va a iterar sobre el primer bucle
			for (int j = 0; j <= i; j++);{
				System.out.println("*");
			}
			System.out.println();
			
			//Java API - Math
			//
		}
	}

}
