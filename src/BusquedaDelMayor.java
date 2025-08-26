/*Búsqueda del mayor. Hacer un programa que tome como entrada un número entero positivo N seguido de N
números y como salida muestre el mayor de los números.
• Descripción de entrada: un número positivo entero N seguido de N números enteros.
• Descripción de salida: el mayor de los N números leídos. Asumir que N no va a ser mayor a 100 y los N
números todos estarán entre -3000000000 y 3000000000.
• Ejemplo de entrada:
5 200 100 3000 656 98
• Ejemplo de salida:
3000
• Ejemplo de entrada:
5 -9 -8 -6333333 -9 -2
• Ejemplo de salida:
-2
• Ejemplo de entrada:
1 -3000000000
• Ejemplo de salida:
-3000000000*/

import java.util.Scanner;

public class BusquedaDelMayor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long mayor = sc.nextLong();
		
		for (int i = 1; i < N; i++) {
			
			long num = sc.nextLong();
			mayor = Math.max(mayor, num);
			
		}
		
		System.out.println(mayor);
		sc.close();
		
	}

}
