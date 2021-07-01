/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author user
 */
public class SnakePredictController implements Initializable {

    @FXML
    private TextField jenisKelaminTextField;
    @FXML
    private TextField kedalamanAlatTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void PrediksiButton(ActionEvent event) {
        double kedalamanAlat = Double.parseDouble (kedalamanAlatTextField.getText());
        
        String jenisKelamin;
        if (kedalamanAlat >= 4 && kedalamanAlat <= 100){
            jenisKelamin = "Jantan";
        }else if(kedalamanAlat >= 1 && kedalamanAlat <= 3){
            jenisKelamin = "Betina";
        }else {
            jenisKelamin = "Unsex"; 
        }
        jenisKelaminTextField.setText(jenisKelamin);
    }
    
}
