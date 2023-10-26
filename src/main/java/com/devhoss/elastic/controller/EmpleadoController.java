package com.devhoss.elastic.controller;

import com.devhoss.elastic.model.Empleado;
import com.devhoss.elastic.model.Product;
import com.devhoss.elastic.service.IEmpleadoService;
import com.devhoss.elastic.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    private IEmpleadoService iEmpleadoService;

    @GetMapping("/findAll")
    Iterable<Empleado> findAll(){
        return iEmpleadoService.getProducts();

    }

    @PostMapping("/insert")
    public Empleado insertProduct(@RequestBody Empleado empleado){
        return iEmpleadoService.insertProduct(empleado);
    }

}
