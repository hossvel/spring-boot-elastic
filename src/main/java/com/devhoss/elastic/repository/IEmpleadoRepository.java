package com.devhoss.elastic.repository;

import com.devhoss.elastic.model.Empleado;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.UUID;

public interface IEmpleadoRepository extends ElasticsearchRepository<Empleado, UUID> {
}
