package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXMLDocumentController {

	@FXML
	private Text mytext;
	
	@FXML
	private Button bclose;
	
	public void initialize() {
		
	}
	
	public void ok(ActionEvent ae){
		 Stage stage = (Stage) bclose.getScene().getWindow();
		stage.close();
	}
	
	public void setData(String firstName){
		mytext.setText(firstName);
	}
	
}
