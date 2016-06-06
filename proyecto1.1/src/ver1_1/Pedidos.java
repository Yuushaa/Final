/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ver1_1;


class Pedidos {
    int idCliente, idProducto;

    public Pedidos(int idCliente, int idProducto) {
        this.idCliente = idCliente;
        this.idProducto = idProducto;
    }

    Pedidos() {}
    
public void setidClien(int idCliente)
    {
        this.idCliente=idCliente;
    }
public void setidProd(int idProducto)
    {
        this.idProducto=idProducto;
    }
public int getidClien(int idCliente)
    {
        return this.idCliente;
    }
public int getidProd(int idProducto)
    {
        return this.idProducto;
    }
     String[] getRow() {
        String [] row = new String[2];
        row[0] = String.valueOf(idCliente);
        row[1] = String.valueOf(idProducto);
        return row;
     }
}
