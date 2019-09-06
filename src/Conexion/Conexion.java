package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexion {

    public static Connection conn = null;
 
    static String dbms = "oracle";
    static String server = "localhost";
    static String bd = "prueba";//
    static String user = "postgres";
    static String pass = "123";
    static String puerto = "5454"; //5432
    static String driver = "org.postgresql.Driver";
    static String url = "jdbc:postgresql://" + server + ":" + puerto + "/" + bd;

    public static Connection ConectarOracle() {
        try {
            
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e.getMessage());
        }
         return conn;
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


//*****************************************************
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
       public static  Connection ConectarOracle()
            {
                try
                    {
                        Class.forName("oracle.jdbc.OracleDriver");
                        String myDB="jdbc:oracle:thin:@localhost:1521:XE";
                        String usuario="prueba";
                        String password="123";
                        Connection conn = DriverManager.getConnection(myDB,usuario,password);
                        return conn;
                        
                    }
                catch(SQLException ex)
                        {
                            System.out.println(ex.getMessage());
                            System.out.println("no usbo coneccion");
                        }
                catch (ClassNotFoundException ex) {
                     Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                      System.out.println("teenrmos erros");
                     }

                    return null;
                
                
            }
    
}

*/
