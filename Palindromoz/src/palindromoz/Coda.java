
package palindromoz;

/**
 *
 * @author matteo.fusati
 */
public class Coda {
	private char[] queue;
	private int i=-1;
	
public Coda(int n){
	this.queue=new char[n];
}
public void enQueue(char c){
	
	queue[++i]=c;
}
public char front(){
	return queue[0];
}
public char deQueue(){
	char c=queue[0];
	for(int j=0; j<i; j++){
		queue[j]=queue[j+1];
	}
	i--;
	return c;
	
}
public boolean isEmpty(){
	if(i==-1) return true;
	else return false;
}
public boolean isFull(){
	if(i==queue.length-1) return true;
	else return false;
}

}
