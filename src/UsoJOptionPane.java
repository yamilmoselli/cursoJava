import javax.swing.JOptionPane;

public class UsoJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario = JOptionPane.showInputDialog("Ingresa tu nombre de usuario");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
		
		System.out.println("Bienvenido " + nombre_usuario + " con " + edad + " anios");
		

	}

}
