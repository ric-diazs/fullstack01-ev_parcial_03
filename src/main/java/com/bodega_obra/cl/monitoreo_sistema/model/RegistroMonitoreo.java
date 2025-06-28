package com.bodega_obra.cl.monitoreo_sistema.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "registro_monitoreo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistroMonitoreo {
    @Id
    private Integer id;

    @Column(nullable = false)
    private LocalDate fechaRegistro;

    @Column(nullable = false)
    private LocalTime horaRegistro;

    @Column(nullable = false)
    private String tipoEvento; // ("ERROR", "INFO", "WARNING")

    @Column(nullable = false)
    private String mensaje; // texto del evento (ej: "falló la conexión con la base de datos").

    @Column(nullable = false)
    private String servicio; // nombre del microservicio que generó el evento (ej: "gestion de usuarios")
}
