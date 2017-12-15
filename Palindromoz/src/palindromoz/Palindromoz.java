
package palindromoz;

import java.util.Scanner;

/**
 *
 * @author matteo.fusati
 */
public class Palindromoz {
public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Inserire la parola: ");
		String parola=in.nextLine();
		int dim=parola.length();
		boolean is = true;
		
		Pila pila=new Pila(dim);
		Coda coda=new Coda(dim);
		for(int i=0; i<dim; i++){
			pila.push(parola.charAt(i));
			coda.enQueue(parola.charAt(i));
			}
		
		for(int i=0;i<dim;i++){
			if(pila.pop() != coda.deQueue())
				is=false;
				break;
		}
		
		if(is) System.out.println("Palindroma");
		else System.out.println("Non Palindroma");
	}
	
}
