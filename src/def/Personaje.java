package def;

import java.util.Random;

public abstract class Personaje {

	Random rand = new Random();
	
	private String nombre;

	private int nivel;

	private int puntosVida;

	private int vidaMax = 100;

	private boolean protegido;


	private Inventario inventario;

	
	private int dado = 10;
	
	public Personaje(String nombre) {

		this.nombre = nombre;

		this.nivel = 1;
		
		this.puntosVida = this.vidaMax;

		this.protegido = false;

		this.inventario = null;

	}


	public Personaje(String nombre, int nivel, Inventario inventario) {

		this.nombre = nombre;

		subirNivelEnConstructor(nivel, this.vidaMax, this.dado);
		
		this.protegido = false;

		this.inventario = inventario;

	}

	public void mostrarInfo() {

		System.out.println("Datos:\n " + "\nNombre del heroe: " + nombre + "\nNivel: " + nivel + "\nPuntos de vida : " + puntosVida + "\nEstado de protección: " + protegido + "\nInventario: " + inventario);

	}

	public void bajarVida(int cantidad) {

		if(cantidad <= 0) {

			System.out.println("El ataque no tuvo efecto");

		}else if(protegido == false) {

			puntosVida -= cantidad;			

		}else if(protegido == true){

			cantidad /=2; //actualizo daño a la mitad

			puntosVida -= cantidad;

		}
		
		if(puntosVida <= 0){
			
			System.out.println("Has muerto");

		}

	}

	public void curar(int cantidad) {

		if(puntosVida == vidaMax) {

			System.out.println("Vida al maximo, imposible de hacer el hechizo");

		} else if(puntosVida + cantidad > vidaMax) {

			this.puntosVida = vidaMax;

		}else if(cantidad > 0) {

			puntosVida += cantidad;

			System.out.println("Salud restaurada");

		}else {

			System.out.println("No ha habido suficiente mana para el hechizo de curación");

		}

	}
	
	public int getVidaMax() {
		
		return this.vidaMax;
	}
	
	public void setVidaMax(int vidaMax) {
		
		this.vidaMax = vidaMax;
	}
	
	public void subirNivelEnConstructor(int nivel, int vidaMax, int dado) {
		
		this.nivel = nivel;

		for (int i = 0; i < nivel; i++) {
			vidaMax += rand.nextInt(dado) + 1;
		}
		
		this.vidaMax = vidaMax;

		this.puntosVida = this.vidaMax;
	}

	public Inventario getInventario() {

		return this.inventario;

	}

	public void agregarInventario(Equipamiento equipamiento) {

		this.inventario.agregarEquipamiento(equipamiento);

	}

	public void setProtegido(boolean protegido) {

		if(this.protegido != protegido) {

			this.protegido = protegido; //Si esta protegido y lo pones en protegido no hace nada pero si no esta protegido se protege

		}
	}


}
