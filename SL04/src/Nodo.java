/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matteo.fusati
 */
public class Nodo {
	Object info;
    Nodo next;

    public Nodo(Object info, Nodo next) {
        this.info = info;
        this.next = next;
    }
}
