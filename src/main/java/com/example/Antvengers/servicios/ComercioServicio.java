package com.example.Antvengers.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.Antvengers.modelos.Comercio;
import com.example.Antvengers.repositorios.IComercioRepositorio;

@Service
public class ComercioServicio {

    @Autowired
    private IComercioRepositorio repositorio;

    public Comercio guardar_comercio(Comercio datosComercio){

        if(datosComercio.getNombre() == null || datosComercio.getNombre().isBlank() || datosComercio.getNombre().isEmpty()){
             throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "El nombre del comercio es obligatorio, revisa por favor"
            );
        }

        return repositorio.save(datosComercio);
    }
        
    public List<Comercio> listar_comercios(){
        return repositorio.findAll();
    }

}
