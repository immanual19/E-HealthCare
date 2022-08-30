/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author emma
 */
public class databaseTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            // com.mysql.jdbc.Driver
            Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","immanual");
            //System.out.println("connected Successfully.");
            Statement myStmt=myConn.createStatement();
            ResultSet myRs=myStmt.executeQuery("select * from Persons");
            while(myRs.next())
            {
                System.out.println(myRs.getString("FirstName")+", "+myRs.getString("LastName"));
            }
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    }
    
    
}
