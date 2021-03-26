package Excepciones;

public class Ej1 {
	public static void main(String args[]) {
		try {
			throw new Exception("Mi excepcion"); //Le damos al constructor un String argument
		} catch (Exception e) {
			System.out.println("Printing the String argument: " + e.getMessage());//Imprimimos el String argument en el catch
		} finally {
			System.out.println("¡Hemos llegado a la finally clause!");
		}
	}
}
