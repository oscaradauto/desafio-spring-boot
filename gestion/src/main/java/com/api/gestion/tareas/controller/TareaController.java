package com.api.gestion.tareas.controller;

import com.api.gestion.tareas.dto.TareaDto;
import com.api.gestion.tareas.service.TareaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/tareas")
public class TareaController {

    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping
    public ResponseEntity<List<TareaDto>> getTareas() {
        return ResponseEntity.ok(tareaService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TareaDto> getTareaById(@PathVariable Long id) {
        return ResponseEntity.ok(tareaService.getById(id));
    }

    @PostMapping
    public ResponseEntity<TareaDto> createTarea(@RequestBody TareaDto tareaDto) {
        return ResponseEntity.status(201).body(tareaService.create(tareaDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TareaDto> updateTarea(@PathVariable Long id, @RequestBody TareaDto tareaDto) {
        return ResponseEntity.ok(tareaService.update(id, tareaDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTarea(@PathVariable Long id) {
        tareaService.delete(id);
        return ResponseEntity.ok("Tarea " + id + " eliminada satisfactoriamente.");
    }
}
