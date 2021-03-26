package ejercicios;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		String p;
		System.out.println("Por favor introduzca una palabra, no debe contener números:");
		p = scan.nextLine();
		int n=0;
		while (n!=1) {
		if (p.matches(".*\\d.*")) {
			System.out.println("El parámetro introducido contiene números, por favor pruebe de nuevo:");
			p = scan.nextLine();
		} else {
			System.out.println("¡Bien hecho! \n" + "Hola " + p);
			n=1;
		}
		scan.close();
	}
	}

}
