package com.examen.CentroEscolar.controller;

import com.examen.CentroEscolar.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aulas")
public class AulaController {

    @Autowired
    private AulaService aulaService;


}
