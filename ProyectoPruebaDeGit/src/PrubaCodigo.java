import operaciones.operacionesBasicas;


public class PrubaCodigo {

	public static void main(String[] args) {
		System.out.println("Prueba de Git Eclipse");
		System.out.println("Prueba de Git Eclipse Cambio1");
		operacionesBasicas obj1 = new operacionesBasicas(5,6);
		
		int resultado = obj1.sumaNumeros();
		System.out.println("El resultado de la suma es: " + resultado);
		
	}

}
