package Persona;

public class Dentista extends Persona {
	
	//1 Atributos 
	// ya no creo valores como nombre, edad, apellido, etc., porque estos valores los voy a heredar de la clase persona
	
	String especialidades;
	String cedula;
	String consultorioAsignado;
	String experiencia;
	String turno;
	int salario;
	
	//2 Contructor
	public Dentista(String nombre, String apellido, byte edad, String telefono, String email, String especialidades,
			String cedula, String consultorioAsignado, String experiencia, String turno, int salario) {
		super(nombre, apellido, edad, telefono, email);//informacion de la clase persona
		//informacion de la clase paciente 
		this.especialidades = especialidades;
		this.cedula = cedula;
		this.consultorioAsignado = consultorioAsignado;
		this.experiencia = experiencia;
		this.turno = turno;
		this.salario = salario;
		}//constructorDentista con informacion heredada
	
	//3 Metodo (Metodo para calcular salario basado en la experiencia)
	//Experiencia = basico, intermedio, avanzado
	//Si el dentista esta en rango basico, gana 30,000; si es intermedio, gana 40,000; si es avanzado gana 50,000
	
	void calcularSalario () {
		//Logica de programacion
		if (experiencia.equals("basico")) {
			salario = 30000;
		}else if (experiencia.equals("intermedio")){
			salario = 40000;
		}else if (experiencia.equals("avanzado")) {
			salario = 50000;
		}
	}//cierre calcularSalario
	
	void imprimirInfoDentista() {
		System.out.println("La especialidad: " + especialidades);
		System.out.println("El salario es: " + salario);
	}//cierre imprimirInfoDentista
	
	

}//cierre de dentista
