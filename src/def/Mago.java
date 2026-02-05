package def;

public class Mago extends Personaje{

	private int mana;
	
	private int cantidadMana;
	
	private int ManaMax;
	
	public Mago(String nombre, int nivel, int puntosVida, boolean protegido, int mana) {

		super(nombre, nivel, puntosVida, protegido); //Le pasamos los parametros de la clase personaje a mago
		
		this.mana = mana;
		
		this.ManaMax = 100; //Mana disponible
		
	}
	
	public void LanzarHechizo(int costeMana) { //Lanzar hechizos
		
		if(costeMana < mana) {
			
			mana -= mana - costeMana; //Actualizamos mana disponible
			
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

			mana += mana + cantidad;

			System.out.println("Su mana ha sido recargado");

		}
		
	}
	
	public int getMana() { //Devuelve cantidad de mana actual
		
		return mana;
		
	}

}
