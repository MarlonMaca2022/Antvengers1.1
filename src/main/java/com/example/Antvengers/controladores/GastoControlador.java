package com.example.Antvengers.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    //funcion controladores del servicio modificar
    @PutMapping("/{id}")
    public ResponseEntity<?>controladorModificar(@PathVariable Integer id, @RequestBody Gasto datos){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.modificar_Gasto(id, datos)
        );

    }
    //funcion controladora del servicio eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<?>controladorEliminar(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.eliminar_gasto(id)
        );
    }
    //funcion buscar por id
     @GetMapping("/{id}")
    public ResponseEntity<?>controladorBuscar(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.buscar_gasto_por_id(id)
        );
    }
}
