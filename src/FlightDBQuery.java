
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syd
 */
public class FlightDBQuery {
    
    final String DB_URL = "jdbc:mysql://localhost:3306/airline_db";
    final String USER = "root";
    final String PASSWORD = "";
    
    
    
     public void loadTbl(String tableName,JTable myTable) throws SQLException{
        
        Object rowColumns[] = {"Flight No.","Departure","Arrival","Airport", "Duration", "Flight + Baggage"};
        DefaultTableModel model = new DefaultTableModel (rowColumns,0);
        
        Connection con = null;

        con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        String query = "select * from " + tableName;
         try {
            con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(query);
            String rowData [] = new String [6];
            while(rs.next()){
              
              
             
             
             
              
              
                rowData[0] =  rs.getString("flight_no");
                rowData[1] =  rs.getString("departure");
                rowData[2] =  rs.getString("arrival");
                rowData[3] =  rs.getString("airport");
                rowData[4] =  rs.getString("duration");
                rowData[5] = rs.getString("baggage");
                model.addRow(rowData);
            
            }
            
            state.close();
            rs.close();
            con.close();
            
           
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         myTable.setModel(model);
}
     
       public void noFlightsAvailable(){
           JOptionPane.showMessageDialog(null, "No Flights Available", "Warning",JOptionPane.PLAIN_MESSAGE);
       }
}
