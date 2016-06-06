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
public class Clientes {
    int idClientes;
    String nombrec; 
    String direccion;
    

    public Clientes(int idClientes, String nombrec, String direccion) {
        this.idClientes = idClientes;
        this.nombrec = nombrec;
        this.direccion = direccion;
    }

    public Clientes() {
    }
    
    public void setidClien(int idCliente)
    {
        this.idClientes=idCliente;
    }
    public void setNombrec(String nombrec)
    {
        this.nombrec=nombrec;
    }
    public void setDireccion(String direccion)
    {
        this.direccion=direccion;
    }
    public int getidClien()
    {
        return this.idClientes;
    }
    public String getNombrec()
    {
        return this.nombrec;
    }
    public String getDireccion()
    {
        return this.direccion;
    }
    String[] getRow() {
        String [] row = new String[3];
        row[0] = String.valueOf(idClientes);
        row[1] = nombrec;
        row[2] = direccion;
        return row;
    }
    
}
