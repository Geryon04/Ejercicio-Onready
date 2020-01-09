package ejercicio;

public class Moto extends IVehiculo {

	public Moto(String marca, String modelo, String cilindrada, double precio) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.precio = precio;
	}
	
	public String getModelo() {
		return modelo;
	}
	public String getMarca() {
		return marca;
	}
	public String getCilindrada() {
		return cilindrada;
	}
	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Marca: "+ marca + " // Modelo: " + modelo + " // Cilindrada: " + cilindrada + " // Precio: $" + precio;
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
