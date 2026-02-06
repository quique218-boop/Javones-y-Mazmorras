package def;

public class Ladron extends Personaje {

	private boolean invisible;

	// Consigue la vidaMax de la clase padre para poder modificarla aqui.

	private final int dado = 8;

	// Constructor usa las mismas variables que personaje y pone invisible a falso.

	public Ladron(String nombre) {
		super(nombre);
		this.invisible = false;
	}

	public Ladron(String nombre, int nivel, Inventario inventario) {
		super(nombre, nivel, inventario);

		int vidaMax = super.getVidaMax();

		subirNivelEnConstructor(nivel, vidaMax, dado);

		this.invisible = false;
	}

	// Si esta invisible devuelve el primer texto, de lo contrario, el segundo.

	public void robar() {

		String resultadoRobo = this.invisible ? "No te han visto robar al ser invisible" : "Te han pillado robando por ser visible";

		System.out.println(resultadoRobo);
	}

	// Invierte el valor actual de invisible. Si es falso ==> verdadero. Si es
	// verdadero ==> falso.

	void hacerseInvisible() {
		this.invisible = this.invisible ? false : true;
	}

	// Devuelve el valor actual de invisible.

	boolean estaInvisible() {
		return this.invisible;
	}
}
