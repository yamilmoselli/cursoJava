
public class UsoString {

	public static void main(String[] args) {
		
		// los metodos static deben ser usados con el nombre de la clase antes
		// los metodos no static deben ser usados con un objeto
		
		String nombre = "yamil";
		// nombre es un objeto
		
		// String.lenght() esto es invalido porque el metodo lenght no es static, necesita de un objeto
		
		int longitud = nombre.length();
		System.out.println("mi nombre tiene " + longitud + " letras");
		
		System.out.println("la primer letra de mi nombre es " + nombre.charAt(0));
		System.out.println("la ultima letra de mi nombre es " + nombre.charAt(longitud - 1));
		
		System.out.println(nombre.substring(1));
		System.out.println(nombre.substring(1, 2));
		
		
		String alumno1 = "Carlos";
		String alumno2 = "carlos";
		
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2));

	}

}
