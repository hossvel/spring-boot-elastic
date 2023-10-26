package com.devhoss.elastic.service;

import com.devhoss.elastic.model.Empleado;
import com.devhoss.elastic.model.Product;
import com.devhoss.elastic.repository.IEmpleadoRepository;
import com.devhoss.elastic.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
    @Autowired
    private IEmpleadoRepository iEmpleadoRepository;


    @Override
    public Iterable<Empleado> getProducts() {
        return iEmpleadoRepository.findAll();
    }

    @Override
    public Empleado insertProduct(Empleado empleado) {
        return iEmpleadoRepository.save(empleado);
    }

    @Override
    public Empleado updateProduct(Empleado empleado, UUID id) {
        Empleado empleadom  = iEmpleadoRepository.findById(id).get();
        empleadom.setEmail(empleado.getEmail());
        return empleadom;
    }

    @Override
    public void deleteProduct(UUID id) {
        iEmpleadoRepository.deleteById(id);
    }
}
