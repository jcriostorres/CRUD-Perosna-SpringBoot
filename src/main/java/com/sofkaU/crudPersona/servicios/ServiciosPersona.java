package com.sofkaU.crudPersona.servicios;

import com.sofkaU.crudPersona.entidades.Persona;
import com.sofkaU.crudPersona.repositorio.InterfaceRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
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
        Optional<Persona> opcional = data.findById(id);
        if(opcional.isEmpty()){
            throw new NoSuchElementException("No existe ningun usuario con id "+id);
        }
        return opcional.get();
    }

    @Override
    public Persona guardar(Persona persona) {

        return data.save(persona);
    }

    @Override
    public void borrar(int id) {
        boolean existe = data.existsById(id);
        if (existe) {
            data.deleteById(id);


        }
    }

    @Override
    public Persona actualizar(Persona persona) {

        return data.save(persona);
    }
}
