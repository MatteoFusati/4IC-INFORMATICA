
package verifica;

/**
 *
 * @author Matteo
 */
public class PuntoMappa {
    private int Id;
    private String Name;
    private double Lat;
    private double Lon;

    public PuntoMappa(int stopId, String stopName, double stopLat, double stopLon) {
        this.Id = stopId;
        this.Name = stopName;
        this.Lat = stopLat;
        this.Lon = stopLon;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setLat(double Lat) {
        this.Lat = Lat;
    }

    public void setLon(double Lon) {
        this.Lon = Lon;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public double getLat() {
        return Lat;
    }

    public double getLon() {
        return Lon;
    }
    
    
}
