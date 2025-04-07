import javax.swing.JOptionPane;

public class UsoWhile {

	public static void main(String[] args) {
		
		String password = "yamil";
		
		String inputpassword = "";
		
		while (password.equals(inputpassword) == false) {
			
			inputpassword = JOptionPane.showInputDialog("Ingresa la contrasenia");
			
		}
		
		System.out.println("Contrasenia correcta");

	}

}
