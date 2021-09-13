package com.sofkaU.crudPersona.servicios;

import com.sofkaU.crudPersona.entidades.Persona;
import com.sofkaU.crudPersona.repositorio.InterfaceRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//crea los metodos con tipo dato retorno y retorna nullo
@Service
public class ServiciosPersona implements InterfazServiciosPersona{

   @Autowired
   private InterfaceRepositorioPersona data;


    @Override
    public List<Persona> listar() {  //hay que castear el dato trasnformatlo en otro tipo de dato en lista persona
        return (List<Persona>) data.findAll();
    }

    @Override
    public Persona ListarId(int id) {
        return null;
    }

    @Override
    public Persona guardar(Persona persona) {
        return data.save(persona);
    }

    @Override
    public void borrar(int id) {

    }

    @Override
    public Persona actualizar(Persona persona) {
        return null;
    }     // implementacion
}
