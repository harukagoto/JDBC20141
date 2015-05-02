/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jdbc2014.Connexion;

/**
 *
 * @author harukagoto
 */
public abstract class Interf implements Initializable{

    Connexion maconnexion;
    private String FXMLRessource;
    public Parent root;
    public Stage stage;
    public Scene scene;
    
    @Override
   public void initialize(URL url, ResourceBundle rb) {
 
    }
    
     public Interf(String cheminFXML) throws IOException{
        
       
        if (cheminFXML != null && !cheminFXML.equals("")) {
            
            this.FXMLRessource = cheminFXML;
        }
 
        
        create_view();
        

     }
    
    private void create_view() throws IOException{
            
//            this.root= null;
//            
//            if (getClass().getResource(this.FXMLRessource) == null){
//
//                throw new Exception();
//            }

            System.out.println(this.FXMLRessource);
            System.out.println(getClass().getResource(this.FXMLRessource));
            
            this.root = FXMLLoader.load(getClass().getResource(this.FXMLRessource));

            this.scene = new Scene(this.root);

            this.stage = new Stage();

            this.stage.setScene(this.scene);

            this.stage.show();


    }
    
//    public void show() {
//        this.stage.show();
//    }
 
}
