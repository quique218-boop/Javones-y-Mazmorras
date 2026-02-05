package def;

public class Ladron extends Personaje {

	boolean invisible;

	public Ladron(String nombre, int nivel, int puntosVida, boolean protegido) {
		super(nombre, nivel, puntosVida, protegido);
		this.invisible = false;
	}

	public void robar() {
		
		String resultadoRobo = invisible ? "No te han visto robar al ser invisible" : "Te han pillado robando por ser visible";
		
		System.out.println(resultadoRobo);
	}
}
