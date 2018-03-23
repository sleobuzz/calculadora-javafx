/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 05015429223
 */
public class PrincipalController implements Initializable {

    
    @FXML
private TextField txtN1, txtN2, txtN3, txtResultado;
    
    @FXML
private Button btnSomar;
private Button btnSubstrair;
private Button btnDividir;
private Button btnMultiplicar;
   
    @FXML
    private Label lblN1, lblN2, lblN3;


    @FXML
    private void somar(ActionEvent event) {
     Double num1= Double.parseDouble(txtN1.getText());
     Double num2= Double.parseDouble(txtN2.getText());
     Double num3= Double.parseDouble(txtN3.getText());
     Double result;
     result = num1 + num2 + num3;
    txtResultado.setText(result.toString());
      //num2
     //  result = num1 + num2 + num3;
      
    }
    @FXML
    private void substrair(ActionEvent event) {
     Double num1= Double.parseDouble(txtN1.getText());
     Double num2= Double.parseDouble(txtN2.getText());
     Double num3= Double.parseDouble(txtN3.getText());
     Double result;
     result = num1 - num2 - num3;
    txtResultado.setText(result.toString());
  
    }
    @FXML
    private void dividir (ActionEvent event){
     Double num1= Double.parseDouble(txtN1.getText());
     Double num2= Double.parseDouble(txtN2.getText());
     Double num3= Double.parseDouble(txtN3.getText());
     Double result;
     result = num1 / num2 / num3;
    txtResultado.setText(result.toString());
  
    }
    @FXML
    private void multiplicar (ActionEvent event) {
     Double num1= Double.parseDouble(txtN1.getText());
     Double num2= Double.parseDouble(txtN2.getText());
     Double num3= Double.parseDouble(txtN3.getText());
     Double result;
     result = num1 * num2 * num3;
    txtResultado.setText(result.toString());
  
    }
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
