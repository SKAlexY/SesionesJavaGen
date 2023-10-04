package loops;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		//1.
		Scanner scanner = new Scanner(System.in);
		//2.
		System.out.println("Escribe un numero que servira como numero final de una cuenta");
		//3.
		int numFinal = scanner.nextInt();
		//4.
		int numInicial = 1;
		//5.
		while (numInicial <= numFinal) {
			System.out.println("La cuenta va en: " + numInicial);
			numInicial++;
		}
		scanner.close();
	}

}
