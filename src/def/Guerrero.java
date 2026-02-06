package def;

public class Guerrero extends Personaje {

	private Personaje companeroProtegido;
	
	// Guerrero tiene una vida inicial diferente al resto asi que se especifica cual.
	private int vidaMax = 200;
	
	private final int dado = 10;
	
	// Usa el mismo constructor que Personaje pero define compañero protegido a null.

	public Guerrero(String nombre) {
		super(nombre);
		super.setVidaMax(this.vidaMax);
		super.curar(this.vidaMax);
		this.companeroProtegido = null;
	}
	
	public Guerrero(String nombre, int nivel, Inventario inventario) {
		super(nombre, nivel, inventario);
		
		subirNivelEnConstructor(nivel, this.vidaMax, dado);
		
		this.companeroProtegido = null;
	}
	
	// Si companeroProtegido es null asigna el nuevo valor al compañero indicado.

	public void proteger(Personaje companero) {

		if (this.companeroProtegido == null) {

			this.companeroProtegido = companero;

		} else {
			
			// En caso de que no sea null se imprime un texto explicativo.

			System.out.println("Imposible proteger. Ya estas protegiendo a otro compañero");

		}
	}

	// Cambia el valor a null y envia un texto de advertencia.
	
	public void dejarDeProteger() {
		this.companeroProtegido = null;

		System.out.println("Has dejado de protejer a tu compañero");
	}
	
	// Devuelve a que compañero esta protegiendo o null si no hay ninguno.

	public Personaje estaProtegiendo() {
		return this.companeroProtegido;
	}
}
