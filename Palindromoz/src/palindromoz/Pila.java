/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromoz;

/**
 *
 * @author matteo.fusati
 */
public class Pila {
	private char[] stack;
	private int i=-1;
	private int n;

public Pila(int n){
	this.n=n;
	stack=new char[n];
}
public void push(char c){
	stack[++i]=c;
	
}
public char top(){
	return stack[i];
}
public char pop(){
	i--;
	return stack[i+1];
	}

public boolean isEmpty(){
	if(i==-1) return true;
	else return false;
}
public boolean isFull(){
	if(i==stack.length-1) return true;
	else return false;
}
}
