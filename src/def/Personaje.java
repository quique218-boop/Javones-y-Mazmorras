package def;

import java.util.Random;

public abstract class Personaje {

	Random rand = new Random();
	
	private String nombre;

	private int nivel;

	private int puntosVida;

	private int vidaMax = 100;

	private boolean protegido;

	private inventario inventario;
	
	private int dado = 10;
	
	public Personaje(String nombre) {

		this.nombre = nombre;

		this.nivel = 1;
		
		this.puntosVida = this.vidaMax;

		this.protegido = false;

		this.inventario = null;

	}

	public Personaje(String nombre, int nivel, int puntosVida, boolean protegido) {

		this.nombre = nombre;

		this.nivel = nivel;

		this.puntosVida = puntosVida;

		for (int i = 0; i < nivel; i++) {
			this.vidaMax *= rand.nextInt(dado) + 1;
		}

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

		if(puntosVida == vidaMax) {

			System.out.println("Vida al maximo, imposible de hacer el hechizo");

		} else if(puntosVida + cantidad > vidaMax) {

			this.puntosVida = vidaMax;

		}else if(cantidad > 0) {

			puntosVida += puntosVida + cantidad;

			System.out.println("Salud restaurada");

		}else {

			System.out.println("No ha habido suficiente mana para el hechizo de curación");

		}

	}

	public inventario getInventario() {

		return inventario;

	}

	public void agregarInventario(Equipamiento equipamiento) {

		inventario.add(equipamiento);

	}

	public void setProtegido(boolean protegido) {

		if(this.protegido != protegido) {

			this.protegido = protegido; //Si esta protegido y lo pones en protegido no hace nada pero si no esta protegido se protege

		}
	}


}
