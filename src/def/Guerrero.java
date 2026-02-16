package def;

public class Guerrero extends Personaje {

	private Personaje companeroProtegido;
	
	// Guerrero tiene una vida inicial diferente al resto asi que se especifica cual.
	private int vidaMax = 200;
	
	// Usa el mismo constructor que Personaje pero define compañero protegido a null.

	public Guerrero(String nombre) {
		super(nombre);
		super.setVidaMax(this.vidaMax);
		super.curar(this.vidaMax);
		this.companeroProtegido = null;
	}
	
	public Guerrero(String nombre, Inventario inventario) {
		super(nombre, inventario);
		super.setVidaMax(this.vidaMax);
		super.curar(this.vidaMax);
		this.companeroProtegido = null;
	}
	
	// Si companeroProtegido es null asigna el nuevo valor al compañero indicado.

	public void proteger(Personaje companero) {

		if (this.companeroProtegido == null) {

			this.companeroProtegido = companero;
			
			// Cambia la variable interna de ese personaje.
			
			companero.setProtegido(true);

		} else {
			
			// En caso de que no sea null se imprime un texto explicativo.

			System.out.println("Imposible proteger. Ya estas protegiendo a otro compañero\n");

		}
	}

	// Cambia el valor a null y envia un texto de advertencia.
	
	public void dejarDeProteger() {
		
		// Evita que intente cambiar la variable de un compañero null y si no es null entonces cambia la variable de ese compañero a falso.
		
		if(this.companeroProtegido != null) { this.companeroProtegido.setProtegido(false);
		
		this.companeroProtegido = null;

		System.out.println("Has dejado de protejer a tu compañero\n");
		}
		else {
			System.out.println("Has dejado de protejer a tu compañero\n");
		}
	}
	
	// Devuelve a que compañero esta protegiendo o null si no hay ninguno.

	public Personaje estaProtegiendo() {
		return this.companeroProtegido;
	}
}
