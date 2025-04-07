import javax.swing.JOptionPane;

public class UsoWhile2 {

	public static void main(String[] args) {
		
		
		int random = (int)(Math.random()*10);
		
		int rta = Integer.parseInt(JOptionPane.showInputDialog("Adivina el nro entre 0-10"));
		
		while (random != rta) {
			rta = Integer.parseInt(JOptionPane.showInputDialog("Incorrecto, ingresa nuevamente"));
		}
		
		System.out.println("correcto");
		

	}

}
