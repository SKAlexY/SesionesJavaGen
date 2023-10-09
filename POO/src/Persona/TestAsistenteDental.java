package Persona;

public class TestAsistenteDental {
	public static void main(String[] args) {
		
		//Instancia de nuestro asistente
		
		AsistenteDental Francisca = new AsistenteDental("05/10/2023", 875.40d);
		
		//impresion de la informacion de nuestro asistente 
		Francisca.mostrarDatosAsistente();
		
		//El sueldo de Francisca no es de 875.4, es de 87.54
		//Cambio de sueldo
		//Francisca.salario = 87.54d;
		
		//Mostrar solo el sueldo (antes de getter)
		//System.out.println(Francisca.salario);
		
		//Mostrar el sueldo (despues del getter)
		System.out.println(Francisca.getsalario());
		
		//Modificar salario con setter
		Francisca.setsalario(30.00); //no cumple la condicion
		
		
		//Imprimir el nuevo salario de Francisca
		System.out.println(Francisca.getsalario());
		
		
		
	}//metodo main

}
