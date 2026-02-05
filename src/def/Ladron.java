package def;

public class Ladron extends Personaje {
	
	boolean invisible;

	public Ladron(String nombre, int nivel, int puntosVida, boolean protegido) {
		super(nombre, nivel, puntosVida, protegido);
		this.invisible = false;
	}

}
