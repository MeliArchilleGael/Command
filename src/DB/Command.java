




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Command {
        
        private int id_command;
        private int montant;
        private int id_client;
        private Timestamp date_command;
        
        public Command(){
                
        }
        
        /**
         * setteur 
         * @param id 
         */
        public void SetIdCommand(int id){
                this.id_command = id;
        }
        public void SetIdClient(int id){
                this.id_client = id;
        }
        public void SetMontant(int montant){
                this.montant = montant;
        }
        public void SetDate(Timestamp date_command){
                this.date_command = date_command;
        }
        
        /**
         * getteur
         * @return 
         */
        public int getIdCommand(){
                return this.id_command;
        }
        public int getIdClient(){
                return this.id_client;
        }
        public int getMontant(){
                return this.montant;
        }
        public Timestamp getCommandDate(){
                return this.date_command;
        }
        /**
         * save a new command in the database
         * @return 
         */
        public int genere(){
        
        int r = 0;
        Connection con = new DB_connection().getConnection();
        boolean trouver = false;
        try{
            String query = "SELECT id_command FROM COMMAND";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while(!trouver){
                r = (int)(Math.random()*((9999-1111)+1)) + 1111;
                rs.beforeFirst();
                while(rs.next()){
                    if(rs.getInt(1) != r){
                        trouver = true;
                        break;
                    }else{
                        trouver = false;
                    }
                } 
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erreur lors de la generation du numéro","ERREUR: #005",JOptionPane.ERROR_MESSAGE);
        }finally{
                try {
                        con.close();
                } catch (SQLException ex) {
                        Logger.getLogger(Command.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return r;
    }
    
        /**
         *
         * @return
         */
        public int save(){
                int status = 0;
                Connection con = new DB_connection().getConnection();
                String query = "INSERT INTO `db_command`.`command` (`Id_Command`, `Command_Date`, `Montant`, `Id_CLient`) "
                     + "VALUES ('"+this.id_command+"', CURRENT_TIMESTAMP, '"+this.montant+"', '"+this.id_client+"');";
                try {
                        Statement st = con.createStatement();
                        
                        if(!st.execute(query))
                                status = 1;
                        
                        System.out.println(query);
                }catch(Exception ex){
                        ex.printStackTrace();
                }finally{
                        try {
                                con.close();
                        } catch (SQLException ex) {
                                Logger.getLogger(Command.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                
                return status;
        }
        
        /**
         * read all the command of the database
         * @return 
         */
        public ArrayList<Command> read(){
                
                ArrayList<Command> array_command = new ArrayList();
                String query;
                query = "SELECT * FROM `command` ORDER BY `command`.`Command_Date` DESC";
                Connection con = new DB_connection().getConnection();
                Command c;
                try{
                      Statement st = con.createStatement();
                      ResultSet rs = st.executeQuery(query);
                      rs.beforeFirst();
                      while(rs.next()){
                             c = new Command();
                             c.SetDate(rs.getTimestamp("Command_date"));
                             c.SetIdClient(rs.getInt("Id_Command"));
                             c.SetMontant(rs.getInt("Montant"));
                             c.SetIdClient(rs.getInt("Id_Client"));
                             c.SetIdCommand(rs.getInt("Id_Command"));
                             array_command.add(c);
                      }
                        
                }catch(Exception ex){
                        ex.printStackTrace();
                }finally{
                        try {
                                con.close();
                        } catch (SQLException ex) {
                                Logger.getLogger(Command.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                
                return array_command;
        }
        
        /**
         * read the command that the id is given in parameter of the database
         * @param id_command
         * @return 
         */
        public Command read(int id_command){
              
                String query;
                query = "SELECT * FROM `command` WHERE id_command = "+id_command+" ORDER BY `command`.`Command_Date` DESC LIMIT 1";
                Connection con = new DB_connection().getConnection();
                Command c = new Command();
                try{
                      Statement st = con.createStatement();
                      ResultSet rs = st.executeQuery(query);
                      rs.beforeFirst();
                      while(rs.next()){
                             c.SetDate(rs.getTimestamp("Command_date"));
                             c.SetIdClient(rs.getInt("Id_Command"));
                             c.SetMontant(rs.getInt("Montant"));
                             c.SetIdClient(rs.getInt("Id_Client"));
                             c.SetIdCommand(rs.getInt("Id_Command"));
                      }
                        
                }catch(Exception ex){
                        ex.printStackTrace();
                }finally{
                        try {
                                con.close();
                        } catch (SQLException ex) {
                                Logger.getLogger(Command.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                
                return c;
        }
        
}
