/*Has una clase llamada Persona que siga las siguiente condiciones:
 * - Sus atributos son: nombre, edad, DNI, sexo (H hombre, Mmujer), peso y altura. 
 * No queremos que se accedan directamente a ellos. Piensa que modificador de 
 * acceso es más adecuado, también su tipo. Si quieres añadir algún atributo 
 * puedes hacerlo.
 * - Por defecto, todos los atributos menos el DNI serán valores por defecto según
 *  su tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por 
 *  defecto, usa una constante para ello.
 *  - Se implantaran varios constructores:
 *  	- Un constructor por defecto.
 *  	- Un constructor con el nombre, edad y sexo, el resto por defecto.
 *  	- Un constructor con todos atributos como parámetro.*/

public class Ejercicio1App {

	public static void main(String[] args) {
		
		
		//Utilizamos los 3 tipos de constructores para crear estudiantes
		Persona estudiante1 = new Persona();

		Persona estudiante2 = new Persona("Paula", 39, 'M');

		Persona estudiante3 = new Persona("Antonio", 40, "45678890P", 'H', 80.5, 1.85);

		//Hacemos prueba para ver los valores que salen por defecto
		System.out.println(estudiante1.getEdad());
		System.out.println(estudiante2.getEdad());
		System.out.println(estudiante2.getDni());
		System.out.println(estudiante3.getDni());

		// Comparación de mismos datos en distintos estudiantes
		System.out.println("El DNI de " + estudiante1.getNombre() + " es " + estudiante1.getDni() + ".");
		System.out.println("El DNI de " + estudiante2.getNombre() + " es " + estudiante2.getDni() + ".");
		System.out.println("El DNI de " + estudiante3.getNombre() + " es " + estudiante3.getDni() + ".");
	}

}
