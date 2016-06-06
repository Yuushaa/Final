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
class Producto {
    int idProducto;
    String nombreP; 
    int precio;

    Producto(int idProducto, String nombreP, int precio) {
        this.idProducto = idProducto;
        this.nombreP = nombreP;
        this.precio = precio;
    }

    Producto() 
    {}

    
    
    public void setidProd(int idProd)
    {
        this.idProducto=idProd;
    }
    public void setNombreP(String nombreP)
    {
        this.nombreP=nombreP;
    }
    public void setPrecio(int precio)
    {
        this.precio=precio;
    }
    public int getidProdu()
    {
        return this.idProducto;
    }
    public String getNombreP()
    {
        return this.nombreP;
    }
    public int getPrecio()
    {
        return this.precio;
    }
    String[] getRow() {
        String [] row = new String[3];
        row[0] = String.valueOf(idProducto);
        row[1] = nombreP;
        row[2] = String.valueOf(precio);
        return row;
    }
    
    
}
