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
		
		for (int i = 0; i < nivel; i++) {
			
			this.vidaMax += rand.nextInt(dado) + 1;
			
			this.ManaMax += 20; //Cada vez que se suba de nivel el mana maximo aumentara 20
			
			System.out.println("Su nivel de personaje ha aumentado a nivel " + i + " tus capacidad de vida ha mejorado a " + vidaMax + " y su capacidad de mana ha " + ManaMax);
			
			System.out.println("");
			
	}
		
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
