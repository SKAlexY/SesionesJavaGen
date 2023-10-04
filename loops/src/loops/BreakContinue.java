package loops;

public class BreakContinue {

	public static void main(String[] args) {
		/*
		 * Sentencias utilizadas en loops:
		 *  -- break. Se utiliza para salir de un bucle en un punto especifico
		 *  -- continue. Interrumpe la iteracion de un bucle, si se produce una condicion especifica y continua con la siguiente
		*/
		
		//Super ozzito, va a realizar una rifa en la cual el cliente numero 5 se ganara una coca-cola de bolsita
		
		//con break finalizando 
		for (int cliente = 1; cliente <= 20; cliente++) {
			if(cliente == 5) {
				System.out.println("Cliente numero " + cliente + "¡Ganaste!");
				break;
			}System.out.println("Eres el cliente numero: " + cliente);
		}
		
		//con continue
		for (int cliente = 1; cliente <= 20; cliente++) {
			if(cliente == 5) {
				System.out.println("Cliente numero " + cliente + "¡Ganaste!");
				continue;
			}System.out.println("Eres el cliente numero: " + cliente);
		}

	}

}
