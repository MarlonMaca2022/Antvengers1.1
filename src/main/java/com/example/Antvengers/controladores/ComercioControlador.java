package com.example.Antvengers.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Antvengers.modelos.Comercio;
import com.example.Antvengers.servicios.ComercioServicio;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/antvengersapi/v1/comercios")
public class ComercioControlador {

    @Autowired
    private ComercioServicio servicio;

    @PostMapping
    public ResponseEntity<?> controladorGuardar(@RequestBody Comercio datos){

        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.guardar_comercio(datos)
        );    
    }

    @GetMapping
    public ResponseEntity<?> controladorListarTodo(){
         
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.listar_comercios()
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> controladorModificar(@PathVariable Integer id, @RequestBody Comercio datos){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.modificar_comercio(id,datos)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> controladorEliminar(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.eliminar_comercio(id)
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> controladorBuscarId(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.buscar_comercio_id(id)
        );
    }
}
