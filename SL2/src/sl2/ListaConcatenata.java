
package sl2;

/**
 *
 * @author matteo.fusati
 */
public class ListaConcatenata<T> {
	private NodoConc<T> primo=null;
	private NodoConc<T> ultimo=null;
	
	public ListaConcatenata(T[] elementi){
		for(int i=0; i<elementi.length;i++){
			addHead(elementi[i]);
		}
	}
	
	public ListaConcatenata(){
		
	}
	public void addHead(T info){
		primo=new NodoConc(info, primo);
	}
	public void addTail(T info){
		NodoConc nodo=new NodoConc(info,null);
		ultimo.setNext(nodo);
		ultimo=nodo;
	}
	public void removeHead(){
		primo=primo.next;
	}
	public void removeTail(){
		NodoConc nuovo = primo;
            for (int i = 1; i < this.size() - 1; i++) {
                nuovo = nuovo.next;
            }
            ultimo = nuovo;
            ultimo.next = null;
	}
	public int size(){
		NodoConc n=primo;
		int i=1;
		while(n.getNext()!=null){
			i++;
			n=n.getNext();
		}
		return i;
	}
          public T get(int n) {
        if (this.size() > 0) {
            NodoConc<T> nuovo = primo;
            for (int i = 1; i < n; i++) {
                nuovo = nuovo.next;
            }
            return (T) nuovo.info;
        } else {
            return null;
        }
    }

    public void set(int n, T info) {
        if (this.size() > 0) {
            NodoConc<T> nuovo = primo;
            for (int i = 1; i < n; i++) {
                nuovo = nuovo.next;
            }
            nuovo.info = info;
        }
    }

    public void add(int n, T info) {
        NodoConc<T> nuovo = new NodoConc(info, null);
        if (this.size() > 0) {
            NodoConc<T> nuovo1 = primo;
            for (int i = 1; i < n; i++) {
                nuovo1 = nuovo1.next;
            }
            nuovo.next = nuovo1.next;
            nuovo1.next = nuovo;
        }
    }

    public void remove(int n) {
        if (this.size() > 0) {
            NodoConc<T> nuovo = primo;
            NodoConc<T> nuovo1 = new NodoConc<T>(null, null);
            for (int i = 1; i < n; i++) {
                nuovo = nuovo.next;
            }
            nuovo1 = nuovo.next;
            nuovo.next = nuovo1.next;
            
        }
	
}
}
