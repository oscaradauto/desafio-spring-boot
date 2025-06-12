package com.api.gestion.tareas.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "estado_tarea")
public class EstadoTarea {

    @Id
    private String codigo;

    private String descripcion;

    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<Tarea> tareas;


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }
}
