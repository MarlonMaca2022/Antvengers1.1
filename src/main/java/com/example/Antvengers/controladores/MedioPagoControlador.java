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

import com.example.Antvengers.modelos.MedioPago;
import com.example.Antvengers.servicios.MetodoPagoServicio;

@RestController
@RequestMapping("/antvengersapi/v1/mediopago")
public class MedioPagoControlador {

    @Autowired
    private MetodoPagoServicio servicio;

    @PostMapping
    public ResponseEntity<?> controladorGuardar(@RequestBody MedioPago datos){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.guarda_metodopago(datos)
        );
    }

    @GetMapping
    public ResponseEntity<?> controladorListarTodo(){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.listar_medios_pago()
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> controladorModificar(@PathVariable Integer id, @RequestBody MedioPago datos){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.modificar_metodopago(id, datos)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> controladorEliminar(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.eliminar_metodopago(id)
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> controladorBuscarId(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(
            servicio.buscar_metodopago_id(id)
        );
    }

}
