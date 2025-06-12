
#Instrucciones para Ejecutar y Probar la API de Gestión de Tareas

Este documento contiene los pasos necesarios para ejecutar y probar la API RESTful de gestión de tareas utilizando Postman.



## Ejecutar la Aplicación

1. Abre tu IDE (Intellij) o terminal.
2. Ejecuta la aplicación Spring Boot.
3. Asegúrate de que esté corriendo en "http://localhost:8080".



##Probar con Postman

### 1. Importar los archivos necesarios

Importar: "API Gestion de Tareas.postman_collection.json"

### 2. Ejecutar Login

- Ejecuta el request `Login`
- Este request obtendrá un token JWT y lo guardará automáticamente en la variable "{{jwt_token}}"

### 3. Ejecutar los demás endpoints

Ejecutar los siguientes recursos sin hacer cambios manuales:

- `GET /v1/tareas` - Obtener todas las tareas
- `GET /v1/tareas/{id}` - Obtener una tarea por ID
- `POST /v1/tareas` - Crear una nueva tarea
- `PUT /v1/tareas/{id}` - Actualizar una tarea
- `DELETE /v1/tareas/{id}` - Eliminar una tarea


