
package dizionario;

import java.io.*;
import java.util.*;

/**
 *
 * @author matteo.fusati
 */
public class Dizionario {
	private BinarySearchTree albero=new BinarySearchTree();
	private final String inFile;
	private final int lettera=1;
	private final int significato=5;
	
	public Dizionario(String inFile){
		this.inFile=inFile;
	}
	
	public void load() throws FileNotFoundException{
		File file=new File(inFile);
		Scanner in=new Scanner(file);
		while(in.hasNextLine()){
		String[] linee=in.nextLine().split("\"");
		albero.add((new Definizione(linee[lettera],linee[significato])));
		}
		}
		
}
