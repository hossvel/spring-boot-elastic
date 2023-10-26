package com.devhoss.elastic.listeners;

import com.devhoss.elastic.model.Empleado;
import com.devhoss.elastic.repository.IEmpleadoRepository;
import com.devhoss.elastic.repository.IProductRepository;
import com.devhoss.elastic.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmpleadoEventListener {

    @Autowired
    private IEmpleadoRepository iEmpleadoRepository;


    @KafkaListener(topics = "empleados-topic")
    public void handleOrdersNotifications(String message) {
        var empleadoEvent = JsonUtils.fromJson(message, Empleado.class);

        //Send email to customer, send SMS to customer, etc.
        //Notify another service...

        log.info("Recibe al empleado Llamado:  {} ",empleadoEvent);
        iEmpleadoRepository.save(empleadoEvent);
    }
}