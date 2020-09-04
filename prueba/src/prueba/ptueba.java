package prueba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import prueba.clases.*;

public class ptueba {

	public static void main(String[] args) {
				
		
		int carga_equipaje = 0, total_maletas = 0;
		int nveces = 0;
		ArrayList<Maletas> maletas = new ArrayList<>();
		List<Integer> pesos = new ArrayList<>();
		
		System.out.println("********* Registro de usuarios para ingreso al vuelo ***********\n");
		System.out.println("Ingrese la cantidad de pasajeros a registrar: ");
		Scanner scanner = new Scanner(System.in);
		nveces = scanner.nextInt();
		
		while (nveces == 0) {
			System.out.println("Valor no permitido, ingrese un valor valido");
			nveces = scanner.nextInt();
		}
		
		for (int i = 0; i < nveces; i++) { 						
			Scanner Teclado = new Scanner(System.in);
			System.out.println("Ingrese nombres y apellidos del viajero:");
			String nombres = Teclado.nextLine();
								
			System.out.println("Ingrese cantidad de maletas a subir por viajero:");									
			int cantidadMaletas = Teclado.nextInt();	
						
			System.out.println("Ingrese peso total de maletas a subir por viajero:");									
			int pesoMaleta = Teclado.nextInt();		
			
			if (cantidadMaletas == 0) {
				System.out.println("Valor no permitido, debe ser mayor a 1.");
				System.out.println("Cerrando Sistema");
				break;
			} else {
				total_maletas += cantidadMaletas;
			}
			
			if (pesoMaleta >= 500) {
				System.out.println("Valor no permitido, debe ser menor a 500 kg");
				System.out.println("Cerrando Sistema");
				break;
			} else {
				int valor = 0;
				carga_equipaje += pesoMaleta;
				
				if (pesoMaleta >= 0 && pesoMaleta <= 25) {
					valor = 0;
				} else if (pesoMaleta >= 26 && pesoMaleta <= 300) {
					valor = 1500;
				} else if (pesoMaleta >= 301 && pesoMaleta <= 5000) {
					valor = 2500;
				}
				
				System.out.println("Sr@ " + nombres + " el coste de su peso de Maleta es: " + valor);
				
				Maletas maleta = new Maletas(pesoMaleta, (double) valor, nombres);
				maletas.add(maleta);				
				pesos.add(pesoMaleta);
			}
			
			if(carga_equipaje >= 18000) {
				System.out.println("Valor no permitido, la sumatoria total no puede exceder los 18000 kg");
				System.out.println("Cerrando Sistema");
				maletas.clear();
				break;
			}														
		}	
		
		System.out.println("Cantidad de maletas en el vuelo: " + total_maletas);				
		
		Collections.sort(pesos);
		int maximo_peso = Collections.max(pesos);
		int peso_minimo = Collections.min(pesos);
		
		System.out.println("Peso maximo " + maximo_peso + " kg, peso minimo " + peso_minimo + " kg");
		
		int cantidad_bultos = carga_equipaje / nveces;
		System.out.println("Promedio total de maletas: " + cantidad_bultos + " kg");	
		
		// (1500 / 0,00027) Conversión a dolares donde 1500 es el valor en pesos colombianos
	}

}
