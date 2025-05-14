
package clases;

/**
 *
 * @author ADMIN
 */
import java.sql.*;
public class ConexionBs {
    //conexion al a base
    public static Connection conectarb(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdv", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local " +e);
        }
        return(null);
    }
}
