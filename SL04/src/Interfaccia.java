import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
/**
 *
 * @author matteo.fusati
 */
public class Interfaccia {
	Frame f;
	TextField item;
	Button push;
	Button pop;
	Label top;
	Label topp;
	Label isEmpty;
	Button inizio;
	Label corrente;
	Button seguente;
	
	Pila pila=new Pila();
	
	public Interfaccia(){
		f=new Frame();
		f.setVisible(true);
		f.setLayout(new GridLayout(5,3));
		f.setSize(500,500);
		
		push=new Button("push");
		pop=new Button("pop");
		inizio=new Button("<<");
		seguente=new Button(">");
		item=new TextField();
		top=new Label();
		top.setBackground(Color.LIGHT_GRAY);
		topp=new Label("TOP: ",1);
		topp.setBackground(Color.LIGHT_GRAY);
		isEmpty=new Label("isEmpty!",1);
		isEmpty.setBackground(Color.LIGHT_GRAY);
		corrente=new Label();
		
		
		f.add(new Label());
		f.add(item);
		f.add(push);
		f.add(topp);
		f.add(top);
		f.add(pop);
		f.add(isEmpty);
		f.add(new Label());
		f.add(new Label());
		f.add(new Label());
		f.add(new Label());
		f.add(new Label());
		f.add(inizio);
		f.add(corrente);
		f.add(seguente);
		
		push.addMouseListener(new Ascoltatore(this,pila));
		pop.addMouseListener(new Ascoltatore(this,pila));
		inizio.addMouseListener(new Ascoltatore(this,pila));
		seguente.addMouseListener(new Ascoltatore(this,pila));
		
		
	}
}
