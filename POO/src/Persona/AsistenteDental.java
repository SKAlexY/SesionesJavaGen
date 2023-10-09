package Persona;

public class AsistenteDental {
	//1 Atributos
	private String fechaIngreso;
	private double salario;
	
	//2 Contructor publico (Dejo el contstructor publico para poder acceder a el de forma sencilla)
	public AsistenteDental (String fechaIngreso, double salario) {
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}//cosntructor
	
	//3 Metodos
	
	//Metodo para imprimir informacion
	public void mostrarDatosAsistente() {
		System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
		System.out.println("El salario del asistente es: " + salario);
	}//metodo imprimir informacion
	
	//Getters y setters para poder acceder a mis datos privados y poder realizar operaciones con ellos 
	//Sin getters, la informacion me aparece en null
	//Sin setters, no puedo cambiar la informacion 
	
	//Este getter permite retornar el dato de la fecha de ingreso en formato String
	public String getfechaIngreso() {
		return fechaIngreso;
	}//getter
	
	//getter para salario
	public double getsalario() {
		return salario;
	}//get salario
	
	
	//setter para salario (modificar los datos)
	public void setsalario(double nuevoSalario) {
		if (nuevoSalario > 0 && nuevoSalario < 100) {
			salario = nuevoSalario;
		}//cierre if
	}//cierre setter
	
	
	
	
	
	
	
	
	
}//cierre AsistenteDental
