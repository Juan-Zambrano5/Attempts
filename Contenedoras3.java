package clase;
// 2 contenedoras con asignaturas y notas, a traves de un ciclo se colocan las notas y con otro ciclo dar las notas asignadas
import javax.swing.JOptionPane;

public class Contenedoras3 {
	public static void main(String[]args) {
		String Asignaturas [] = new String[5];
		Asignaturas [0] = "Calculo";
		Asignaturas [1] = "Apo";
		Asignaturas [2] = "Mecanica";
		Asignaturas [3] = "Algebra";
		Asignaturas [4] = "Humanismo";
		
		double Notas [] = new double[5];
		for (int i=0; i<5; i++) {
			Notas [i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota de la materia " + Asignaturas[i]));
		}
		
		
		
		for (int i=0; i<5; i++) {
		JOptionPane.showMessageDialog(null, "La nota de " +Asignaturas[i]+" es de: " + Notas[i]);
		}
		}
		//Conectar las dos contenedoras con un ciclo
		
	}


