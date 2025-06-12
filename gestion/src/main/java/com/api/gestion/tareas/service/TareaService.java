package com.api.gestion.tareas.service;
import com.api.gestion.tareas.dto.TareaDto;
import java.util.List;

public interface TareaService {
    List<TareaDto> getAll();
    TareaDto getById(Long id);
    TareaDto create(TareaDto dto);
    TareaDto update(Long id, TareaDto dto);
    void delete(Long id);
}