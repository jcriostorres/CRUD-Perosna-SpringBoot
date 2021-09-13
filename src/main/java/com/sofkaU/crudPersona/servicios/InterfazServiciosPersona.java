package com.sofkaU.crudPersona.servicios;

import com.sofkaU.crudPersona.entidades.Persona;

import java.util.List;

    //interfaz definir que  metodos a los que el controllador puede llamar para poder servicios hagan logica de negocio
public interface InterfazServiciosPersona {


    public List<Persona> listar();  //obtener de bd un lista de personas que el tenga

    public Persona ListarId(int id);

    //ahora necesito guardar objeto Persona que sea de tipo persona para guardarlo en la Bd
    public Persona guardar(Persona persona);

    public void borrar(int id);     // poder borrar

    public Persona actualizar(Persona persona);

}

