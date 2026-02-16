package def;

public class Mago extends Personaje {

	//Declaramos variables para mago
	
	private int mana;

	private int manaMax;

	private int dado = 6;

	public Mago(String nombre) {

		super(nombre);

		this.manaMax = 100;

		this.mana = manaMax;

		super.setDado(this.dado);
	}

	public Mago(String nombre, Inventario inventario) {

		super(nombre, inventario); // Le pasamos los parametros de la clase personaje a mago

		this.manaMax = 100; // Mana disponible

		this.mana = manaMax; // El mana inicial es igual que el maximo

		super.setDado(this.dado);
	}

	public int getMana() { // Devuelve cantidad de mana actual

		return mana;

	}

	public void setMana(int mana) {

		this.mana = mana;

	}

	public int getManaMax() {

		return mana;

	}

	public void setManaMax(int manaMax) {

		this.manaMax = manaMax;

	}
	
	@Override
	public void setNivelInicial(int nivel) {

		for (int i = 1; i < nivel; i++) {

			int subidaVida = rand.nextInt(getDado()) + 1; // 1–6 aleatorio

			this.manaMax += 20;

			System.out.println("Subes a nivel " + (i + 1) + " | Vida +" + subidaVida + " | ManaMax " + manaMax);

			System.out.println();

			setNivel(nivel);

			setVidaMax(getVidaMax() + subidaVida);
			
			setPuntosVida(getVidaMax());
		}

		this.mana = this.manaMax;
	}

	public void LanzarHechizo(int costeMana) { // Lanzar hechizos

		if (costeMana <= mana) {

			mana -= costeMana; // Actualizamos mana disponible

			System.out.println("AVADAKEDABRA\n");

		} else {

			System.out.println("No tienes suficiente mana\n");

		}

	}

	public void recargarMana(int cantidad) { // Recarga de mana

		if (mana == manaMax) {

			System.out.println("No puedes llenar mas tus reservas de mana!\n");

		} else if (mana + cantidad > manaMax) {

			this.mana = manaMax;

			System.out.println("Su mana ha sido restaurado\n");

		} else if (cantidad > 0) {

			mana += cantidad;

			System.out.println("Su mana ha sido recargado\n");

		}
	}
}
