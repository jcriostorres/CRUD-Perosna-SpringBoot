package com.sofkaU.crudPersona.servicios;

import com.sofkaU.crudPersona.entidades.Persona;
import java.util.List;

    //interfaz definri que vamos metodos a los que el cotrollador puede llamar para poder servicios hagan logica de negocio
public interface InterfazServiciosPersona {


    public List<Persona> listar();  //obener de bd un lista de personas que el tenga

    public Persona ListarId(int id);

        //ahora necesito guardar objeto Persona que se de tipo persona para guardarlo en la Bd
    public Persona guardar(Persona persona);

    public void borrar(int id);     // poder borrar

    public Persona actualizar(Persona persona);


}

