package Excepciones;

public class Ej3 {

	public static void main(String args[]) {
		A a = new A();
		try {
			a.bien();
		} catch (Ej2ex e) {
			e.imprimirmensaje();
		}
//		B b = new B();
//		try {
//			b.error();
//		} catch (Ej2ex e) {
//			e.imprimirmensaje();
//		}

	}

}

//class with a method that throws an exception of the type created in Exercise 2:

class A {

	public void bien() throws Ej2ex {
		throw new Ej2ex("Este m?todo no da error");
	}
}

//class B {
//	public void error() { // le faltar?a throws Ej2ex
//		throw new Ej2ex("Este m?todo da error");
//	}
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	Unreachable catch block for Ej2ex. This exception is never thrown from the try statement body
//
//	at Excepciones.Ej3.main(Ej3.java:15)
//}
