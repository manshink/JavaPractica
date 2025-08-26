/* 4. Análisis de coordenadas. Diseñar un programa que lea una secuencia de parejas de números (no se sabe
cuántas) hasta que le ingresen la pareja 0 0. El programa debe asumir que son coordenadas en el plano
cartesiano (coordenadas enteras, solo leerá enteros). Después de la lectura, el programa debe imprimir el par
ordenado más cercano al origen, el más lejano al origen y el promedio de las distancias al origen de todos los
puntos. Además, el programa debe mostrar un mensaje indicando si se ingresaron puntos sobre los ejes o no
(coordenada x=0 o y=0). Se puede asumir que en la entrada de datos no hay parejas ordenadas con la misma
distancia al origen. Se deben ignorar los puntos que están en el tercer cuadrante (x¡0 y y¡0).
• Descripción de entrada: parejas de números enteros hasta que se lea la pareja 0 0.
• Descripción de salida: XXXXX.
• Ejemplo de entrada:
5
63 65
1 1
5 5
2 3
20 20
• Ejemplo de salida:
Closest to origin: 1 1
Furthest to origin: 63 65
Average distance to origin: 26.179163951646263 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnalisisDeCoordenadas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Paso 1. Crear una lista para guardar los puntos validos
		
		List <int[]> puntos = new ArrayList<>(); 
		List <Double> distancias = new ArrayList<>();
		boolean hayEnEjes = false;
		
		while(true) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			//Condicion de parada
			if(x==0 && y==0) break;
			
			//Se ignora 3er cuadrante de plano carteciano
			if(x < 0 && y<0) continue;
			
			//calculo la distancia
			double distancia = Math.sqrt(x * x + y * y);
			
			//guardo puntos y distancia
			puntos.add(new int[] {x, y});
			distancias.add(distancia);
			
			//verificar si hay 0's en los ejes
			if(x==0 || y==0) {
				hayEnEjes = true;
			}
			
		}
		
		//Esta vacio?
		if (puntos.isEmpty()) {
			System.out.println("No valid points entered");
		    sc.close();
		    return;

		}
		
        // encontrar más cercano y lejano
		int idxMax=0, idxMin=0;
		for(int i = 1; i < distancias.size(); i++) {
			
			if(distancias.get(i) < distancias.get(idxMin))idxMin = i;
			if(distancias.get(i) > distancias.get(idxMax))idxMax = i;
		}
		
		//calculamos el promedio
		double suma = 0;
		for(double d : distancias) {
			suma += d;
		}
		
		double promedio = suma / distancias.size();
		
		// salida
		
		System.out.println("Closest to origin: " + puntos.get(idxMin)[0] + " " + puntos.get(idxMin)[1]);
		System.out.println("Furthest to origin: " + puntos.get(idxMax)[0] + " " + puntos.get(idxMax)[1]);
		System.out.println("Average distance to origin: " + promedio);

		if (hayEnEjes) {
		    System.out.println("There are points on axes");
		} else {
		    System.out.println("No points on axes");
		}

		sc.close();

		
	}
	
	

}
