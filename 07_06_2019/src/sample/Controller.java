package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label label1;
    public TextField operand1;
    public TextField operand2;
    public Button butonAdunare;

    @FXML

    private void aduna () {
        int op1 = Integer.parseInt(operand1.getText());
        int op2 = Integer.parseInt(operand2.getText());
        int rezultat = op1 + op2;
        String deAfisat = String.valueOf(rezultat);

        label1.setText(deAfisat);
    }
}
