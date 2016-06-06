package ver1_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Victor
 */
public class Conexion 
{
    static String nombre="listafin";
    static String user="root";
    static String pass="pincelin111";
    static String url="jdbc:mysql://localhost/"+nombre;
    Connection conexion = null;
    public Conexion()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection(url, user, pass);
            if(conexion!=null)
            {
                System.out.println("Conexion exitosa");
            }            
        } catch (SQLException e) {
            System.out.println("Error "+e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
    public Connection getConnection() {
        return conexion;
    }

    public void desconectar() {
        conexion = null;
    }
}