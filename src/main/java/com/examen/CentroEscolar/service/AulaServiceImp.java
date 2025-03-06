package com.examen.CentroEscolar.service;

import com.examen.CentroEscolar.model.Aula;
import com.examen.CentroEscolar.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AulaServiceImp implements AulaService{

    @Autowired
    private AulaRepository aulaRepository;


    @Override
    public Aula getById(int id) {
        return aulaRepository.getById(id);
    }
}
