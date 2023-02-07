package com.profesor.todo;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class mainController implements Initializable {

    @FXML
    private TableView<Tarea> tablaTareas;

    @FXML
    private TableColumn<Tarea, String> colDescripcion;

    @FXML
    private TableColumn<Tarea, CheckBox> colEstado;

    @FXML
    private TableColumn<Tarea, LocalDate> colFecha;

    @FXML
    void handleCerrar(ActionEvent event) {
        Platform.exit();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colFecha.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        colDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        colEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
        tablaTareas.setItems(Main.miLista.getLista());

    }

    public void handleCrearTarea(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("tareaView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Crear Tarea");
            stage.setScene(scene);
            stage.showAndWait();
        } catch (Exception e) {
            System.out.println("Error al cargar la vista Crear tarea");
        }
    }
    
    public void handleModificar(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("tareaView2.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Modificar Tarea");
            stage.setScene(scene);
            stage.showAndWait();
        } catch (Exception e) {
            System.out.println("Error al cargar la vista Modificar tarea");
        }
    }
}
