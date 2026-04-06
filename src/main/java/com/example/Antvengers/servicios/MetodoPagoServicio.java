package com.example.Antvengers.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Antvengers.repositorios.IMedioPagoRepositorio;


@Service

public class MetodoPagoServicio {

     @Autowired
    private IMedioPagoRepositorio repositorio;


}
