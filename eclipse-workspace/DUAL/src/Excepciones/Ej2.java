package Excepciones;



public class Ej2 {
	public static void main(String args[]) {
	 try {
	 throw new Ej2ex("Este es el mensaje");
	 } catch(Ej2ex e) {
	 e.imprimirmensaje();
	 }
	}
}
	 
class Ej2ex extends Exception {
	
	String mensaje;

	public Ej2ex(String mensaje) {
		this.mensaje = mensaje;
	}

	public void imprimirmensaje() {
		System.out.println("Mi mensaje de excepcion: " + mensaje);
	}
}