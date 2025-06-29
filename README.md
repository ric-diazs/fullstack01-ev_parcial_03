# Microservicio: Monitoreo de sistema.

En este repositorio se encuentra el microservicio "monitoreo-sistema", el cual es el que uso para la evaluación 3 de Desarrollo Full Stack 1.

Para usar la API de este microservicio:

1. Se debe configurar la base de datos según lo que está en los archivos de la carpeta [src/main/resources/](src/main/resources/).

2. Se debe ejecutar la aplicación. Si se hace desde una CLI, desde esta carpeta se debe correr el comando `mvnw.cmd clean package` en Windows o `mvn clean package` en sistemas UNIX.

3. Si ejecuta exitosamente la aplicación, se pueden hacer solicitudes HTTP desde endpoint [http://localhost:8080/api/v1/registros-monitoreo](http://localhost:8080/api/v1/registros-monitoreo). La API sigue principio HATEOAS, por lo que desde este mismo endpoint se pueden obtener URLs relevantes para ser usadas por otras personas.

4. La API de este microservicio tiene documentación OAS, la cual se puede acceder desde Swagger siguiendo la URL: [http://localhost:8080/doc/swagger-ui/index.html](http://localhost:8080/doc/swagger-ui/index.html).
