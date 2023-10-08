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

		//create a StringBuilder with the name of message
		StringBuilder message = new StringBuilder();

		//create the arraylist grades
		double grades [] = new double[5];

		//a for loop so the user can enter the 5 grades and it assign the grades with the subjects
		for (int i=0; i<5; i++) {
			grades [i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota de la materia " + Subjects[i]));
		}
		
		//a for loop that set element to everything thats inside subjects
		//add element per element to message and it line breaks
		for (String element : Subjects) {
	            message.append(element).append("\n");
	        }

		//a for loop that set element to everything thats inside grades
		//add element per element to message and it line breaks
		 for (double element : grades) {
	            message.append(element).append("\n");
	        }

		//finally we change message to a string and we show it with JOptionPane
		 JOptionPane.showMessageDialog(null, "Elements in the ArrayList:\n" + message.toString());
		
		}
		
	}


