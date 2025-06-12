package com.api.gestion.tareas.repository;

import com.api.gestion.tareas.model.EstadoTarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoTareaRepository extends JpaRepository<EstadoTarea, String> {

}
