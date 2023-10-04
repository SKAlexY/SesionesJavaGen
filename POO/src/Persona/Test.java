package Persona;

public class Test {
	public static void main(String[] args) {
		
		//4 Instancia persona
		Persona Felipe = new Persona("Felipe", "Maqueda", (byte)31, "55987654321", "felipe@gmail.com");
		
		/*
		System.out.println(Felipe);//imprime lugar memoria
		Felipe.imprimirInfo();//imprime informacion
		Felipe.saludar();//imprime saludo
		
		//4 instancia de dentista
		Dentista Simi = new Dentista("Dr.simi", "Lares", (byte)50, "12345678", "simi@lares.com", "odontologia", "55555555", "500", "avanzado", "matutino", 500);
		System.out.println("******************************");
		Simi.calcularSalario();
		Simi.imprimirInfoDentista();
		
		
		//Instancia de Paciente con todos los datos
		Paciente Chencho = new Paciente ("CHNCH1234", "RH Positivo", true, true, "05/Oct/2023", "Doc. Simi Lares", false);
		
		System.out.println("************************");
		System.out.println(Chencho);  */
		
		
		//Instancia de Paciente con datos obligatorios
		Paciente Masiosare = new Paciente("MAS12345", false, false);
		System.out.println("************************");
		System.out.println(Masiosare);	
		
		//Cambiar el falso de seguro medico a true 
		Masiosare.seguroGastosMedicos = true;
		System.out.println("*****************");
		System.out.println(Masiosare);
		
	}//cierre metodo main

}//cierre class persona
