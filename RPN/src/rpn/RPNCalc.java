package rpn;
import java.util.LinkedList;


/**
 *
 * @author Matteo
 */
public class RPNCalc {
    private static final String[] Operatori={ "+", "-", "*", "/" };
    
    public static boolean isOperatore(String token){
        for(String op : Operatori) {
            if(op.equals(token)) {
		return true;
	}
	}
		return false;
    }
    
    public static double operazioni(String op,double e1, double e2) {
        switch (op) {
            case "+":
                return e1 + e2;
            case "-":
                return e2 - e1;
            case "*":
                return e1 * e2;
            case "/":
                return e2 / e1;
            default:
                return 0.0;
        }
	}
    public static double Espression(String[] tokens){
        LinkedList<Double> stack=new LinkedList();
        for(String token:tokens){
            if(isOperatore(token)){
                stack.push(operazioni(token, stack.pop(), stack.pop())); 
                }
			else {
				stack.push(Double.parseDouble(token));
			}
		}
		return stack.pop();
	}
    
    
            
        
    }

