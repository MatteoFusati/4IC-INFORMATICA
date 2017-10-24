/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpn;

/**
 *
 * @author Matteo
 */
public class NodoConc<T> {
    T info;
    NodoConc<T> next;
    
   NodoConc(T info,NodoConc<T> next){
       this.info=info;
       this.next=next;
   }
}
