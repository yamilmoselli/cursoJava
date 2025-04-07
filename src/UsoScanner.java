// los metodos que tienen el mismo nombre que la clase son constructores
import java.util.Scanner;

public class UsoScanner {

	public static void main(String[] args) {
		
		// ningun metodo de la clase scanner es static, por lo que siempre vamos a tener que crear un objeto
	
		Scanner entrada = new Scanner(System.in);
		// entrada es un objeto y le debo dar un estado inicial (esto se hace con un constructor)
		// para usar el constructor de una clase se usa la palabra new
		
		System.out.println("Ingresa tu nombre de usuario");
		
		String nombre_usuario = entrada.nextLine();
		// nextLine() no es static por lo que necesita de un objeto
		
		System.out.println("Ingresa tu edad");
		
		int edad = entrada.nextInt();
		
		System.out.println("Bienvenido " + nombre_usuario);
		System.out.println("Tenes " + edad + " anios");
		
		entrada.close();
		// cierro el Scanner si no lo vuelvo a usar
		
		
		// si primero quiero pedir la edad, luego de definir el int debo escribir entrada.NextLine()
		// explicado en el video 15

	}

}
