package def;

public class Guerrero extends Personaje {
	
	Personaje companeroProtegido;

	public Guerrero(String nombre, int nivel, int puntosVida, boolean protegido) {
		super(nombre, nivel, puntosVida, protegido);
		this.companeroProtegido = null;
	}

}
