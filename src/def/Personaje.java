package def;

import java.util.ArrayList;
import java.util.Random;

public abstract class Personaje {

	Random rand = new Random();

	private String nombre;

	private int nivel;

	private int puntosVida;

	private int vidaMax;

	private boolean protegido;

	private Inventario inventario;
	
	

	private int dado;

	public Personaje(String nombre) {

		this.nombre = nombre;

		this.nivel = 1;

		this.vidaMax = 100;

		this.puntosVida = this.vidaMax;

		this.protegido = false;

		this.inventario = new Inventario(new ArrayList<Equipamiento>());
		
		this.dado = 10;

	}

	public Personaje(String nombre, Inventario inventario) {

		this.nombre = nombre;

		this.nivel = 1;

		this.vidaMax = 100;

		this.puntosVida = this.vidaMax;

		this.protegido = false;

		this.inventario = inventario;
		
		this.dado = 10;
	}
	
	public String getNombre() {

		return this.nombre;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}
	public int getNivel() {

		return this.nivel;
	}

	public void setNivel(int nivel) {

		this.nivel = nivel;
	}
	public int getPuntosVida() {

		return this.puntosVida;
	}

	public void setPuntosVida(int puntosVida) {

		this.puntosVida = puntosVida;
	}
	
	public int getVidaMax() {

		return this.vidaMax;
	}
	
	public void setVidaMax(int vidaMax) {

		this.vidaMax = vidaMax;
	}
	
	public boolean getProtegido() {

		return this.protegido;
	}

	public void setProtegido(boolean protegido) {

		if (this.protegido != protegido) {

			this.protegido = protegido; // Si esta protegido y lo pones en protegido no hace nada pero si no esta
										// protegido se protege

		}
	}
	
	public Inventario getInventario() {

		return this.inventario;

	}

	public void agregarInventario(Equipamiento equipamiento) {

		this.inventario.agregarEquipamiento(equipamiento);

	}
	
	public int getDado() {
		return this.dado;
	}
	
	public void setDado(int dado) {
		this.dado = dado;
	}

	public void mostrarInfo() {

		System.out.println("Datos:\n " + "\nNombre del heroe: " + nombre + "\nNivel: " + nivel + "\nPuntos de vida : "
				+ puntosVida + "\nEstado de protección: " + protegido + "\nInventario: " + inventario);

	}

	public void bajarVida(int cantidad) {

		if (cantidad <= 0) {

			System.out.println("El ataque no tuvo efecto");

		} else if (protegido == false) {

			puntosVida -= cantidad;

		} else if (protegido == true) {

			cantidad /= 2; // actualizo daño a la mitad

			puntosVida -= cantidad;

		}

		if (puntosVida <= 0) {

			System.out.println("Has muerto");

		}

	}

	public void curar(int cantidad) {

		if (puntosVida == vidaMax) {

			System.out.println("Vida al maximo, imposible de hacer el hechizo");

		} else if (puntosVida + cantidad > vidaMax) {

			this.puntosVida = vidaMax;

		} else if (cantidad > 0) {

			puntosVida += cantidad;

			System.out.println("Salud restaurada");

		} else {

			System.out.println("No ha habido suficiente mana para el hechizo de curación");

		}

	}

	public void setNivelInicial(int nivel) {

		for (int i = 1; i < nivel; i++) {

			int subidaVida = rand.nextInt(this.dado) + 1;

			System.out.println("Subes a nivel " + (i + 1) + " | Vida +" + subidaVida);

			System.out.println("");
			
			this.nivel = nivel;
			
			this.vidaMax += subidaVida;
			
			this.puntosVida = vidaMax;
		}
	}
}
