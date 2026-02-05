package def;

public class Guerrero extends Personaje {

	Personaje companeroProtegido;

	public Guerrero(String nombre, int nivel, int puntosVida, boolean protegido) {
		super(nombre, nivel, puntosVida, protegido);
		this.companeroProtegido = null;
	}

	public void proteger(Personaje companero) {

		if (this.companeroProtegido == null) {

			this.companeroProtegido = companero;

		} else {

			System.out.println("Imposible proteger. Ya estas protegiendo a otro compañero");

		}
	}

	public void dejarDeProteger() {
		this.companeroProtegido = null;

		System.out.println("Has dejado de protejer a tu compañero");
	}

	public Personaje estaProtegiendo() {
		return this.companeroProtegido;
	}
}
