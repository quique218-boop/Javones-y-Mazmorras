package def;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Bienvenidos a JAVONES Y MAZMORRAS");

		System.out.println("Que tipo de aventura quieres? ");

		System.out.println("PARTIDA POR DEFECTO");

		System.out.println("PARTIDA PERSONALIZADA");

		String opcion = scan.nextLine();

		switch(opcion) {

		case "partida por defecto":

			System.out.println("Como te llamas aventurero?");

			String nombre = scan.nextLine();

			System.out.println("Que clase eres? \n Guerrero \n Mago \n Ladron");

			String clase = scan.nextLine();
			
			switch(clase) {
			
			case "mago":
			
			Mago Gandalf = new Mago(nombre);
			
			System.out.println("Bienvenido gran hechizero que quiere hacer? ");
			
			do {
				
				System.out.println("1 - Lanzar Hechizo");
				
				System.out.println("2 - Recargar Mana");
				
				System.out.println("3 - Ver mi Mana");
				
				int des = scan.nextInt();
				
				switch(des) {
				
				case 1:
					
					System.out.println("Que hechizo quere lanzar");
					
					String hech = scan.nextLine();
					
					System.out.println("Que coste tiene");
					
					int costeMana = scan.nextInt();
					
					Gandalf.LanzarHechizo(costeMana);
				}
			}
			Gandalf.LanzarHechizo(costeMana);
			
			costeMana = scan.nextInt();
			
			
			break;
			
			case "guerrero":
				
				Guerrero guerrero1 = new Guerrero(nombre);
				
				System.out.println("Bienvenido guerrero que quiere hacer?");
				
				do {
				System.out.println("Proteger a compañero");
				
				guerrero1.proteger();
				
				}
			}


		}






	}

}
