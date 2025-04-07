import java.util.Scanner;

public class CondicionalIF {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingresa tu edad");
		
		int edad = entrada.nextInt();
		
		if (edad >= 18) {
			System.out.println("mayor de edad");
		} else {
			System.out.println("menor de edad");
		}

	}
	
}
