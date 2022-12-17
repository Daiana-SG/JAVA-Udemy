// if
package condicionaes;

import java.util.Scanner;

public class condicionales{
	public static void main (String[] args){
	int numero, dato = 5;
	
	numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:");
	if(numero == dato){
		JOptionPane.showMessageDialog(null,"El numero es 5");
	}else{
		JOptionPane.showMessageDialog(null,"El numero es diferente");
	}
}

// switch
package condicionaes;

import java.util.Scanner;

public class condicionales{
	public static void main (String[] args){
	int dato;
	
	dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
	
	switch(dato){
		case 1:JOptionPane.showMessageDialog("El numero es 1");
				break;
		case 2:JOptionPane.showMessageDialog("El numero es 2");
				break;
		default: JOptionPane.showMessageDialog("El numero no esta contemplado");
				break;
				
	}

}

// operador ternario
package condicionaes;

import java.util.Scanner;

public class condicionales{
	public static void main (String[] args){
	int numero;
	String mensaje;
	
	numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
	
	mensaje = (numero %2 == 0) ? "Es par" : "Es impar";
	JOptionPane.showMessageDialog(null,mensaje);
	
	//JOptionPane.showMessageDialog(null,(numero %2 == 0) ? "Es par" : "Es impar");
	
	


}