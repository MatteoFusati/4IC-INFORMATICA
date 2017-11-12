
package verifica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Matteo
 */
public class Mappa {
    private ListaConc lista;
    private static String[] line;
    public Mappa(){
        ListaConc lista=new ListaConc();
    }
    public void load(String inFile) throws FileNotFoundException{
        lista = new ListaConc();
            Scanner in = new Scanner(new File(inFile));
            while(in.hasNextLine()){
                String[] line = in.nextLine().split(",");
                try {
                    lista.add(new PuntoMappa(Integer.parseInt(line[0]), line[2], Double.parseDouble(line[4]), Double.parseDouble(line[5])));
                } catch (NumberFormatException e) {}
            }
    }
     public static PuntoMappa search(double latitude, double longitude){
        PuntoMappa nearest = null;
        double dist = Double.MAX_VALUE;
        for (Object s : line) {
            double newDist = Math.sqrt(Math.pow(((PuntoMappa) s).getLat() - latitude, 2) + Math.pow(((PuntoMappa) s).getLon() - longitude, 2));
            if( newDist < dist) {
                dist = newDist;
                nearest = (PuntoMappa) s;
            }
        }
        return nearest;
    }
}
