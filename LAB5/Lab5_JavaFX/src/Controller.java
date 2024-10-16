
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H_Kofi
 */
public class Controller {
    @FXML
    TextField nameTextField;
    @FXML
    TextField ageTextField;
    @FXML
    TextField emailTextField;
    public void submit(ActionEvent event){
        System.out.println("Submitted");
       String name=nameTextField.getText();
       String age=ageTextField.getText();
       String email=emailTextField.getText();
       Alert alert= new Alert(AlertType.INFORMATION);
       alert.setTitle("Submitted");
       alert.setHeaderText("Thank you");
      if(name.equals("")||age.equals("")||email.equals("")){alert.setContentText("Please provide input for all fields");
       
       }else
               
       alert.setContentText("Submitted Details: Name: "+name+" Age:"+age+" Email:"+email);
       alert.showAndWait();
    }
}
