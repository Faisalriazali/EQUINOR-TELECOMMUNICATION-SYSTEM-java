
package telephoneconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class connection 
{
    Connection c;
    Statement st;
    void call()
    {
        try
        {
            //DataBase Connection
            //ODBC User DNS Name "con"
            //SQL Server UserNAme "sa"
            //SQL Server Password "123"
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            c=DriverManager.getConnection("JDBC:ODBC:con","sa","123");
            c=DriverManager.getConnection("jdbc:ucanaccess://..////src\\telephoneconnection\\telephone.accdb","sa","123");  
            st=c.createStatement();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

