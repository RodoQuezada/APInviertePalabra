
package inviertepalabra;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author rodo
 * Invierte frase utilizando interfaz Queue (Colas)
 */
public class InviertePalabra {

    Scanner teclado = new Scanner(System.in);
    private final Queue cola = new LinkedList();   
    String frase = " ", fraseInvertida= " ";

    public String InvierteFrase() {
        System.out.println("Ingrese frase: ");
        frase = teclado.nextLine(); 
        frase = frase.toLowerCase();
        char[] letras = frase.toCharArray();        
        for (int i = frase.length()-1; i >= 0; i--) {           
            cola.offer(letras[i]);
        }                                                    
        while (!cola.isEmpty()){
            fraseInvertida += cola.poll();
        }       
        return fraseInvertida;
    }

    public static void main(String[] args) {
        InviertePalabra invierte = new InviertePalabra();
        String frase;
        frase = invierte.InvierteFrase();
        System.out.println("Frase bien: "+frase);
    }

}
