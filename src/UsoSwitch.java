import java.util.Scanner;

public class UsoSwitch {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa un dia semanal");
		
		String dia = entrada.nextLine();
		
		String res = switch (dia) {
		
			case "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" -> "dia laboral";
			case "Sabado", "Domingo" -> "dia no laboral";
			default -> "dia erroneo";
		
		};
		
		System.out.println(res);
		

	}

}
