/*1. Par o impar.
Diseñar un programa que tome como entrada un número entero y muestre en la salida even si el número es
par, y odd si es impar. No usar condicionales.
• Descripción de entrada: un número entero.
• Descripción de salida: odd o even, según sea el caso.
• Ejemplo de entrada:
126
• Ejemplo de salida:
even */

import java.util.Scanner;

public class parOImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String[] resultado = {"even", "odd"};
		System.out.println(resultado[number % 2]);
	}
}
