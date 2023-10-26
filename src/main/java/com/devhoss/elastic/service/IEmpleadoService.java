package com.devhoss.elastic.service;

import com.devhoss.elastic.model.Empleado;
import com.devhoss.elastic.model.Product;

import java.util.UUID;

public interface IEmpleadoService {

    public Iterable<Empleado> getProducts();

    public Empleado insertProduct(Empleado empleado);

    public Empleado updateProduct(Empleado empleado, UUID id);

    public void deleteProduct(UUID id);
}
