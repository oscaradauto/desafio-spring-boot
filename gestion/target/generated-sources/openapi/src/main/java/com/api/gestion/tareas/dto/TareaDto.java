package com.api.gestion.tareas.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TareaDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-12T11:17:41.456015100-05:00[America/Bogota]", comments = "Generator version: 7.6.0")
public class TareaDto {

  private Long id;

  private String titulo;

  private String descripcion;

  private String estado;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate fechaVencimiento;

  public TareaDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TareaDto titulo(String titulo) {
    this.titulo = titulo;
    return this;
  }

  /**
   * Get titulo
   * @return titulo
  */
  
  @Schema(name = "titulo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("titulo")
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public TareaDto descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  /**
   * Get descripcion
   * @return descripcion
  */
  
  @Schema(name = "descripcion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("descripcion")
  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public TareaDto estado(String estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Get estado
   * @return estado
  */
  
  @Schema(name = "estado", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estado")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public TareaDto fechaVencimiento(LocalDate fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
    return this;
  }

  /**
   * Get fechaVencimiento
   * @return fechaVencimiento
  */
  @Valid 
  @Schema(name = "fechaVencimiento", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fechaVencimiento")
  public LocalDate getFechaVencimiento() {
    return fechaVencimiento;
  }

  public void setFechaVencimiento(LocalDate fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TareaDto tareaDto = (TareaDto) o;
    return Objects.equals(this.id, tareaDto.id) &&
        Objects.equals(this.titulo, tareaDto.titulo) &&
        Objects.equals(this.descripcion, tareaDto.descripcion) &&
        Objects.equals(this.estado, tareaDto.estado) &&
        Objects.equals(this.fechaVencimiento, tareaDto.fechaVencimiento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, titulo, descripcion, estado, fechaVencimiento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TareaDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    fechaVencimiento: ").append(toIndentedString(fechaVencimiento)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

