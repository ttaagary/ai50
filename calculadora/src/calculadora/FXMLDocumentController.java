/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;


/**
 *
 * @author usuario
 */
public class FXMLDocumentController implements Initializable {
   
    @FXML
    private GridPane vBox;
    @FXML
    private GridPane gridPane;
    @FXML
    private AnchorPane calculadora;
    @FXML
    private GridPane abajo;
    @FXML
    private TextField resultado;
    @FXML
    private Button ac;
    @FXML
    private Button masmen;
    @FXML
    private Button porcent;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        String css = this.getClass().getResource("estilocalculadora.css").toExternalForm();
        calculadora.getStylesheets().add(css);
        resultado.setText("0");
    }    
    
}

    