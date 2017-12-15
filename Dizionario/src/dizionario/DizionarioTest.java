
package dizionario;

import java.io.FileNotFoundException;

/**
 *
 * @author matteo.fusati
 */
public class DizionarioTest {
	public static void main(String[] args) throws FileNotFoundException {
		String nome="dictionary.csv";
		Dizionario dizionario=new Dizionario(nome);
		dizionario.load();
	}
	
}
