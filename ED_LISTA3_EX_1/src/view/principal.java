package view;
import controller.metodos;
import javax.swing.*;
public class principal {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

	   // Se o número for negativo, transforma em positivo
		  if(numero < 0) {
			   numero = numero * -1;
			  }

    	metodos c = new metodos();

	   int resultado = c.contarDigitos(numero);

	  JOptionPane.showMessageDialog(null,"Quantidade de dígitos: " + resultado);
	}
}
