package def;
import java.util.Scanner;

public class Main {

	private static final int THUNDERCLAP = 40, FIREBALL = 15, VINES = 20, ICE_ARROW = 30;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int des;
		
		int nivel = 1;

		System.out.println("Bienvenidos a JAVONES Y MAZMORRAS");

		System.out.println("Que tipo de aventura quieres? ");

		System.out.println("PARTIDA POR DEFECTO");

		System.out.println("PARTIDA PERSONALIZADA");

		String opcion = scan.nextLine().toLowerCase();

			System.out.println("Como te llamas aventurero?");

			String nombre = scan.nextLine();

			System.out.println("Que clase eres? \n Guerrero \n Mago \n Ladron");

			String clase = scan.nextLine().toLowerCase();
			
			if(opcion.equals("partida personalizada")) {
				
				System.out.println("Que nivel posees aventurero");
				
				nivel = scan.nextInt();
				
			}

			switch(clase) {

			case "mago":

				Mago Gandalf = new Mago(nombre);
				
				if(opcion.equals("partida personalizada")){
					
					Gandalf.setNivelInicial(nivel);
					
				}

				System.out.println("Bienvenido gran hechizero que quiere hacer? ");

				System.out.println("");
				
				do {

					System.out.println("1 - Lanzar Hechizo");

					System.out.println("2 - Recargar Mana");

					System.out.println("3 - Ver mi Mana");
					
					System.out.println("4- Mostrar Info");

					System.out.println("5 - Salir");

					des = scan.nextInt();

					scan.nextLine();
					
					switch(des) {

					case 1:
						
						System.out.println("Que hechizo quere lanzar \n Fireball \n Thunderclap \n Vines \n Ice Arrow");

						System.out.println("");
						
						int coste = 0;

						String hech = scan.nextLine().toLowerCase();
						

						switch(hech) {

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

						System.out.println("");
						
						Gandalf.LanzarHechizo(coste);

						break;

					case 2:

						System.out.println("");
						
						System.out.println("Preparate para recargar");

						System.out.println("Cuanto quieres recargar?");

						int rec = scan.nextInt();

						Gandalf.recargarMana(rec);

						break;

					case 3: 

						System.out.println("");
						
						System.out.println("Nos adentramos en nuestras reservas");

						System.out.println(Gandalf.getMana());

						break;

					case 4:
						
						Gandalf.mostrarInfo();
						
						break;
						
					case 5:

						System.out.println("");
						
						System.out.println("Buen Viaje");

						break;

					}

				}while(des != 5);

				break;

			case "guerrero":

				Guerrero guerrero1 = new Guerrero(nombre);

				Mago compaprueba = new Mago("Voldemort");

				System.out.println("Bienvenido guerrero que quiere hacer?");

				System.out.println("");
				
				do {
					
					System.out.println("1 - Proteger a compañero");

					System.out.println("2 - Dejar de proteger");

					System.out.println("3 - Mirar a quien has protegido");

					System.out.println("4- Mostrar Info");
					
					System.out.println("5 - Salir");

					des = scan.nextInt();

					switch(des) {

					case 1:

						System.out.println("");
						
						guerrero1.proteger(compaprueba);

						System.out.println("El guerrero levanta su escudo frente a " + guerrero1.estaProtegiendo()); //Mostramos que mostramos proteger y esta protegiendo

						break;

					case 2:

						System.out.println("");
						
						guerrero1.dejarDeProteger();

						System.out.println(guerrero1.estaProtegiendo());

						break;

					case 3: 

						System.out.println("");
						
						System.out.println("Actualmente estas protegiendo a : " + guerrero1.estaProtegiendo());

						break;
						
					case 4:
						
						guerrero1.mostrarInfo();
						
						break;
						
					case 5: 
						
						System.out.println("");
						
						System.out.println("Adios caballero");
						
						break;
						
					}
					
				}while(des != 5);
				
				break;
				
			case "ladron":
				
				Ladron ladron = new Ladron(nombre);
				
				System.out.println("Bienvenido maestro del sigilo elige tu acción ");

				System.out.println("");
				
				do {

					System.out.println("1 - Robar");

					System.out.println("2 - Hacerse Invisible");

					System.out.println("3 - Comprobar estado");
					
					System.out.println("4- Mostrar Info");

					System.out.println("5 - Salir");

					des = scan.nextInt();

					switch(des) {
					
					case 1:
						
						System.out.println("");
						
						ladron.robar();
						
						break;
						
					case 2:
						
						System.out.println("");
						
						System.out.println("Ahora me ves, ahora no me ves");
						
						ladron.hacerseInvisible();
						
						break;
						
					case 3:
						
						System.out.println("");
						
						System.out.println("Me puedes ver?");
						
						System.out.println(ladron.estaInvisible());
						
						break;
						
					case 4: 
						
						ladron.mostrarInfo();
						
						break;
						
					case 5:
						
						System.out.println("");
						
						System.out.println("Que no te cojan");
						
						break;
						
					}
					
				}while(des != 5);
				
				break;
				
			}

		scan.close();
		
	}
	
}
