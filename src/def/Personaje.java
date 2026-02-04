package def;

public class Personaje {

	private String nombre;
	
	private int nivel;
	
	private int puntosVida;
	
	private int VidaMax;
	
	private boolean protegido;
	
	private inventario inventario;
	
	public Personaje(String nombre, int nivel, int puntosVida, boolean protegido) {
		
		this.nombre = nombre;
		
		this.nivel = nivel;
		
		this.puntosVida = puntosVida;
		
		this.VidaMax = 100;
		
		this.protegido = protegido;
		
		this.inventario = inventario;
		
	}
	
	public void mostrarInfo() {
		
		System.out.println("Datos: " + " nombre del heroe: ," + nombre + "\n nivel: ," + nivel + "\n puntos de vida : ," + puntosVida + "estado: ," + protegido + "\n estado de inventario: " + inventario);
		
	}
	
	public void bajarVida(int cantidad) {
		
		if(cantidad <= 0) {
			
			System.out.println("El ataque no tuvo efecto");
			
		}else if(puntosVida != 0 && protegido == false) {
			
			puntosVida -= puntosVida - cantidad;			
			
		}else if(puntosVida != 0 && protegido == true){
			
			cantidad = cantidad / 2; //actualizo daño a la mitad
			
			puntosVida -= puntosVida - cantidad;
			
		}else {
			
			System.out.println("Has muerto");
			
		}
		
	}
	
	public void curar(int cantidad) {
		
		if(cantidad > 0) {
			
			puntosVida += puntosVida + cantidad;
			
			System.out.println("Salud restaurada");
			
		}else {
			
			System.out.println("No ha habido suficiente mana para el hechizo de curación");
			
		}
		
	}
	
	public inventario getInventario() {
		
		return inventario;
		
	}
	
}
