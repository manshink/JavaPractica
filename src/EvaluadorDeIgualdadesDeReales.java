/* Evaluador de igualdad de reales.
En muchas ocasiones se deben comparar números reales (double o float) para determinar igualdad. La manera
correcta de hacerlo es establecer (o recibir) una tolerancia, que es generalmente un valor muy pequeño de
diferencia permitida. Con base en esa tolerancia, hay que decidir si los números son iguales o no. Esto porque,
en algunos ámbitos, los números 3 y 2.999999999 deben ser considerados iguales; por ejemplo, si son
magnitudes en pesos y se trata del sistema contable de un banco. Pero si los mismos dos números son
magnitudes en metros, de valores de un sistema de información de elementos de magnitudes nanoscópicas,
seguramente no deban considerarse iguales. En este problema se debe hacer un programa que reciba 3
números; los dos primeros son los números reales a comparar y el último es la tolerancia dada. Los números se
consideran iguales si su diferencia es máximo la tolerancia dada, pero no la sobrepasa.
• Descripción de entrada: tres números reales; el último de ellos será positivo con toda seguridad.
• Descripción de salida: equals si los dos primeros números son iguales según la tolerancia dada; not equals
si no lo son.
• Ejemplo de entrada:
2.999 3 0.00000001
• Ejemplo de salida:
equals

26 POLITECNICO GRANCOLOMBIANO  ́

• Ejemplo de entrada 2:
3 2.999 0.00000001
• Ejemplo de salida 2:
equals
• Ejemplo de entrada 3:
2.999 3 0.01
• Ejemplo de salida 3:
not equals
• Ejemplo de entrada 4:
3 2.999 0.01
• Ejemplo de salida 4:
not equals*/

import java.util.Scanner;

public class EvaluadorDeIgualdadesDeReales {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double tolerancia = sc.nextDouble();
		double diferencia = Math.abs(a - b);
		
		if(diferencia <= tolerancia) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");

		}
		sc.close();
		
		
	}

}
