/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package netbeansprojects.introduccion;

//import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dmsgiordano
 */
public class Introduccion {   

    public static void main(String[] args) {
        
        // ========ENTRADA Y SALIDA POR CONSOLA ============
        //Scanner entrada = new Scanner(System.in);
     
        /* INGRESO DE NUMERO Y MUESTRA POR PANTALLA:
        int numero;
        
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        
         System.out.println("El numero es "+numero); */
        
        //COMO ALMACENAR UNA CADENA
        //String cadena;
        
        //System.out.println("Digite una cadena: ");
        //cadena = entrada.next(); // se puede guardar tmb con nextline
        
        // next guarda cadena hasta que encuentra un espacio. 
       // para eso sirve el nextline
        
        //System.out.println("la cadena es: "+cadena);
        
        //COMO ALMACENAR UN CARACTER: 
        /*
        System.out.println("Digite una LETRA: ");
        letra = entrada.next().charAt(0); --> lee solo un caracter
        */
        
          // ========ENTRADA Y SALIDA POR VENTANA EMERGENTE  ============  
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        // para la entrada de datos para almacenar
        cadena = JOptionPane.showInputDialog("Digite una cadena:");
        //transformarlo a un entero, ya qe todo me devuelve una cadena y entero es int    
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero:"));
        letra = JOptionPane.showInputDialog("Digite un caracter:").charAt(0);
        decimal =Double.parseDouble(JOptionPane.showInputDialog(args));
        
        
        // salida de datos
        JOptionPane.showMessageDialog(null, "la cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "el entero es: "+entero);
        JOptionPane.showMessageDialog(null, "el caracter es: "+letra);
        JOptionPane.showMessageDialog(null, "el decimal es: "+decimal);
        
        
        
  
        
       
       
    }
}
