package com.example.Antvengers.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Antvengers.repositorios.ICategoriaRepositorio;

@Service
public class CategoriaServicio {

    @Autowired
    private ICategoriaRepositorio repositorio;

}
