package com.api.gestion.tareas.service;


import com.api.gestion.tareas.dto.TareaDto;
import com.api.gestion.tareas.exception.RecursoNoEncontradoException;
import com.api.gestion.tareas.model.EstadoTarea;
import com.api.gestion.tareas.model.Tarea;
import com.api.gestion.tareas.repository.EstadoTareaRepository;
import com.api.gestion.tareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TareaServiceImpl implements TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    @Autowired
    private EstadoTareaRepository estadoTareaRepository;

    @Override
    public List<TareaDto> getAll() {
        return tareaRepository.findAll().stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public TareaDto getById(Long id) {
        Tarea tarea = tareaRepository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException("Tarea con ID " + id + " no encontrada"));
        return toDto(tarea);
    }


    @Override
    public TareaDto create(TareaDto dto) {
        Tarea tarea = toEntity(dto);
        return toDto(tareaRepository.save(tarea));
    }

    @Override
    public TareaDto update(Long id, TareaDto dto) {
        Tarea tarea = tareaRepository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException("Tarea con ID " + id + " no encontrada"));

        tarea.setTitulo(dto.getTitulo());
        tarea.setDescripcion(dto.getDescripcion());

        EstadoTarea estado = estadoTareaRepository.findById(dto.getEstado())
                .orElseThrow(() -> new RecursoNoEncontradoException("Estado no encontrado: " + dto.getEstado()));
        tarea.setEstado(estado);

        tarea.setFechaVencimiento(dto.getFechaVencimiento());

        return toDto(tareaRepository.save(tarea));
    }

    @Override
    public void delete(Long id) {
        if (!tareaRepository.existsById(id)) {
            throw new RecursoNoEncontradoException("Tarea no encontrada");
        }
        tareaRepository.deleteById(id);
    }




    private TareaDto toDto(Tarea tarea) {
        TareaDto dto = new TareaDto();
        dto.setId(tarea.getId());
        dto.setTitulo(tarea.getTitulo());
        dto.setDescripcion(tarea.getDescripcion());
        dto.setEstado(tarea.getEstado() != null ? tarea.getEstado().getCodigo() : null);
        dto.setFechaVencimiento(tarea.getFechaVencimiento());
        return dto;
    }



    private Tarea toEntity(TareaDto dto) {
        Tarea tarea = new Tarea();
        tarea.setTitulo(dto.getTitulo());
        tarea.setDescripcion(dto.getDescripcion());

        EstadoTarea estado = estadoTareaRepository.findById(dto.getEstado())
                .orElseThrow(() -> new RecursoNoEncontradoException("Estado no encontrado: " + dto.getEstado()));
        tarea.setEstado(estado);

        tarea.setFechaVencimiento(dto.getFechaVencimiento());
        return tarea;
    }

}
