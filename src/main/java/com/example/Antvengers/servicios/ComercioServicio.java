package com.example.Antvengers.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Antvengers.repositorios.IComercioRepositorio;

@Service
public class ComercioServicio {

    @Autowired
    private IComercioRepositorio repositorio;
}
