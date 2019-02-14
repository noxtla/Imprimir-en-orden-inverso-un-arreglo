package Arreglos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int numeros[] = new int [5];
		
		
		for (int i=0; i<5; i++) {
			
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
		}
		

		JOptionPane.showMessageDialog(null, "Mostrando");
		for (int i=4; i>0; i--) {
			System.out.println(numeros[i]);
		}
		

	}

}
