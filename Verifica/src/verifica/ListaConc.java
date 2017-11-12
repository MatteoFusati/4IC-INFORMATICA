
package verifica;

/**
 *
 * @author Matteo
 */
public class ListaConc<T> {
    NodoConc first;
    public ListaConc(){}
    
    public void add(T item){
        if(first == null)
            first = new NodoConc(item, null);
        else{
            NodoConc n = first;
            while(n.getNext() != null)
                n = n.getNext();
            n.setNext(new NodoConc(item, null));
        }
    }
}
