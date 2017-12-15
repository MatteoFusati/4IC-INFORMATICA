
package dizionario;

/**
 *
 * @author matteo.fusati
 */
public class Definizione implements Comparable{
	private String parola;
	private String significato;

	public Definizione(String parola, String definizione) {
		this.parola = parola;
		this.significato = definizione;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public void setSignificato(String significato) {
		this.significato = significato;
	}

	public String getParola() {
		return parola;
	}

	public String getSignificato() {
		return significato;
	}
	@Override
    public int compareTo(Object item){
        return this.parola.compareTo(((Definizione) item).getParola());
    }
	 @Override
    public String toString() {
        return parola + '\n' + significato;
    }
}
