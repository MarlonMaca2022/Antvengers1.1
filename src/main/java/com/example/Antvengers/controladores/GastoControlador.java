package com.example.Antvengers.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Antvengers.modelos.Gasto;
import com.example.Antvengers.servicios.GastoServicio;

@RestController
@RequestMapping("/antvengersapi/v1/gastos")
public class GastoControlador {

    @Autowired
    private GastoServicio servicio;

    @PostMapping
    public ResponseEntity<?> controladorGuardar(@RequestBody Gasto datos){

        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.guardar_gasto(datos)
        );
    }

    @GetMapping
    public ResponseEntity<?> controladorListarTodo(){

        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.listar_gasto()
        );
    }



}
