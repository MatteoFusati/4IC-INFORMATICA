package verifica;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Matteo
 */
public class TestMappa {
     public static void main(String[] args) throws FileNotFoundException{
         Mappa map=new Mappa();
         map.load("stops.txt");
         Scanner input=new Scanner(System.in);
         System.out.print("Inserire latitudine: ");
         double lat=input.nextDouble();
         System.out.print("Inserire latitudine: ");
         double lon=input.nextDouble();
         System.out.println("Sei vicino a: "+Mappa.search(lat,lon).toString());
     }
}
