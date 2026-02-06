package def;

public class Mago extends Personaje{

	private int mana;

	private int cantidadMana;

	private int ManaMax;

	private int vidaMax = super.getvidaMax();

	private final int dado = 6;

	public Mago(String nombre) {

		super(nombre); 

		this.ManaMax = 100;

		this.mana = ManaMax;

	}

	public Mago(String nombre, int nivel, int puntosVida, boolean protegido, int mana, Inventario inventario) {

		super(nombre, nivel, puntosVida, protegido, inventario); //Le pasamos los parametros de la clase personaje a mago

		this.ManaMax = 100; //Mana disponible

		this.mana = ManaMax; //El mana inicial es igual que el maximo

	}

	public void setNivelInicial(int nivel) {

		for (int i = 1; i < nivel; i++) {

			int subidaVida = rand.nextInt(dado) + 1; // 1–6 aleatorio
			this.vidaMax += subidaVida;

			this.ManaMax += 20;

			System.out.println(
					"Subes a nivel " + (i + 1) + " | Vida +" + subidaVida + " | ManaMax " + ManaMax);

			System.out.println("");
		}

		this.mana = this.ManaMax;
	}


	public void LanzarHechizo(int costeMana) { //Lanzar hechizos

		if(costeMana <= mana) {

			mana -= costeMana; //Actualizamos mana disponible

			System.out.println("AVADAKEDABRA");

		}else {

			System.out.println("No tienes suficiente mana");

		}

	}

	public void recargarMana(int cantidad) { //Recarga de mana

		if(mana == ManaMax) {

			System.out.println("No puedes llenar mas tus reservas de mana!");

		} else if(mana + cantidad > ManaMax) {

			this.mana = ManaMax;

			System.out.println("Su mana ha sido restaurado");

		}else if(cantidad > 0) {

			mana += cantidad;

			System.out.println("Su mana ha sido recargado");

		}

	}

	public int getMana() { //Devuelve cantidad de mana actual

		return mana;

	}

}
