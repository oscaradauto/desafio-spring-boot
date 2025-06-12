CREATE TABLE usuarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    nombre_completo VARCHAR(255)
);

CREATE TABLE estado_tarea (
    codigo VARCHAR(50) PRIMARY KEY,
    descripcion VARCHAR(255) NOT NULL
);

CREATE TABLE tarea (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    descripcion VARCHAR(1000),
    fecha_vencimiento DATE,
    estado_codigo VARCHAR(50),
    usuario_id BIGINT,
    FOREIGN KEY (estado_codigo) REFERENCES estado_tarea(codigo),
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);
