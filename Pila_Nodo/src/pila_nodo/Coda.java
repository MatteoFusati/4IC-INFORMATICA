/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_nodo;

/**
 *
 * @author matteo.fusati
 */
public class Coda<T> {
	private NodoConc<T> primo;
	private NodoConc<T> ultimo;
	private int n=0;
	public Coda(){
		primo=null;
		ultimo=null;
		}
	public boolean  isEmpty(){
		return primo==null;
	}
	public T front(){
		return primo.info;
	}
	public void enqueue(T info){
		if(n==0){
			NodoConc<T> nuovo=new NodoConc(info, null);
			primo=ultimo=nuovo;
			n++;		
		}
		else{
			NodoConc<T> nuovo=new NodoConc(info, null);
			if(n==1) primo.next=nuovo;
			ultimo.next=nuovo;
			ultimo=nuovo;
		}
	}
	public T dequeue(){
		if(n>=0){
			T ritorno=(T)primo.info;
			primo=primo.next;
			return ritorno;
		}
		else{
			return (T)("Coda Vuota!");
		}
	}
		
	}
	
	

