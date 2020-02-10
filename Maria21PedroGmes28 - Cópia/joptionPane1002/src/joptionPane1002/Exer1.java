package joptionPane1002;

import javax.swing.JOptionPane;

public class Exer1 {
	public static void main (String[]args){
		int n1,n2,soma;
		
		n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1:"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2:"));
		
		soma=n1+n2;
		JOptionPane.showMessageDialog(null, "resultado: "+soma);
		
	}
}
