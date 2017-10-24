/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_nodo;
import java.util.*;
/**
 *
 * @author Matteo
 */
public class Pila_Nodo {

    
    public static void main(String[] args) {
        int op;
        Object info;
        boolean exit=false;
        Pila pila=new Pila();
        Scanner input=new Scanner(System.in);
        System.out.println("Programma Pila!");
        System.out.println("Operazioni: \n -1 push per inserimento oggetto \n -2 per visualizzare elemento testa pila \n -3 per rimuovere l'elemento di testa \n -4 se si vuole controllare lo stato della pila \n -5 per terminare");
        System.out.print("Inserire numero operazione da eseguire: ");
        op=input.nextInt();
        while(!exit){
           switch(op){
               default: 
                        System.out.print("Inserire un numero valido: ");
                        op=input.nextInt();
                        break;
               case 1:  System.out.print("Inserire oggetto da aggiungere: ");
                        info=(Object)input.next();
                        pila.push(info);
                        System.out.println("Aggiunto elemento:"+info);
                        break;
               case 2:  System.out.println(pila.top());
               break;
               case 3:  System.out.println("Rimosso elemento:"+pila.pop());
               break;
               case 4:  if(pila.isEmpty()) System.out.println("Pila vuota!");
               else System.out.println("Pila non Vuota");
               break;
               case 5:  exit=true;
               break;
           }
           if(op!=5){
               System.out.print("Inserire numero operazione da eseguire: ");
               op=input.nextInt();
           }
           
           
           }            
        }
        
		
    }

    

