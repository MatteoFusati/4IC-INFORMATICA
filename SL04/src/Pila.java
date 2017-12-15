
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matteo.fusati
 */
public class Pila /*implements Iterable*/{
    int pushcall = 0;
    Nodo testa;

    public void push(Object elem) {
        Nodo y = new Nodo(elem, null);
        if (pushcall == 0) {
            testa = y;
            pushcall++;
        } else {
            y.next = testa;
            testa = y;
            pushcall++;
        }
    }

    public Object top() {
        return testa.info;
    }

    public Object pop() {
        if (pushcall > 0) {
            Object elem = top();
            testa = testa.next;
            pushcall--;
            return elem;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return pushcall == 0;
    }
	
/*	public Iterator iterator(){
		return new Iterator(){
			
        };
	}*/
}

