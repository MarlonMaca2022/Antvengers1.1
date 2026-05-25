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

import com.example.Antvengers.modelos.Categoria;
import com.example.Antvengers.servicios.CategoriaServicio;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
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

    @PutMapping("/{id}")
    public ResponseEntity<?> controladorModificar(@PathVariable Integer id, @RequestBody Categoria datos){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.modificar_categoria(id, datos)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> controladorEliminar(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.eliminar_categoria(id)
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> controladorBuscarId(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.buscar_categoria_id(id)
        );
    }

}
