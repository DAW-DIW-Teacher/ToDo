package com.profesor.todo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class TareaController implements Initializable {

    public ToggleButton btnNo;
    public ToggleButton btnSi;
    @FXML
    private TextField campoDescricion;

    @FXML
    private DatePicker campoFecha;

    @FXML
    void handleCerrar(ActionEvent event) {
        ((Stage)((Node)event.getSource()).getScene().getWindow()).close();
    }

    @FXML
    void handleCrearTarea(ActionEvent event) {

        boolean b = false;
        if (btnSi.isSelected()) {
            b = true;
        }

        Tarea t = new Tarea(campoFecha.getValue(),campoDescricion.getText(),b);
        Main.miLista.getLista().add(t);
        System.out.println(Main.miLista.getLista());
        ((Stage)((Node)event.getSource()).getScene().getWindow()).close();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ToggleGroup grupo = new ToggleGroup();
        btnNo.setToggleGroup(grupo);
        btnSi.setToggleGroup(grupo);

        campoFecha.setValue(LocalDate.now());

    }
}
