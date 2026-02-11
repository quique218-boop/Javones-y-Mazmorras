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

		this.inventario = new Inventario(new ArrayList<Equipamiento>()); //Creamos inventario vacio

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

	public String getNombre() { //cogemos nombre

		return this.nombre;
	}

	public void setNombre(String nombre) { //damos nombre

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

	public Inventario getInventario() { //Devuelve lo que tenga el inventario

		return this.inventario;

	}

	public void agregarInventario(Equipamiento equipamiento) {

		this.inventario.agregarEquipamiento(equipamiento); //Agregamos algun objeto a inventario

	}

	public int getDado() {
		return this.dado; 
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public void mostrarInfo() { //Mostramos toda la informacion del usuario

		System.out.println("Datos:\n " + "\nNombre del heroe: " + nombre + "\nNivel: " + nivel + "\nPuntos de vida : "
				+ puntosVida + "\nEstado de protección: " + protegido);

		inventario.mostrarInventario();

	}

	public void bajarVida(int cantidad) { 

		if (cantidad <= 0) { //Si el daño es menor que 0

			System.out.println("El ataque no tuvo efecto");

		} else if (protegido == false) {

			puntosVida -= cantidad;

		} else if (protegido == true) {

			cantidad /= 2; // actualizo daño a la mitad en caso de que este protegido

			puntosVida -= cantidad;

		}

		if (puntosVida <= 0) { //Si la vida del jugador es igual a 0 o menor

			System.out.println("Has muerto");
			

		}

	}

	public void curar(int cantidad) {

		if (puntosVida == vidaMax) { //En caso de que este a vida maxima

			System.out.println("Vida al maximo, imposible de hacer el hechizo");

		} else if (puntosVida + cantidad > vidaMax) {

			this.puntosVida = vidaMax; //Aunque se cure mas de la vida max solo generara hasta el maximo
			
			System.out.println("Salud restaurada al máximo");

		} else if (cantidad > 0) {

			puntosVida += cantidad;

			System.out.println("Salud restaurada");

		} else { //Si el valor es incorrecto

			System.out.println("No hemos encontrado la poción");

		}

	}

	public void setNivelInicial(int nivel) {

		for (int i = 1; i < nivel; i++) { //Empezamos a nivel 1

			int subidaVida = rand.nextInt(this.dado) + 1; //Por cada subida de nibel se tirara un dado

			System.out.println("Subes a nivel " + (i + 1) + " | Vida +" + subidaVida); //Los resultados se sumaran a los stats actuales

			System.out.println();

			//Actualizamos nuestras stats
			
			this.nivel = nivel;

			this.vidaMax += subidaVida;

			this.puntosVida = vidaMax;
		}
	}
}
