/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DB_connection {
        private Connection con;
        
        DB_connection(){
                this.con = connect();
        }
        
        /**
         * get the connection to the database 
         * @return Connection con
         */
        public Connection getConnection(){
                return this.con;
        }
        
        /**
         * close the connection to the database 
         */
        public void Close_connection(){
                try {
                        this.con.close();
                } catch (SQLException ex) {
                        Logger.getLogger(DB_connection.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
        /**
         * connect to the database
         * @return 
         */
        public Connection connect(){
                Connection con = null;

                String urlPilote="com.mysql.jdbc.Driver";
                String urlBaseDonnees="jdbc:mysql://localhost:3306/db_command";//Chemin de connexion a la base
                try{
                    Class.forName(urlPilote);
                    System.out.println("Chargement du pilote de réussi");

                }catch(ClassNotFoundException ex){
                    System.out.println(ex);
                }
                try{
                    //connection 
                    con = DriverManager.getConnection(urlBaseDonnees,"root","");
                    if (con != null)
                       System.out.println("Connexion à la base de données réussi");
                    else {
                        System.out.println("Erreur lors de la connxion au servveur");
                        JOptionPane.showMessageDialog(null,"Erreur lors de la connxion au servveur \n Veillez vous assurez que vous avez les bons paramétre de connection","Erreur #OO1",JOptionPane.WARNING_MESSAGE);
                    }
                }catch(SQLException ex){
                    System.out.println(ex);
                    JOptionPane.showMessageDialog(null,"Erreur lors de la connxion au servveur. \n Veillez vous assurez que vous avez lancer le serveur"
                            + "\n si vous etez en local ou que vous avez une connection au serveur","Erreur #002",JOptionPane.WARNING_MESSAGE);
                }

                return con;
        }
}
