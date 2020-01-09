package ejercicio;


public class Auto extends IVehiculo {

	public Auto( String marca, String modelo, int puertas, double precio) {
		this.modelo = modelo;
		this.marca = marca;
		this.puertas = puertas;
		this.precio = precio;
	}



	//Getters y Setters
	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public int getPuertas() {
		return puertas;
	}

	public double getPrecio() {
		return precio;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Marca: "+ marca + " // Modelo: " + modelo + " // Puertas: " + puertas + " // Precio: $" +precio;
	}



	@Override
	public int compareTo(IVehiculo o) {
		// TODO Auto-generated method stub
		if(this.precio > o.precio) {
			return -1;
		}
		if(this.precio < o.precio) {
			return 1;
		}
		return 0;
	}



	
	
}
