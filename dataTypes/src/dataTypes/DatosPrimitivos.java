package dataTypes;

public class DatosPrimitivos {
	public static void main(String[] args) {
		System.out.println("jelou");
		/*
		 * Datos primitivos. Datos fundamentales en java que sirven para gestionar los tipos de informacion mas basicos
		 * Existen 8 tipos de datos primitivos: byte, short, int, logn, float, bouble, boolean, char*/
		
		byte age = 28;
		System.out.println(age); //syso + ctrl + space
		
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		System.out.println("El valor minimo de Byte es: " + minByte);
		System.out.println("El valor maximo de Byte es: " + maxByte);
		
		//Short. valor min y valor max
		short maxShort = Short.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		System.out.println("El valor minimo de Short es: " + minShort);
		System.out.println("El valor maximo de Short es: " + maxShort);
		
		int minInt = Integer.MAX_VALUE;
		int maxInt = Integer.MIN_VALUE;
		System.out.println("Wl malor minimo de Int es: " + minInt);
		System.out.println("El valor maximo de Int es: " + maxInt);
		
		//Char valor min y valor max
		char maxChar = Character.MAX_VALUE;
		char minChar = Character.MIN_VALUE;
		System.out.println("El valor minimo de Char es: " + minChar);
		System.out.println("El valor maximo de Char es: " + maxChar);
			
		long maxLong = Long.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		System.out.println("El valor minimo de Long es: " + minLong);
		System.out.println("El valor maximo de Long es: " + maxLong);
		
		float maxFloat = Float.MAX_VALUE;
		float minFloat = Float.MIN_VALUE;
		System.out.println("El valor minimo de float es: " + minFloat);
		System.out.println("El valor maximo de float es: " + maxFloat);
		
		double maxDouble = Double.MAX_VALUE;
		double minDouble = Double.MIN_VALUE;
		System.out.println("El valor minimo de double es: " + minDouble);
		System.out.println("El valor maximo de double es: " + maxDouble);
		
		char valorChar1 = 64;
		char valorChar2 = 60;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		/* Casteo ( Conversion de tipos en Java).
		   -- Automatico (dato mas pequeño a un dato más grande)
		   -- Manual (tipop de dato más grande a tipo de dato más pequeño)
		    */
		
		int myNumber = 125;
		System.out.println(myNumber);
		
		double myCasting = myNumber;
		System.out.println(myCasting);
		
		short edad = 25;
		int valorEdad = edad;
		System.out.println(edad);
		System.out.println(valorEdad);
		
		//Manual
		int myNewCasting = (int) myCasting;
		System.out.println(myNewCasting);
		
		//Convertir de float a int
		float myFloat = 1.99f;
		System.out.println(myFloat);
		//Conversion
		int myNewFloat = (int) myFloat;
		System.out.println(myNewFloat);
		
		//Convertir de char a int
		char myChar = 'M';
		int myNewChar = myChar;
		System.out.println(myNewChar);
	}
}
