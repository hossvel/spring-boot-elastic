package com.devhoss.elastic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "empleados")
public class Empleado {
    private UUID id;

    private String nombre;


    private String apellido;


    private String email;

    private String dni;
}