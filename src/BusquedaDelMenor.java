/*Búsqueda del menor. Hacer un programa que tome como entrada un número entero positivo N seguido de N
números y como salida muestre el menor de los números.
• Descripción de entrada: un número positivo entero N seguido de N números enteros.
• Descripción de salida: el menor de los N números le ́ıdos. Asumir que N no va a ser mayor a 100 y los N
números estarán entre -3000000000 y 3000000000.
• Ejemplo de entrada:
5 200 100 3000 656 98
• Ejemplo de salida:
98
• Ejemplo de entrada 2:
5 -9 -8 -6333333 -9 -2
• Ejemplo de salida 2:
-6333333
• Ejemplo de entrada 3:
1 3000000000
• Ejemplo de salida 3:
3000000000*/

import java.util.Scanner;

public class BusquedaDelMenor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long menor = sc.nextLong();
		
		for(int i = 1; i < N; i++) {
			
			long numeros = sc.nextLong();
			menor = Math.min(menor, numeros);
			
		}
		
		 System.out.println(menor);
		 sc.close();
		
	}

}
