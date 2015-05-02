/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author harukagoto
 */
public class Interf_rechercherController extends Interf{
    
    @FXML
    private MenuButton choix;
    @FXML
    private MenuItem choix_emp;
    @FXML
    private MenuItem choix_cham;
    @FXML
    private TextArea afficher_champs;

    public Interf_rechercherController(String cheminFXML) throws IOException{
        super(cheminFXML);
    }

    /**
     * Initializes the controller class.
     */

    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }    

    @FXML
    private void Afficher_tab(ActionEvent event) {
        
        System.out.println(choix.getItems());
        
//        try {
//                ArrayList<String> liste;
//
//                // recuperer la liste des champs de la table
//                liste = maconnexion.remplirChampsTable();
//
//                // effacer les champs de la fenetre
//                listeDeChamps.removeAll();
//
//                // ajouter la liste des champs dans la fenetre
//                for (int i = 0; i < liste.size(); i++) {
//                    listeDeChamps.add(liste.get(i));
//                }
//
//                // se positionner sur le premier champ
//                listeDeChamps.select(0);
//            } catch (SQLException e) {
//                System.out.println("Echec SQL");
//                e.printStackTrace();
//            }
    }

  
}
