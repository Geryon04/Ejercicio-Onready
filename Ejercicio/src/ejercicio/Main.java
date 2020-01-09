package ejercicio;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Concesionaria concesionariaDeAutos = new Concesionaria();
		IVehiculo peugeot1 = new Auto("peugeot","206",4,200000.00);
		IVehiculo honda = new Moto("Honda", "Titan", "125c",60000.00);
		IVehiculo peugeot2 = new Auto("Peugeot","208",5,250000.0);
		IVehiculo yamaha = new Moto("Yamaha","YBR","160c",80500.50);
		
		//agrega vehiculos al listado
		concesionariaDeAutos.agregarVehiculo(peugeot1);
		concesionariaDeAutos.agregarVehiculo(honda);
		concesionariaDeAutos.agregarVehiculo(peugeot2);
		concesionariaDeAutos.agregarVehiculo(yamaha);

		//imprime los vehiculos
		concesionariaDeAutos.imprimirVehiculo();
		
		System.out.println("\n====================\n");

		//imprime el vehiculo mas caro, el mas barato y aquel que posse una 'Y' en su modelo
		concesionariaDeAutos.vehiculoMasCaro();
		concesionariaDeAutos.vehiculoMasBarato();
		concesionariaDeAutos.vehiculoContieneLetra('Y');
		
		System.out.println("\n====================\n");
		
		//ordena los vehiculos segun su precio
		concesionariaDeAutos.ordenarPrecios();
	}
	
	

}
