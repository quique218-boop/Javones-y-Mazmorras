package def;

import java.util.ArrayList;

public class Inventario {
	
	private ArrayList<Equipamiento> equipamiento;
	
	public Inventario(ArrayList<Equipamiento> equipamiento) {
		
		this.equipamiento = equipamiento;
	}
	
	public void agregarEquipamiento(Equipamiento equipamiento) {
		
		this.equipamiento.add(equipamiento);
		
	}
	

	public void mostrarInventario() {
		
		
		for(int i = 0; i < equipamiento.size(); i++) {
			
			System.out.println("Elemento "+(i+1)+" del Inventario");
			System.out.println("");
			System.out.println("Nombre: "+equipamiento.get(i).getNombre() );
			System.out.println("Tipo: "+equipamiento.get(i).getTipo());
		}
	}
	

}
