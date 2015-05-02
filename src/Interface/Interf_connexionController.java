/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import jdbc2014.Connexion;

/**
 * FXML Controller class
 *
 * @author harukagoto
 */
public class Interf_connexionController extends Interf {
    @FXML
    private Button connect;
    @FXML
    private PasswordField passwdECE;
    @FXML
    private TextField loginECE;
    @FXML
    private PasswordField passwdBDD;
    @FXML
    private TextField loginBDD;
    
    //Connexion maconnexion;

    public Interf_connexionController(String cheminFXML) throws IOException{
        super(cheminFXML);
    }
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void create_connexion(ActionEvent event) {
        

            try {
                try {
                    // tentative de connexion si les 4 attributs sont remplis
                    maconnexion = new Connexion(loginECE.getText(), passwdECE.getText(),
                            loginBDD.getText(), passwdBDD.getText());
                    Interf_menuController page_menu;
                } catch (ClassNotFoundException cnfe) {
                    System.out.println("Connexion echouee : probleme de classe");
                    cnfe.printStackTrace();
                }
            } catch (SQLException e) {
                System.out.println("Connexion echouee : probleme SQL");
                e.printStackTrace();
            }
    }

   
}
