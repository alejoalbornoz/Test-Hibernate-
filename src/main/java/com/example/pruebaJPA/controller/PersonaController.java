package com.example.pruebaJPA.controller;

import com.example.pruebaJPA.model.Persona;
import com.example.pruebaJPA.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService persoServ;

    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return persoServ.getPersona();
    }

    @PostMapping ("personas/crear")
    public String savePersona(@RequestBody Persona perso){
        persoServ.savePersona(perso);
        return "La persona fue creadad con exito";
    }

    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        persoServ.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }

    @PutMapping ("personas/editar/{id_original}")
    public Persona editPersona(@PathVariable Long id_original,
                                @RequestParam  (required = false, name = "id") Long nuevaId,
                                @RequestParam  (required = false, name = "nombre") String nuevoNombre,
                                @RequestParam  (required = false, name = "apellido") String nuevoApellido,
                                @RequestParam  (required = false, name = "edad") int nuevaEdad){

        persoServ.editPersona(id_original, nuevaId, nuevoNombre, nuevoApellido, nuevaEdad);

        Persona perso = persoServ.findPersona(nuevaId);

        return perso;

    }



}
