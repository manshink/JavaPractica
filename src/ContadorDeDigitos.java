/*Contador de dígitos. Hacer un programa que cuente la cantidad de dígitos de un número.
• Descripción de entrada: un número entero entre -3000000000 y 3000000000.
• Descripción de salida: un entero positivo indicando la cantidad de dígitos del número leído.
• Ejemplo de entrada:
0
• Ejemplo de salida:
1
• Ejemplo de entrada 2:
123456

• Ejemplo de salida 2:
6
• Ejemplo de entrada 3:
-98746
• Ejemplo de salida 3:
5
• Ejemplo de entrada 4:
2999999999
• Ejemplo de salida 4:
10*/

import java.util.Scanner;

public class ContadorDeDigitos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long number = sc.nextLong();
		number = Math.abs(number);
		
		if(number == 0) {
			System.out.println(1);
		} else {
			
			int contador = 0;
			while(number > 0) {
				
				number /= 10;
				contador++;
				
			}
			
			System.out.println(contador);
			
		}
		sc.close();
	}
}
