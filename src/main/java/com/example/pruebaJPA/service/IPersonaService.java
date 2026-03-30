package com.example.pruebaJPA.service;

import com.example.pruebaJPA.model.Persona;


import java.util.List;

public interface IPersonaService {


    public List<Persona> getPersona();

    public void savePersona(Persona perso);

    public void deletePersona(Long id);

    public Persona findPersona(Long id);

    public void editPersona (Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad);


    public void editPersona(Persona per);
}
