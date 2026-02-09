package def;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static final int THUNDERCLAP = 40, FIREBALL = 15, VINES = 20, ICE_ARROW = 30;

	private static Mago GANDALF = null;

	private static Guerrero GUERRERO = null;

	private static Ladron LADRON = null;

	private static Scanner scanL = new Scanner(System.in);
	private static Scanner scanN = new Scanner(System.in);

	public static void main(String[] args) {

		int des = 0;

		int arma = 0;

		int nivel = 1;

		System.out.println("\n==== Bienvenidos a JAVONES Y MAZMORRAS ====\n");

		System.out.println("Que tipo de aventura quieres?\n");

		System.out.println("PARTIDA POR DEFECTO");

		System.out.println("PARTIDA PERSONALIZADA");

		String opcion = "";

		while (!opcion.equalsIgnoreCase("PARTIDA POR DEFECTO") && !opcion.equalsIgnoreCase("PARTIDA PERSONALIZADA")) opcion = scanL.nextLine().toLowerCase();

		System.out.println("\nComo te llamas aventurero?");

		String nombre = "";

		String respuesta = "";

		while (!respuesta.equalsIgnoreCase("Y")) {

			nombre = scanL.nextLine();

			System.out.println("Su nombre sera: " + nombre + "\n Estas seguro? (Y)");

			respuesta = scanL.nextLine();

			if (!respuesta.equalsIgnoreCase("Y")) System.out.println("Introduzca otro nombre: ");

		}

		System.out.println("\nQue clase eres?\n\n Guerrero\n Mago\n Ladron");

		String clase = "";

		while (!clase.equalsIgnoreCase("Guerrero") && !clase.equalsIgnoreCase("Mago") && !clase.equalsIgnoreCase("Ladron")) clase = scanL.nextLine().toLowerCase();

		if (opcion.equals("partida personalizada")) {

			System.out.println("\nQue nivel posees aventurero");

			nivel = LeerInt();

			System.out.println("\nCon que item quieres empezar?");

			System.out.println("\n1 - Una pocion para mejorar tus hechizos\n2 - Un escudo de madera oscura\n3 - El anillo de invisibilidad");

			int eleccionItem = Opciones(3);

			Inventario inv = new Inventario(new ArrayList<Equipamiento>());

			switch (eleccionItem) {

			case 1:

				inv.agregarEquipamiento(new Equipamiento("Una pocion para mejorar tus hechizos", "elixir"));

				break;

			case 2:

				inv.agregarEquipamiento(new Equipamiento("Un escudo de madera oscura", "escudo"));

				break;

			case 3:

				inv.agregarEquipamiento(new Equipamiento("El anillo de invisibilidad", "amuleto"));

				break;

			}

			switch (clase) {

			case "mago":

				GANDALF = new Mago(nombre, inv);

				GANDALF.setNivelInicial(nivel);

				break;

			case "guerrero":

				GUERRERO = new Guerrero(nombre, inv);

				GUERRERO.setNivelInicial(nivel);

				break;

			case "ladron":

				LADRON = new Ladron(nombre, inv);

				LADRON.setNivelInicial(nivel);

				break;

			}

		} else {

			switch (clase) {

			case "mago":

				GANDALF = new Mago(nombre);

				break;

			case "guerrero":

				GUERRERO = new Guerrero(nombre);

				break;

			case "ladron":

				LADRON = new Ladron(nombre);

				break;

			}
		}

		switch (clase) {

		case "mago":

			System.out.println("\nBienvenido gran hechizero que quiere hacer?");

			do {

				System.out.println("\n1 - Lanzar Hechizo");

				System.out.println("2 - Recargar Mana");

				System.out.println("3 - Ver mi Mana");

				System.out.println("4 - Abrir cofre misterioso");

				System.out.println("5- Mostrar Info");

				System.out.println("6 - Salir\n");

				des = Opciones(6);

				switch (des) {

				case 1:

					System.out.println("\nQue hechizo quere lanzar \n Fireball \n Thunderclap \n Vines \n Ice Arrow");

					int coste = 0;

					String hech = "";

					while (!hech.equalsIgnoreCase("fireball") && !hech.equalsIgnoreCase("thunderclap")
							&& !hech.equalsIgnoreCase("vines") && !hech.equalsIgnoreCase("ice arrow")) hech = scanL.nextLine().toLowerCase();

					switch (hech) {

					case "fireball":

						coste = FIREBALL;

						break;

					case "thunderclap":

						coste = THUNDERCLAP;

						break;

					case "vines":

						coste = VINES;

						break;

					case "ice arrow":

						coste = ICE_ARROW;

						break;

					}

					GANDALF.LanzarHechizo(coste);

					break;

				case 2:

					System.out.println("Preparate para recargar");

					System.out.println("Cuanto quieres recargar?");

					int rec = LeerInt();

					GANDALF.recargarMana(rec);

					break;

				case 3:

					System.out.println("Nos adentramos en nuestras reservas");

					System.out.println(GANDALF.getMana());

					break;

				case 4:

					System.out.println("Abres el cofre lentamente y...");

					System.out.println("No era un Mimic menos mal, te acercas a ver que esta dentro");

					System.out.println("\nDentro te encuentras: \n 1 - Un baston de madera con una gema roja flotando en el centro \n 2 - Un libro con encantamientos ancestrales \n 3-  Una pocion para mejorar tus hechizos");

					System.out.println("\nQue quieres elegir? ");

					arma = Opciones(3);

					switch (arma) {

					case 1:

						GANDALF.agregarInventario(new Equipamiento("baston de madera con una gema roja flotando en el centro", "arma"));

						break;

					case 2:

						GANDALF.agregarInventario(new Equipamiento("Un libro con encantamientos ancestrales", "conocimiento"));

						break;

					case 3:

						GANDALF.agregarInventario(new Equipamiento("Una pocion para mejorar tus hechizos", "elixir"));

						break;

					}

					System.out.println("\nLo has obtenido, tu inventario ahora contiene\n");

					GANDALF.getInventario().mostrarInventario();

				case 5:

					GANDALF.mostrarInfo();

					break;

				case 6:

					System.out.println("\nBuen Viaje");

					break;

				}

			} while (des != 6);

			break;

		case "guerrero":

			Mago compaprueba = new Mago("Voldemort");

			System.out.println("\nBienvenido guerrero que quiere hacer?");

			do {

				System.out.println("\n1 - Proteger a compañero");

				System.out.println("2 - Dejar de proteger");

				System.out.println("3 - Mirar a quien has protegido");

				System.out.println("4 - Abrir cofre misterioso");

				System.out.println("5- Mostrar Info");

				System.out.println("6 - Salir\n");

				des = Opciones(6);

				switch (des) {

				case 1:

					GUERRERO.proteger(compaprueba);

					System.out.println("El guerrero levanta su escudo frente a " + GUERRERO.estaProtegiendo().getNombre()); // Mostramos a quien estamos protegiendo

					break;

				case 2:

					GUERRERO.dejarDeProteger();

					System.out.println("Actualmente estas protegiendo a : " + GUERRERO.estaProtegiendo().getNombre());

					break;

				case 3:

					System.out.println("Actualmente estas protegiendo a : " + GUERRERO.estaProtegiendo().getNombre());

					break;

				case 4:

					System.out.println("Abres el cofre lentamente y...");

					System.out.println("No era un Mimic menos mal, te acercas a ver que esta dentro");

					System.out.println("\nDentro te encuentras: \n 1 - Una espada de Adamantita \n 2 - Un escudo de madera oscura \n 3-  Una hacha de hierro frio");

					System.out.println("\nQue quieres elegir? ");

					arma = Opciones(3);

					switch (arma) {

					case 1:

						GUERRERO.agregarInventario(new Equipamiento("Una espada de Adamantita", "espada"));

						break;

					case 2:

						GUERRERO.agregarInventario(new Equipamiento("Un escudo de madera oscura", "escudo"));

						break;

					case 3:

						GUERRERO.agregarInventario(new Equipamiento("Una hacha de hierro frio", "hacha de combate"));

						break;
					}

					System.out.println("\nLo has obtenido, tu inventario ahora contiene\n");

					GUERRERO.getInventario().mostrarInventario();

				case 5:

					GUERRERO.mostrarInfo();

					break;

				case 6:

					System.out.println("\nAdios caballero");

					break;

				}

			} while (des != 6);

			break;

		case "ladron":

			System.out.println("\nBienvenido maestro del sigilo elige tu acción");

			do {

				System.out.println("\n1 - Robar");

				System.out.println("2 - Hacerse Invisible");

				System.out.println("3 - Comprobar estado");

				System.out.println("4 - Abrir cofre misterioso");

				System.out.println("5- Mostrar Info");

				System.out.println("6 - Salir\n");

				des = Opciones(6);

				switch (des) {

				case 1:

					LADRON.robar();

					break;

				case 2:

					System.out.println("Ahora me ves, ahora no me ves");

					LADRON.hacerseInvisible();

					break;

				case 3:

					System.out.println("Soy invisible?");

					System.out.println(LADRON.estaInvisible());

					break;

				case 4:

					System.out.println("Abres el cofre lentamente y...");

					System.out.println("No era un Mimic menos mal, te acercas a ver que esta dentro");

					System.out.println("\nDentro te encuentras: \n 1 - El anillo de invisibilidad \n 2 - Los Brazales de Dagas Voladoras \n 3-  El Anillo de Evasión");

					System.out.println("\nQue quieres elegir? ");

					arma = Opciones(3);

					switch (arma) {

					case 1:

						LADRON.agregarInventario(new Equipamiento("El anillo de invisibilidad", "amuleto"));

						break;

					case 2:

						LADRON.agregarInventario(new Equipamiento("Los Brazales de Dagas Voladoras", "amuleto"));

						break;

					case 3:

						LADRON.agregarInventario(new Equipamiento("El Anillo de Evasión", "amuleto"));

						break;
					}

					System.out.println("\nLo has obtenido, tu inventario ahora contiene\n");

					LADRON.getInventario().mostrarInventario();

				case 5:

					LADRON.mostrarInfo();

					break;

				case 6:

					System.out.println("\nQue no te cojan");

					break;

				}

			} while (des != 6);

			break;
		}

		scanL.close();
		scanN.close();

	}

	private static int LeerInt() {

		while (true) {

			if (scanN.hasNextInt()) {

				int nivel;

				if ((nivel = scanN.nextInt()) > 0)
					return nivel;

			} else {

				scanN.next();

			}
		}
	}

	private static int Opciones(int numeroDeOpciones) {

		int opcion = 0;

		while (!(opcion > 0 && opcion <= numeroDeOpciones))
			opcion = LeerInt();

		return opcion;

	}
}