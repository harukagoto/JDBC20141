/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.io.IOException;
import javafx.application.Application;

/**
 *
 * @author harukagoto
 */
public abstract class Interf_controller extends Application {
    
    public static void main (String[] args) throws IOException{
        //launch(args);
        
        Interf conn;
        conn = new Interf_connexionController("Interf_connexion.fxml");
        
}

}
