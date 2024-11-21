package br.edu.ifba.saj.ads.poo;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML
    private DatePicker dtNacimento;

    @FXML
    private TextArea txEndereco;

    @FXML
    private TextField txNome;

    @FXML
    private void switchToSecondary() throws IOException {
        new Alert(AlertType.INFORMATION, 
                "Cadastrando Cliente \nNome :"+txNome.getText() + "\nNasciemnto: " + dtNacimento.getValue() + "\nEndereço: " + txEndereco.getText()
                ).showAndWait();
        App.setRoot("secondary");
    }
}
