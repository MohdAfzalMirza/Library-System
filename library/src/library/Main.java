
package library;
import java.sql.*;
public class Main
{
    void func()
     {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           String Url = "jdbc:mysql://localhost/library?"+"user=root&password=pass";
           Connection con = DriverManager.getConnection(Url);
           System.out.println("Connected...");
        }
        catch(Exception e)
        {
            System.out.println("Failed..."+e);
        }
       }

    public static void main(String[] args)
    {
        Main db = new Main();
        db.func();
    }

}
