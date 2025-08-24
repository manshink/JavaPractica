/* Programa que prueba si un valor es raíz de un polinomio de grado dos.
• Descripción de entrada: 4 valores enteros; los primeros 3 serán los coeficientes del polinomio ax2+bx+c =
0, en el orden en que aparecen. El cuarto valor será el número x (otro entero) para validar si es o no raíz.
Si efectivamente una lo es, debe mostrar en la salida estándar root!; de lo contrario, sale not root!. El
programa no puede usar condicionales (if) ni ciclos, ni funciones. Recomendación: usar el if ternario (?:).
• Descripción de salida: root o not root! según el caso.
• Ejemplo de entrada:
1 -5 6 3
• Ejemplo de salida:
root!
• Ejemplo de entrada 2:
1 -5 6 2
• Ejemplo de salida 2:
root!
• Ejemplo de entrada 3:
1 -5 6 7
• Ejemplo de salida 3:
not */

import java.util.Scanner;

public class RaizPolinomioGradoDos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		
		int resultado = a*x*x + b*x + c;
		
		System.out.println(resultado == 0 ? "root!" : "not root!");
		
		sc.close();
	}

}
