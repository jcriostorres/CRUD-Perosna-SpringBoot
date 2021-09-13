package com.sofkaU.crudPersona.controlador;

import com.sofkaU.crudPersona.entidades.Persona;
import com.sofkaU.crudPersona.servicios.InterfazServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//indica clase controlador va a tener los metodos acceso delete, put, get
@RestController
// el controlador indentifica metodo, la url, la llegada de los parametros y cual va a ser la logica que va implementar
@RequestMapping("api")
public class ControladorPersona {   //controlador puerta entrada de los servicios para acceder a los servicios desde afuera o desde un front

    @Autowired
    private InterfazServiciosPersona servicio;

    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona> listarPersonas() {

        return servicio.listar();
    }


    @PostMapping(value = "/guardarPersona")
    public Persona guardarPersona(@RequestBody Persona persona) {

        return servicio.guardar(persona);
    }

    @PutMapping("/actualizar")
    private Persona actualizarPersona(@RequestBody Persona persona) {
        return servicio.actualizar(persona);

    }

    @DeleteMapping(path = "{id}")
    private void borrarPersona(@PathVariable("id") Integer id) {
        servicio.borrar(id);
    }
}