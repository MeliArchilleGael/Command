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
public class Command_has_article {
        
        private int id_command;
        private int id_article;
        private int quantity;
        
        public Command_has_article(){
                
        }
        
        public void SetIdCommand(int id){
                this.id_command = id;
        }
        public void SetIdArticle(int id){
                this.id_article = id;
        }
        public void SetQuantity(int qt){
                this.quantity = qt;
        }
        
        
        public int getIdCommand(){
                return this.id_command;
        }
        
        public int getIdArticle(){
                return this.id_article;
        }
        public int getQuantity(){
                return this.quantity;
        }
        
        /**
         * save to the database
         * @return 
         */
        public int save(){
                int status = 0;
                Connection con = new DB_connection().getConnection();
                String query = "INSERT INTO `db_command`.`command_has_article` (`Id_Command`, `Id_Article`, `Quantity`) "
                     + "VALUES ('"+this.id_command+"', '"+this.id_article+"', '"+this.quantity+"');";
                try{
                        Statement st = con.createStatement();
                        if (!st.execute(query))
                                status = 1;
                        
                }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"Error when try to save"," Error ",JOptionPane.ERROR_MESSAGE);
                        ex.printStackTrace();
                }finally{
                        try {
                                con.close();
                        } catch (SQLException ex) {
                                Logger.getLogger(Command_has_article.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                
                return status;
        }
        
        /***
         * return all the articles of the command that the id is give as a parameter
         * @param id_command
         * @return 
         */
        public ArrayList<Article> read_article(int id_command){
                
                ArrayList<Article>  array = new ArrayList();
                String query = "select * from article where id_article in ("
                                   + "select id_article from command_has_article where "
                                         + "id_command = "+id_command+")";
                Article a = new Article();
                Connection con = new DB_connection().getConnection();
                try {
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(query);
                        rs.beforeFirst();
                        
                        while(rs.next()){
                              a.SetId(rs.getInt("Id_Article"));
                              a.SetName(rs.getString("Name"));
                              a.SetUnitPrice(rs.getInt("Unit_Price"));
                              array.add(a);
                        }
                }catch(Exception ex){
                        ex.printStackTrace();
                }finally{
                        try {
                                con.close();
                        } catch (SQLException ex) {
                                Logger.getLogger(Command_has_article.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                return array;
        }
        
        /***
         * return all the articles of the command that the id is give as a parameter
         * @param id_command
         * @return 
         */
        public ArrayList<Object[]> read_command_info(int id_command){
                
                ArrayList<Object[]>  array = new ArrayList();
                String query = "SELECT * from article,command_has_article,command WHERE " +
                                        "article.Id_Article = command_has_article.Id_Article AND " +
                                        "command.Id_Command = command_has_article.Id_Command AND " +
                                        "command.Id_Command IN (SELECT id_command FROM command WHERE id_command = "+id_command +")";
                
                Connection con = new DB_connection().getConnection();
                try {
                        int i = 1;
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(query);
                        rs.beforeFirst();
                        
                        while(rs.next()){
                              Object[] a = {i++,rs.getString("Name"),rs.getString("unit_price"),rs.getString("quantity"),rs.getInt("quantity")*rs.getInt("unit_price")};
                              array.add(a);
                        }
                }catch(Exception ex){
                        ex.printStackTrace();
                }finally{
                        try {
                                con.close();
                        } catch (SQLException ex) {
                                Logger.getLogger(Command_has_article.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                return array;
        }
}
