/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;
import java.sql.*;

/**
 *
 * @author agali
 */
public class Connection {
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("org.postgresql.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","admin","admin");

        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }

    PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
