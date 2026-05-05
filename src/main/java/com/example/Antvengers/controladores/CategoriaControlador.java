package com.example.Antvengers.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Antvengers.modelos.Categoria;
import com.example.Antvengers.servicios.CategoriaServicio;

@RestController
@RequestMapping("/antvengersapi/v1/categorias")
public class CategoriaControlador {

    @Autowired
    private CategoriaServicio servicio;

    @PostMapping
    public ResponseEntity<?> controladorGuardar(@RequestBody Categoria datos){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.guardar_categoria(datos)
        );
    }

    @GetMapping
    public ResponseEntity<?> controladorListarTodo(){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.listar_categoria()
        );
    }

}
