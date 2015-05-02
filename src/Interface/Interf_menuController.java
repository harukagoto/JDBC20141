/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author harukagoto
 */

public class Interf_menuController implements Initializable{
//public class Interf_menuController extends Interf{
    @FXML
    private Button button_modif;
    @FXML
    private Button button_search;
    @FXML
    private Button button_report;
    @FXML
    private Button deconnect;

//    public Interf_menuController(String cheminFXML) throws IOException{
//        super(cheminFXML);
//    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void create_modif(ActionEvent event) {
        System.out.println("modifier");
    }

    @FXML
    private void create_search(ActionEvent event) {
        System.out.println("rechercher");
    }

    @FXML
    private void create_reporting(ActionEvent event) {
        System.out.println("reporting");
    }
    
}
