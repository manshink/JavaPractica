/* Solucionar una ecuación cuadrática.
• Descripción de entrada: 3 valores enteros, que serán los coeficientes del polinomio ax2 + bx + c = 0, en
el orden en que aparecen.
• Descripción de salida: la salida deben ser dos números reales, las dos soluciones a la ecuación cuadrática
(Wikipedia, 2018). Se debe asumir que los valores existen. Usar el método en la clase Math para cálculo de
raíces: Math.sqrt(). En la salida debe estar primero la menor raíz. Nota: no usar condicionales (if).

27 POLITECNICO GRANCOLOMBIANO  ́

• Ejemplo de entrada:
1 -5 6
• Ejemplo de salida:
2 3 */

import java.util.Scanner;

public class EcuacionCuadratica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double discriminante = b*b - 4*a*c;
		
		double x1 = (-b + Math.sqrt(discriminante)) / 2*a ;
		double x2 = (-b - Math.sqrt(discriminante)) / 2*a ;
		
		System.out.println(Math.min(x1, x2) + " " + Math.max(x1, x2));
		
		sc.close();
	}

}
