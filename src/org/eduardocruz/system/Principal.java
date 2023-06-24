/*

 */
package org.eduardocruz.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CalculadoraView.fxml"));
        
        Scene escena = new Scene(root);
        
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
