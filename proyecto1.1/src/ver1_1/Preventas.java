    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ver1_1;

/**
 *
 * @author Victor
 */
public class Preventas {
    int idPreventa;
    String nombrep;
    int ruta;
    
    public Preventas(int idPreventa, String nombre, int ruta) {
        this.idPreventa = idPreventa;
        this.nombrep = nombre;
        this.ruta = ruta;
    }

    public Preventas() {
    }
    
    public void setidPrev(int idPreventa)
    {
        this.idPreventa=idPreventa;
    }
    public void setNombre(String nombre)
    {
        this.nombrep=nombre;
    }
    public void setRuta(int ruta)
    {
        this.ruta=ruta;
    }
    public int getidPrev()
    {
        return this.idPreventa;
    }
    public String getNombre()
    {
        return this.nombrep;
    }
    public int getRuta()
    {
        return this.ruta;
    }
    String[] getRow() {
        String [] row = new String[3];
        row[0] = String.valueOf(idPreventa);
        row[1] = nombrep;
        row[2] = String.valueOf(ruta);
        return row;
    }
}
