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

/**
 *
 * @author user
 */
public class Article {
        
        private int Id;
        private String Name;
        private int Unit_price;
        
        public Article(){
                
        }
        
        /**
         * 
         * @param Id 
         */
        public void SetId(int Id){
                this.Id = Id;
        }
        public void SetUnitPrice(int up){
                this.Unit_price = up;
        }
        public void SetName(String Name){
                this.Name = Name;
        }
        
        /**
         * setteur
         * @return 
         */
        public int getId(){
                return this.Id;
        }
        public int getUnitPrice(){
                return this.Unit_price;
        }
        public String getName(){
                return this.Name;
        }
        /**
         * save a new article in the database 
         * 1 if it succes 
         * 0 if not 
         * @return 
         */
        public int save(){
                int status = 0;
                Connection con = new DB_connection().getConnection();
                try{
                        String query = "INSERT INTO `db_command`.`article` (`Id_Article`, `Name`, `Unit_Price`) "
                             + "VALUES (NULL, '"+this.Name+"', '"+this.Unit_price+"');";
                        Statement st = con.createStatement();
                        if (!st.execute(query))
                                status = 1;
                }catch(Exception ex){
                        ex.printStackTrace();
                }
                finally{
                        try {
                                con.close();
                        } catch (SQLException ex) {
                                Logger.getLogger(Article.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                
                
                return status;
        }
        
        public ArrayList<Article> Read_Article(){
                
                ArrayList<Article> array_article = new ArrayList();
                Connection con = new DB_connection().getConnection();
                String query = "SELECT * FROM ARTICLE";
                Article a ;
                try{
                        
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(query);
                        rs.beforeFirst();
                        while(rs.next()){
                                a = new Article();
                                a.SetId(rs.getInt("Id_Article"));
                                a.SetName(rs.getString("Name"));
                                a.SetUnitPrice(rs.getInt("Unit_Price"));
                                array_article.add(a);
                        }
                        
                }catch(Exception ex){
                        ex.printStackTrace();
                }finally{
                        try {
                                con.close();
                        } catch (SQLException ex) {
                                Logger.getLogger(Article.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                
                /**
                 for (Article b: array_article)
                        System.out.println(b.getName());
                        
                **/
                
                return array_article;  
        }
}
