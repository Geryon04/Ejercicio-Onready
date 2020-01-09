package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concesionaria {
	
	//Listado de vehiculos
	private List<IVehiculo> listaVehiculos;
	
	public Concesionaria() {
		listaVehiculos = new ArrayList<IVehiculo>();
	}
	
	// Metodo que agrega vehiculos a la lista
	public void agregarVehiculo(IVehiculo vehiculo) {
		listaVehiculos.add(vehiculo);
	}
	
	//Metodo que imprime los vehiculos de la lista
	public void imprimirVehiculo() {
		for(IVehiculo v : listaVehiculos) {
			System.out.println(v.toString());
		}
	}
	
	//Metodo que busca el vehiculo mas caro de la lista
	public void vehiculoMasCaro() {
		int k = 0;
		IVehiculo aux = listaVehiculos.get(k);	
		for(IVehiculo j : listaVehiculos) {
			if(j.precio > aux.precio) {
				aux = j;
				k++;
			}
		}
		System.out.println( "Vehiculo mas caro:" + aux.marca + " "+ aux.modelo);
	}
	
	//Metodo que busca el vehiculo mas barato de la lista
	public void vehiculoMasBarato() {
		int k = 0;
		IVehiculo aux = listaVehiculos.get(k);		
		for(IVehiculo j : listaVehiculos) {
			if(j.precio < aux.precio) {
				aux = j;
				k++;
			}
		}		
		System.out.println("Vehiculo mas barato:" + aux.marca + " "+ aux.modelo);
	}
	
	//Metodo que busca en la lista el vehiculo cuyo modelo tiene una letra especifica
	public void vehiculoContieneLetra(char a) {
		int k = 0;		
		IVehiculo aux = listaVehiculos.get(k);		
		for(IVehiculo j : listaVehiculos) {
			for(char i : j.modelo.toCharArray()) {
				if(a == i) {
					aux = j;					
				}
			}
		}
		System.out.println( "Vehiculo que contiene en el modelo la letra " + a +":"+ " " + aux.marca + " " + aux.modelo+ " "+ aux.precio);
	}
	
	//Metodo que ordena los vehiculos segun su precio de mayor a menor 
	public void ordenarPrecios() {
		Collections.sort(listaVehiculos);
		System.out.println("Vehiculos ordenados por precio de mayor a menor:");
		for(IVehiculo v : listaVehiculos) {
			System.out.println(v.marca + " " + v.modelo);
		}
	}

	
}
