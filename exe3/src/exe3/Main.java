package exe3;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[]args) {
		int m=0;
		int contador=1;
		int n1;
		
		while (contador <=15) {
			contador ++;
			
			n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
			
			if(n1 > m) {
				
				m = n1;
			}
			}
			
			JOptionPane.showMessageDialog(null, "O maior número é: " + m);
		
	}

}
