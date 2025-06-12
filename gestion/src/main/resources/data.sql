
INSERT INTO estado_tarea (codigo, descripcion) VALUES ('PENDIENTE', 'Tarea pendiente');
INSERT INTO estado_tarea (codigo, descripcion) VALUES ('EN_PROGRESO', 'Tarea en progreso');
INSERT INTO estado_tarea (codigo, descripcion) VALUES ('COMPLETADA', 'Tarea completada');


INSERT INTO usuarios (username, password, nombre_completo) VALUES ('admin', 'admin', 'Administrador General');
INSERT INTO usuarios (username, password, nombre_completo) VALUES ('oscar', 'oscar', 'Usuario Uno');


INSERT INTO tarea (titulo, descripcion, fecha_vencimiento, estado_codigo, usuario_id)
VALUES ('Primera Tarea', 'Descripcion de la  tarea 1', CURRENT_DATE, 'PENDIENTE', 1);
