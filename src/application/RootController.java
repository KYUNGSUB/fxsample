package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RootController implements Initializable {
	@FXML TextField inputVal;
	@FXML Button confirmBtn;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		confirmBtn.setOnAction(event -> System.out.println("입력 데이터 : " + inputVal.getText().toString()));
	}
}