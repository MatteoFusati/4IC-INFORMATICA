
package verifica;

/**
 *
 * @author Matteo
 */
public class NodoConc<T> {
    public T info;     
    public NodoConc<T> next;   

    //costruttore
    public NodoConc(T info, NodoConc<T> next) {
        this.info = info;
        this.next = next;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public void setNext(NodoConc<T> next) {
        this.next = next;
    }

    public T getInfo() {
        return info;
    }

    public NodoConc<T> getNext() {
        return next;
    }
    
}
