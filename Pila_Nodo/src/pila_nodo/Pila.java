/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_nodo;

/**
 *
 * @author Matteo
 */
public class Pila<T> {
    private NodoConc<T> pila;
    
    public Pila(){
        pila=null;
    }
    public boolean isEmpty(){
        return pila==null;
    }
    
    public void push(T info){
        pila= new NodoConc(info, pila);
    }
    
    public T top(){
        if(isEmpty()){
            return (T)("Pila vuota");}
        
        else{
            return pila.info;
           
        }
    }
    public T pop(){
        if(isEmpty()){
            return (T)("Pila vuota");
        }
        else {
            
            T testa=pila.info;
            pila=pila.next;
            return testa;
        }
    }
}
