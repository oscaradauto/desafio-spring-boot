package com.api.gestion.tareas.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RecursoNoEncontradoException.class)
    public ResponseEntity<?> handleRecursoNoEncontrado(RecursoNoEncontradoException ex) {
        Map<String, Object> error = new HashMap<>();
        error.put("timestamp", Instant.now());
        error.put("status", 404);
        error.put("error", "Recurso no encontrado");
        error.put("message", ex.getMessage());
        return ResponseEntity.status(404).body(error);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleRuntime(RuntimeException ex) {
        Map<String, Object> error = new HashMap<>();
        error.put("timestamp", Instant.now());
        error.put("status", 500);
        error.put("error", "Error interno del servidor");
        error.put("message", ex.getMessage());
        return ResponseEntity.status(500).body(error);
    }
}
