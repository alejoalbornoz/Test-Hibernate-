package com.example.pruebaJPA.service;

import com.example.pruebaJPA.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    private IPersonaRepository persoRepo;



}
