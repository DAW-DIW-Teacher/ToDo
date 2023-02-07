package com.profesor.todo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class ListaTareas {
    private static ObservableList<Tarea> misTareas = FXCollections.observableArrayList();

    public ListaTareas() {
    }
    public void append (Tarea t) {
        misTareas.add(t);
    }
    public ObservableList<Tarea> getLista () {
        return misTareas;
    }

    public void cargarDatos() {
        misTareas.add(new Tarea(LocalDate.now(),"Primera Tarea", false));
        misTareas.add(new Tarea(LocalDate.now(),"Segunda Tarea", true));

    }

    @Override
    public String toString() {
        String output = "";

        for (Tarea t : misTareas) {
            output = t.toString();
        }
        return output;
    }
}
