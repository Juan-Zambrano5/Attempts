package clase;

// 2 arraylsits, one with 5 subjects and the other with 5 grades, with a loop, the grades will be assign with each subject and other loop will show the grades

//import the library JOptionPane
import javax.swing.JOptionPane;

public class Contenedoras3 {
	public static void main(String[]args) {
		//create the arraylist Subjects
		String Subjects [] = new String[5];
		Subjects [0] = "Calculo";
		Subjects [1] = "Apo";
		Subjects [2] = "Mecanica";
		Subjects [3] = "Algebra";
		Subjects [4] = "Humanismo";
		
		double grades [] = new double[5];
		for (int i=0; i<5; i++) {
			grades [i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota de la materia " + Subjects[i]));
		}
		
		
		
		for (int i=0; i<5; i++) {
		JOptionPane.showMessageDialog(null, "La nota de " +Subjects[i]+" es de: " + grades[i]);
		}
		}
		//Conectar las dos contenedoras con un ciclo
		
	}


