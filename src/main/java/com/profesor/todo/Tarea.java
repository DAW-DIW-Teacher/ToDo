package com.profesor.todo;

import javafx.scene.control.CheckBox;

import java.time.LocalDate;

public class Tarea {
    private LocalDate fecha;
    private String descripcion;
    private CheckBox estado = new CheckBox();

    public Tarea (){
        fecha = LocalDate.now();
        descripcion = "";
        estado.setSelected(false);
    }

    public Tarea(LocalDate fecha, String descripcion, Boolean estado) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado.setSelected(estado);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CheckBox getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado.setSelected(estado);
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                '}';
    }
}
