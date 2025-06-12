package com.api.gestion.tareas.repository;

import com.api.gestion.tareas.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
