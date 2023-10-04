package logicOperators;

public class OperadoresLogicos {
	public static void main(String[] args) {
		/*
		 * -- Operadores aritmeticos (+, -, *, /, %)
		 * -- Operadores logicos. (AND, OR, NOT)
		 * -- Operadores relacionales (= , +=, -=, *=, /=, <, >, <=, >=)
		*/
		
		int num1 = 12;
		int num2 = 7;
		
		int resultado = num1 - num2;
		System.out.println(resultado);
		
		
		System.out.println(num1 >= num2);//True
		System.out.println(num1 <= num2);//False
		
		//Operadores logicos.
		//AND (&&)
		//OR (||)
		//NOT (!)
		
		int numeroUno = 5;
		int numeroDos = 7;
		
		boolean comparacionUno = numeroUno == numeroDos;
		System.out.println(comparacionUno);
		
		boolean comparacionDos = (numeroUno < numeroDos) && (numeroUno > numeroDos);
		System.out.println(comparacionDos);
		
		boolean comparacionTres = (numeroUno < numeroDos) || (numeroUno > numeroDos);
		System.out.println(comparacionTres);
		
		boolean comparacionCuatro = false;
		System.out.println(!comparacionCuatro);
		
		
		
		
	}

}
