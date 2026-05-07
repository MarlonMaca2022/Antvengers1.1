package com.example.Antvengers.servicios;
import java.util.List;
import java.util.Optional;

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

    //servicio para eliminar un gasto
    public boolean eliminar_gasto(Integer Id){

        Optional<Gasto> gastoQueBusco=repositorio.findById(Id);

        if(gastoQueBusco.isEmpty()){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"El gasto no existe en la BD "
            );
            
        }else{
            repositorio.deleteById(Id);
            return true;
        }
    }

    //servicio para modificar un gasto en bd
    public Gasto modificar_Gasto(Integer Id, Gasto datosNuevos){
        Optional<Gasto> gastoQueBusco=repositorio.findById(Id);
        if(gastoQueBusco.isEmpty()){
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"El gasto no existe en la BD "
            );

        }else{
            Gasto gastoQueEncontre=gastoQueBusco.get();
            //defino que campos voy a editar
            //cambiemos el nombre
            gastoQueEncontre.setDescripcion(datosNuevos.getDescripcion());
            return repositorio.save(gastoQueEncontre);


            //lo edito
        }
    }

    //servicio para buscar un gasto por Id
    public Gasto buscar_gasto_por_id(Integer id){
        Optional<Gasto> gastoBuscado=repositorio.findById(id);
        if(gastoBuscado.isEmpty()){
          throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"El gasto no existe en la BD "
            );  
        }else{
            return gastoBuscado.get();
        }
    }
}
