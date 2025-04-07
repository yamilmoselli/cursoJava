import javax.swing.JOptionPane;

public class UsoFor {

	public static void main(String[] args) {
		
		boolean es_mail = false;
		
		String input = JOptionPane.showInputDialog("ingresa tu email");
		
		int longitud = input.length();
		
		for (int i=0; i<longitud; i++) {
			
			if (input.charAt(i) == '@') {
				
				es_mail = true;
				
			}
			
		}
		
		if (es_mail == true) System.out.println("email correcto");
		else System.out.println("email incorrecto");

	}

}
