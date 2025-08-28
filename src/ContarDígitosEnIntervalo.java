/* Contar dígitos en intervalo. Dados dos números A y B, diseñar e implementar un programa que cuente la
cantidad de veces que se escribiría cada dígito si se escribieran todos los números entre A y B.
• Description de entrada: two integers A and B. Both between -1000 y 1000.
• Descripción de Salida: Un mensaje por cada d ́ıgito entre 0 y 9 indicando cuántas veces se imprimir ́ıa.
• Ejemplo de entrada:
-1 1
• Ejemplo de salida:
Digit 0 is printed 1 times.
Digit 1 is printed 2 times.
Digit 2 is printed 0 times.
Digit 3 is printed 0 times.
Digit 4 is printed 0 times.
Digit 5 is printed 0 times.
Digit 6 is printed 0 times.
Digit 7 is printed 0 times.
Digit 8 is printed 0 times.
Digit 9 is printed 0 times.
• Ejemplo de entrada 2:
654 123
• Ejemplo de salida 2:
Digit 0 is printed 103 times.
Digit 1 is printed 180 times.
Digit 2 is printed 210 times.
Digit 3 is printed 214 times.
Digit 4 is printed 214 times.
Digit 5 is printed 208 times.Digit 6 is printed 158 times.
Digit 7 is printed 103 times.
Digit 8 is printed 103 times.
Digit 9 is printed 03 times. */

import java.util.Scanner;

public class ContarDígitosEnIntervalo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int inicio = Math.min(A, B);
		int fin = Math.max(A, B);
		int[] contador = new int[10];
		
		for (int i = inicio; i <= fin; i++ ) {
			String numString = String.valueOf(Math.abs(i));
			for(char c : numString.toCharArray()) {
				int digito = c - '0';
				contador[digito]++;
			}
			
		}
		for (int d = 0; d < 10; d++ ) {
			System.out.println("Digit " + d + " is printed " + contador[d] + " times.");
		}

	}

}
