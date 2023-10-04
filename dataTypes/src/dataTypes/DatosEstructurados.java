package dataTypes;

public class DatosEstructurados {

	public static void main(String[] args) {
		
		/* 
		 Datos estructurados:
		 
		 Son datos complejos que almacenan caracteres y/o
		 cadenas de caracteres, o bien, algún tipo de dato
		 primitivo
		 
		 	- String: Cadena de caracteres, se declaran entre
		 	comillas y hay que definir el tipo de dato con la
		 	palabra reservada String.
		 	Los Strings en Java se consideran Objetos
		 	
		 	- Arrays
		 	
		 	
		 	- Creados por el usuario (API JAVA)
		 	
		 	
		*/
		
		String myString = "Hola, soy un String";
		System.out.println(myString);
		
		String helloString = new String("Hola, soy un segundo String");
		System.out.println(helloString);
		
		/*
		 * Métodos para String
		   - String length: Método que permite medir la
		   longitud de una cadena de caracteres
		  
		 */
		
		String texto = "AsJgjnoLÑq";
		// String.length. Método que permite medir la longitud de una cadena de caracteres
		System.out.println("La longitud de la variable texto de tipo String es: " + texto.length());
		
		/*
		 Guardando la variable texto en una nueva variable
		 de tipo int para pasarle el método length
		 int metodoLength = texto.length();
		  -- Output: 10
		  Imprimimos en consola la nueva variable
		  System.out.println(metodoLength);
		 */
		
		
		// -- Sttring: toUpperCase() y toLowerCase()
		String upperCase = texto.toUpperCase();
		System.out.println("Aplicando el método toUpperCase: " +  upperCase);
		
		String lowerCase = texto.toLowerCase();
		System.out.println("Aplicando el método toLowerCase: " +  lowerCase);
		
		//-- indexOf(). Devuelve el indice de la primera aparicion de un texto especifico
		String fraseMotivacional = "Todo es temporal, echale ganitas";
		int indexOf = fraseMotivacional.indexOf("temporal");//8
		System.out.println("La palabra 'temporal' inicial en el indice: " + indexOf);
		
		//-- Concatencion
		String firstName = "Daniel";
		String lastName = "Maldonado";
		
		String userName = firstName + " " + lastName;
		System.out.println(userName);
		
		System.out.println(firstName.concat(lastName));
		
		//-- Metodos de conversion
		String presupuesto = "50000";
		System.out.println("El presupuesto es de $" + presupuesto + " y el tipo de dato es " + presupuesto.getClass().getSimpleName());
		
		int parseao = Integer.parseInt(presupuesto);
		System.out.println("Aplicando parseInt, el valor de " + presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + parseao + " que ahora es de tipo " + ((Object)parseao).getClass().getSimpleName());                           
		
		//Arrays. conocidos arreglo, se trata de una coleccion de datos del mismo tipo deonde cada elemento corresponde a una
		//posicion identificada por indices numericos. Cuando trabajamos con arreglos de dos dimensiones (bidimensionales), usamos el termino matriz
		
		String[] cars = {"Volkswagen", "Mazda", "Kia", "Ford"};
		System.out.println(cars);
		
		/*
		 * Variables por tipo de daclaracion
		 * -- Variables dinamicas. Son aquellas que se declaran con un valor pero que dicho valor puede cambiar durante el proceso.
		 * -- Variables constantes o finales. Su valor no puede modificarse.
		 * -- Variables literales (palabras reservadas). Su identificador es la representacion de su valor y ya tiene un significado en el codigo fuentede java
		*/
		//Variables dinamicas
		float gastosMensuales = 35684.30f;
		System.out.println(gastosMensuales);
		
		gastosMensuales = 42699.2f;
		System.out.println("Ahora mis gastos mensuales ascienden a " + gastosMensuales);
		
		//Variables finales o constantes
		final int salario = 15000;
		System.out.println(salario);
		
		//salario = 17000

		
		

	}//main

}//class
