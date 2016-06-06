package ver1_1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ver1_1.Conexion;
import ver1_1.Preventas;
import ver1_1.Clientes;

/**
 *
 * @author Victor
 */
public class Agr {
   public void agregarPrev(Preventas preventa)
   {
       Conexion conec =new Conexion();
       try {
           Statement consulta= conec.getConnection().createStatement();
           String sql = "INSERT INTO preventas VALUES('" + preventa.idPreventa + "', '" + preventa.nombrep+ "', '" + preventa.ruta+  "')";
           consulta.executeUpdate(sql);
           //JOptionPane.showMessageDialog(null, "se agrego preventa");
           System.out.println("Se agrego preventa");
           consulta.close();
           conec.desconectar();
       } catch (SQLException ex) {
           
       }
        
   }
   
   public ArrayList <Preventas> obtenerPreventas()
   {
       ArrayList <Preventas> arrPrev=new ArrayList <>();
       Conexion conec=new Conexion();
       String sql = "SELECT * FROM preventas";
        try {
            PreparedStatement st = conec.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Preventas preventa = new Preventas(rs.getInt("idPreventas"),rs.getString("NombreP"), rs.getInt("Ruta") );
                arrPrev.add(preventa);
            }
            rs.close();
            st.close();
            conec.desconectar();

        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return arrPrev;
   }
   
   public void agregarClient(Clientes cliente)
   {
       Conexion conec =new Conexion();
       try {
           Statement consulta= conec.getConnection().createStatement();
           String sql = "INSERT INTO clientes VALUES('" + cliente.idClientes + "', '" + cliente.nombrec+ "', '" + cliente.direccion+  "')";
           consulta.executeUpdate(sql);
           //JOptionPane.showMessageDialog(null, "se agrego Cliente");
           System.out.println("Se agrego Cliente");
           consulta.close();
           conec.desconectar();
       } catch (SQLException ex) {
           
       }
        
   }
   
   public ArrayList <Clientes> obtenerClientes()
   {
       ArrayList <Clientes> arrClie=new ArrayList <>();
       Conexion conec=new Conexion();
       String sql = "SELECT * FROM clientes";
        try {
            PreparedStatement st = conec.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Clientes Cliente = new Clientes(rs.getInt("idClientes"),rs.getString("NombreC"), rs.getString("Direccion") );
                arrClie.add(Cliente);
            }
            rs.close();
            st.close();
            conec.desconectar();

        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return arrClie;
   }


    ArrayList<Producto> obtenerProductos() 
    {
        ArrayList <Producto> arrProd=new ArrayList <>();
       Conexion conec=new Conexion();
       String sql = "SELECT * FROM productos";
        try {
            PreparedStatement st = conec.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Producto produ = new Producto(rs.getInt("idProductos"),rs.getString("Nombre"), rs.getInt("Precio") );
                arrProd.add(produ);
            }
            rs.close();
            st.close();
            conec.desconectar();

        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return arrProd;
    }

    void agregarProducto(Producto produ) 
    {
    Conexion conec =new Conexion();
            try {
           Statement consulta= conec.getConnection().createStatement();
           String sql = "INSERT INTO productos VALUES('" + produ.idProducto + "', '" + produ.nombreP+ "', '" + produ.precio+  "')";
           consulta.executeUpdate(sql);
           //JOptionPane.showMessageDialog(null, "se agrego Cliente");
           System.out.println("Se agrego Producto");
           consulta.close();
           conec.desconectar();
       } catch (SQLException ex) {    
       }}
    
  

    ArrayList<Pedidos> obtenerPedidos() {
    ArrayList <Pedidos> arrPed=new ArrayList <>();
       Conexion conec=new Conexion();
       String sql = "SELECT * FROM ventas";
        try {
            PreparedStatement st = conec.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Pedidos pedid = new Pedidos(rs.getInt("idClientes"), rs.getInt("idProductos") );
                arrPed.add(pedid);
            }
            rs.close();
            st.close();
            conec.desconectar();

        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return arrPed;
    }

    void agregarPed(Pedidos ped) {
    Conexion conec =new Conexion();
            try {
           Statement consulta= conec.getConnection().createStatement();
           String sql = "INSERT INTO ventas VALUES('" + ped.idProducto + "', '" + ped.idCliente+ "')";
           consulta.executeUpdate(sql);
           //JOptionPane.showMessageDialog(null, "se agrego Cliente");
           System.out.println("Se agrego pedido");
           consulta.close();
           conec.desconectar();
       } catch (SQLException ex) {
           
       }
    }
}
