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
			
			


		}






	}

}
