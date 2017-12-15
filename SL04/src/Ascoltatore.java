
import java.awt.Button;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


/**
 *
 * @author matteo.fusati
 */
public class Ascoltatore implements MouseListener{
	
	Pila pila;
	Interfaccia f;
	
	public Ascoltatore(Interfaccia f,Pila p){
		this.pila=p;
		this.f=f;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		Button b=(Button)(e.getSource());
		switch(b.getLabel()){
			case "push": pila.push(f.item.getText());
			break;
			case "pop" : pila.pop();
			break;
			//case "<<" : 
			//case ">" :
		}
		if(pila.isEmpty()) {
			f.isEmpty.setVisible(true);
			f.top.setText("");
		} else{
			f.isEmpty.setVisible(false);
			f.top.setText((String)pila.top());
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}
