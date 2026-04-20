package com.example.Antvengers.servicios;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.Antvengers.repositorios.IGastoRepositorio;
import com.example.Antvengers.modelos.Gasto;
@Service

public class GastoServicio {
    
    @Autowired
    private IGastoRepositorio repositorio;

    public Gasto guardar_gasto(Gasto datosGasto){

        if(datosGasto.getValor() > 0){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"El valor del gasto debe ser mayor a 0 "
            );
        }

        return repositorio.save(datosGasto);
    }

    public List<Gasto> listar_gasto(){
        return repositorio.findAll();
    }

    //servicio para guardar un gasto
    //servicio para listar los gastos
    //servicio para eliminar un gasto
    //servicio para actualizar un gasto
    //servicio para buscar un gasto por id


}
