package com.example.pruebaJPA.controller;

import com.example.pruebaJPA.model.Mascota;
import com.example.pruebaJPA.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascoServ;

    @GetMapping("/mascota/traer")
    public List<Mascota> getMascota(){
        return mascoServ.getMascota();
    }

    @PostMapping("/mascota/crear")
    public String saveMascota(@RequestBody Mascota masco){
        mascoServ.saveMascota(masco);
        return "La mascota fue creada con exito";
    }


}
