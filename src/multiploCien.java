/*Múltiplo de 100.
Diseñar un programa que tome como entrada un número entero y diga si es múltiplo de 100 o no.
• Descripción de entrada: Un número entero.
• Descripción de salida: multiple of 100 o not multiple of 100, según sea el caso.
• Ejemplo de entrada:
12600
• Ejemplo de salida:
multiple of 100 */

import java.util.Scanner;

public class multiploCien {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String[] resultado = {"multiple of 100", "not multiple of 100"};
		System.out.println(resultado[(number % 100 == 0) ? 0 : 1]);
		sc.close();
	}

}
