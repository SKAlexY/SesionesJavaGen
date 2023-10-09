package Persona;

public class Usuario {
	//Atributos
	private String rol;
	private String username;
	private String password;
	
	//Crear un nuevo usuario (constructor)
	public Usuario(String rol, String username, String password) {
		this.rol = rol;
		this.username = username;
		this.password = password;
	}
	
	//Recuperar contraseña (getter)
	/*public String getpassword(String usernameAValidar) {
		//Si el usuario registrado coincide con el usuario que paso como parametro, entonces obtengo la contraseña
		if (usernameAValidar == username) {
			return password;
		}else {
			System.out.println("Usuario es incorrecto");
		}
	}*/
	
	//Recuperar contraseña (getter)
	public String getpassword(String usernameAValidar) {
		return password;
	}
	
	
	//Cambiar contraseña(setter)
	public void setpassword(String nuevaContraseña) {
		//si la nueva contraseña es diferente a una cadena vacia y es diferente a la contraseña anterior...
		if (nuevaContraseña != "" && nuevaContraseña != password) {
			password = nuevaContraseña;
		}else {
			System.out.println("Lo siento, no puedo cambiar la contraseña");
		}
	}
	
	//Cambiar la contraseña de un abjeto del tipo usuario 
	
	//Felipe.setPassword (una donde la contraseña este vacia)
	//Felipe.setPassword (una donde la constraseña no este vacia pero sea igual a la anterior)
	//Felipe.setPassword (se cumplan las dos condiciones)
}
