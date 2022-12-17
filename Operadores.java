package operadores;

import java.util.Scanner;

public class Operadores{
	public static void main (String[] args){
		Scaner entrada = new Scanner(System.in);
		floar num1, num2,suma,resta;
		
		System.out.print("Digite 2 numeros:");
		num1 = entrada.nextFloat();
		num2 = entrada.nextFloat();
		
		suma = num1+num2;
		System.out.println("La suma es: "+suma);
	}
}

// Se mantienen las combinaciones de Operadores += en JAVA

// y = x++ --> primero se asigna y luego se incrementa
// y = ++x --> primero se incrementa y luego se asigna

//Clase Math --> muchas operaciones matematicas que se pueden usar
package operadores;

import java.util.Scanner;

public class Operadores{
	public static void main (String[] args){
		double raiz = Math.sqrt(9);
		System.out.println(raiz);
		
	}
}

// para castear a double
package operadores;

import java.util.Scanner;

public class Operadores{
	public static void main (String[] args){
		int  raiz = (int)Math.sqrt(9);  // y asi todo el double, se van a transformar en enteros para poder ser almacenado en raiz
		System.out.println(raiz);
		
	}
}