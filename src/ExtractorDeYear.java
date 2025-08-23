/* Programa extractor de año a partir de la tarjeta de identidad.
El programa debe producir un número entero indicando el año que está en el número leído, asumiendo que
tiene el formato de una tarjeta de identidad.
• Descripción de entrada: un número entero positivo de exactamente 11 dígitos, en el cual el dígito más
significativo (más hacia la izquierda) no es 0.
• Descripción de salida: un número entero según lo solicitado en el enunciado.
• Ejemplo de entrada:
86021912345
• Ejemplo de salida:
86 */

import java.util.Scanner;

public class ExtractorDeYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su tarjeta de identidad: ");
		String numero = sc.nextLine();
		String primerosDos = numero.substring(0, 2);
		System.out.println("el año de su tarjeta de identidad es " + primerosDos);
		
		
		
	}

}
