/*
ciclo While

while (condition){
    instrucciones
}
*/
// chequea la info antes de ejecutar

package ciclos;
    public class Ciclos{
        public static void main (String[] args){
            int i=1;
            while (i<=10){
                System.out.println(i);
                i++;
            }
        }
                
    }
/*
ciclo do While

 do {instrucciones}
 while (condition)
*/
//ejecuta por lo menos una vez y luego chequea la info.

package ciclos;
    public class Ciclos{
        public static void main (String[] args){

            int i=1;
			
			do{
				System.out.println(i);
                i++;
			}
            while (i<=10);
        }
                
    }	
/*
ciclo for
for (inicializacion; condicion; aumento o decremento ){
	instrucciones
}
*/

package ciclos;
    public class Ciclos{
        public static void main (String[] args){
			
		  Scanner entrada = new Scanne(System.in);
          int contador;
		  System.out.print("Digite cantidad de terminos:");
		  contador = entrada.nextInt();
		  
			for(int i = 2;i<contador;i+=2){
			System.out.println(i);
				}
		
        }
                
}
