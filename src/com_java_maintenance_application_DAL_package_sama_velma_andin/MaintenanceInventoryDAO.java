package com_java_maintenance_application_DAL_package_sama_velma_andin;

import com_java_maintenance_application_model_package_sama_velma_andin.MaintenanceInventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.lang.String;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MaintenanceInventoryDAO {
    
    public static Connection ConnectToDB() {
        
        final String url = "jdbc:mysql://sql11.freesqldatabase.com:3306/sql11404143";
        final String username = "sql11404143";
        final String password = "rcPCMzCbzh";
        
        try {
            System.out.println("Trying Connection");
            Connection conn = DriverManager.getConnection(url,username,password);
            return conn;
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
        return null;
               
    }
    
    public static ObservableList <MaintenanceInventory> getTableData2(){
        ObservableList<MaintenanceInventory> maintenanceList2 = FXCollections.observableArrayList();
        Connection conn = ConnectToDB();
        String sql = "SELECT * FROM inventorynewcars";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
            maintenanceList2.add(new MaintenanceInventory(
                            rs.getString("Car_Name"), 
                            rs.getString("Transmission"),
                            rs.getString("Color"), 
                            rs.getString("Seat"),
                            rs.getString("Quantity"), 
                            rs.getString("Price"),
                            rs.getString("Discount")));
            }
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return maintenanceList2;
    }
}
