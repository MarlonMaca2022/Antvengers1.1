package com.example.Antvengers.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.Antvengers.modelos.MedioPago;
import com.example.Antvengers.repositorios.IMedioPagoRepositorio;


@Service

public class MetodoPagoServicio {

     @Autowired
    private IMedioPagoRepositorio repositorio;

    public MedioPago guarda_metodopago(MedioPago datosMedioPago){

        if(datosMedioPago.getNombre() == null || datosMedioPago.getNombre().isBlank() || datosMedioPago.getNombre().isEmpty() ){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"El nombre del medio es obligatorio"
            );

        }

        if(datosMedioPago.getFranquicia() == null || datosMedioPago.getFranquicia().isBlank() || datosMedioPago.getFranquicia().isEmpty()){

        throw new ResponseStatusException(
            HttpStatus.BAD_REQUEST,"El nombre de la franquicia es obligatorio"
        );

        }

        return repositorio.save(datosMedioPago);
    }

    public List<MedioPago> listar_medios_pago(){
        return repositorio.findAll();
    }

    //servicio para eliminar
    public boolean eliminar_metodopago(Integer Id){

        Optional<MedioPago> medioPagoQueBusco=repositorio.findById(Id);

        if(medioPagoQueBusco.isEmpty()){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"El medio de pago no existe "+Id
            );
        }

        else{
            repositorio.deleteById(Id);
            return true;
        }
    }

    public MedioPago modificar_metodopago(Integer id, MedioPago datosNuevos){

        Optional<MedioPago> medioPagoQueBusco=repositorio.findById(id);

        if(medioPagoQueBusco.isEmpty()){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"El medio de pago no existe "+id
             );
         }


         else{
             MedioPago medioPagoQueEncontre = medioPagoQueBusco.get();
             medioPagoQueEncontre.setNombre(datosNuevos.getNombre());
             medioPagoQueEncontre.setFranquicia(datosNuevos.getFranquicia());
             return repositorio.save(medioPagoQueEncontre);
          }
    }

    public MedioPago buscar_metodopago_id(Integer id){

        Optional<MedioPago> medioPagoQueBusco=repositorio.findById(id);

        if(medioPagoQueBusco.isEmpty()){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"El medio de pago no existe "+id
             );
         }

         else{
             return medioPagoQueBusco.get();
          }
     }

}
