/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 *  
 */
public class insertion_updation_deletion {
    public static void setData(String query,String msg)
    {
       Connection con = null;
       Statement st = null;
       try
       {
            con=connection.getCon();
            st = con.createStatement();
            st.executeUpdate(query);
            if(!msg.equals(""))
            {
                JOptionPane.showMessageDialog(null, msg);
            }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
       finally
              {
                    try
       {
           
       }
       catch(Exception e)
       {
           
       }
                   
               }
    }
}