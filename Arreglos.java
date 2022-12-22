/* ARREGLOS 
Estructura de datos que almacena un conjutno de datos de un mismo tipo.
Su tamaño se declara al comienzo  y no se puede modificar.
-- Recordar que los espacios comienzan desde cero. 

Sintaxis:
TipoVariable[] NombreArray = new TipoVariable[dimension];

ejemplos:
-- se reserva los espacios en memoria
int[]edad= new inte[4];
boolean[]estado = new boolean[5];
Sting[]nombre= new String[2];
*/

/* Dar valores manualmente:
NombreArreglo[posicion] = valores
numeros[0]=5


int[]numeros={5,7,9}; -- se va asignando desde el 0 hasta el n-1 posiciones
*/
package arreglos;

public classs Arreglos{
	public static void main (String[] args){
		int[] numeros = new int[3];
		numeros[0]=5;
		numeros[1]=10;
		/*int[]numeros={5,10};*/
		
		for(int i=0; i<3;i++){
		System.out.println(numeros[i]);
		}
	
		
	}
}


/*EJEMPLO2 */
package arreglos;

public classs Arreglos{
	public static void main (String[] args){ 
		Scanner entrada = new Scanner(System.in);
		int nElementos;
		
		nElementos = Integer.paseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo");
		char[] letras = new char[nElmentos];
		
		System.out.println("Digite los elementos del arreglo:");
		for(int i=0; i<nElementos;i++){
			System.out.println((i+1)+".Digite un caracter:");
			letras[i]=entrada.next().charAt();
		}
		
		System.out.println("Lo caracteres son:");	
		for(int i=0; i<nElementos;i++){
		System.out.println(letras[i]);
		}			
		
		
	}
}	

/*BUCLE FOREACH
y asi te olvidas de la cantidad de elementos que tengas*/

public classs Arreglos{
	public static void main (String[] args){ 
	String[] nombres = {"Luisa","Maria","Camila"};
	/*
		for(int i=0; i<nombres.lenght;i++){
		System.out.println(nombres[i]);*/
		
		for(String i:nombres){
		System.out.println("Nombres:"+i);
		}
	}
}	
	