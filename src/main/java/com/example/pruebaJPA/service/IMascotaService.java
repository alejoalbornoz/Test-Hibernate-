package com.example.pruebaJPA.service;

import com.example.pruebaJPA.model.Mascota;

import java.util.List;

public interface IMascotaService {


    public List<Mascota> getMascota();

    public void saveMascota(Mascota masco);

    public void deleteMascota(Long id);

    public Mascota findMascota(Long id);

    public void editMascota (Long idOriginal, Long id_mascotaNueva, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor);
}
