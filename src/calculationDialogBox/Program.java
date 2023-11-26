package calculationDialogBox;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	
		double n1, n2;
		int option;
		
		JOptionPane.showMessageDialog(null,"Calculations");
		
		try {
			do {
				
				option = Integer.parseInt(JOptionPane.showInputDialog(null,"Choose an option:\n"
						+ "0- Exit\n"
						+ "1- Add\n"
						+ "2- Subtract\n"
						+ "3- Multiply\n"
						+ "4- Divide")
						);
				
				switch(option) {
				
					case 0:
					
					break;
				
					case 1:
						n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"First value:"));
						n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Second value:"));
						
						JOptionPane.showMessageDialog(null,n1+" + "+n2+ " = "+(n1 + n2));
					break;
					
					case 2:
						n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"First value:"));
						n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Second value:"));
						
						JOptionPane.showMessageDialog(null,n1+" - "+n2+ " = "+(n1 - n2));
					break;
					
					case 3:
						n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"First value:"));
						n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Second value:"));
						
						JOptionPane.showMessageDialog(null,n1+" x "+n2+ " = "+(n1 * n2));
					break;
					
					case 4:
						n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"First value:"));
						n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Second value:"));
						
						JOptionPane.showMessageDialog(null,n1+" / "+n2+ " = "+(n1 / n2));
					break;
					
					default:
						JOptionPane.showMessageDialog(null,"Invalid Option");
					break;
					
				}
			} while((int)option != 0);
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Error: Invalid Input.");
		} finally {
			JOptionPane.showMessageDialog(null,"Closing Program");
		}
	}

}
