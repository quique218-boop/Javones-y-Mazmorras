package def;


public class Equipamiento {
	
	private String nombre;
	private String tipo;
	
	public Equipamiento(String nombre, String tipo ){
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipo() {
		return tipo;
	}

}
