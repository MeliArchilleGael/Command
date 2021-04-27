/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class Client {
        
        private int id;
        private String Name;
        private String Location;
        private String telephone;
        
        public Client(){
                
        }
        
        //getteur
        public int getId(){
                return this.id;
        }
        public String getName(){
                return this.Name;
        }
        public String getLocation(){
                return this.Location;
        }
        
        public String getTelephone(){
                return this.telephone;
        }
        
       //setteur
        public void SetName(String Name){
                this.Name = Name;
        }
        public void SetLocation(String Location){
                this.Location = Location;
        }
        public void SetId(int id){
                this.id = id;
        }
        public void SetTelephone(String telephone){
                this.telephone = telephone;
        }
        
        /**
         * 
         * @return status
         * return the status of the query
         * 1 if succes
         * 0 if not 
         */
        public int Save(){
                int status = 0;
                Connection con= new DB_connection().getConnection();
                try{
                        
                         String query = "INSERT INTO `db_command`.`client` (`Id_CLient`, `Name`, `Location`,`telephone`) "
                           + "VALUES (NULL, '"+this.Name+"', '"+this.Location+"', '"+this.telephone+"');";
                      Statement st = con.createStatement();
                      if(!st.execute(query))
                              status = 1;
                      
                } catch(Exception ex){
                        System.out.println(ex.getMessage());
                }
                finally{
                        try {
                                con.close();
                        } catch (SQLException ex) {
                                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                return status;
        }
        
        /**
         * return the list of all the client
         * @return 
         */
        public ArrayList<Client> Read_client(){
                
                ArrayList<Client> array_client = new ArrayList();
                String query = "SELECT * FROM client";
                Connection con = new DB_connection().getConnection();
                try{
                       Client c ;
                       Statement st = con.createStatement();
                       ResultSet rs = st.executeQuery(query);
                       rs.beforeFirst();
                       while(rs.next()){
                               c = new Client();
                               c.SetId(rs.getInt("Id_Client"));
                               c.SetLocation(rs.getString("Location"));
                               c.SetName(rs.getString("Name"));
                               array_client.add(c);
                       }
                       
                }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"Exception during the reading of data. \n Exception: "
                             + ""+ex,"Error #004",JOptionPane.ERROR_MESSAGE);  
                        System.out.println(ex.getMessage());
                }finally{
                        try {
                                con.close();
                        } catch (SQLException ex) {
                                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                
                return array_client;
        }
        
        /**
         *
         * @param id_client
         * @return
         */
        public Client Read_client(int id_client){
                
                String query = "SELECT * FROM client WHERE id_client = "+id_client+"";
                Connection con = new DB_connection().getConnection();
                Client c = new Client();
                try{
                       Statement st = con.createStatement();
                       ResultSet rs = st.executeQuery(query);
                       rs.beforeFirst();
                       while(rs.next()){
                               c = new Client();
                               c.SetId(rs.getInt("Id_Client"));
                               c.SetLocation(rs.getString("Location"));
                               c.SetName(rs.getString("Name"));
                               c.SetTelephone(rs.getString("Telephone"));
                        }
                       
                }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"Exception during the reading of data. \n Exception: "
                             + ""+ex,"Error #005",JOptionPane.ERROR_MESSAGE);  
                        System.out.println(ex.getMessage());
                }finally{
                        try {
                                con.close();
                        } catch (SQLException ex) {
                                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                
                return c;
        }
        
}
