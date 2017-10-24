/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl2;

/**
 *
 * @author matteo.fusati
 */
public class NodoConc<T> {
	T info;
    NodoConc<T> next;
    
   NodoConc(T info,NodoConc<T> next){
       this.info=info;
       this.next=next;
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
