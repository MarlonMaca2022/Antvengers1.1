package com.example.Antvengers.servicios;
import java.util.List;
import java.util.Optional;

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

    public boolean eliminar_comercio(Integer Id){

        Optional<Comercio> comercioQueBusco=repositorio.findById(Id);

        if(comercioQueBusco.isEmpty()){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"El comercio no existe "+Id
            );
        }

        else{
            repositorio.deleteById(Id);
            return true;
        }
    }

    public Comercio modificar_comercio(Integer id, Comercio datosNuevos){

        Optional<Comercio> comercioQueBusco=repositorio.findById(id);

        if(comercioQueBusco.isEmpty()){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"El comercio no existe "+id
             );
         }


         else{
             Comercio comercioQueEncontre = comercioQueBusco.get();
             comercioQueEncontre.setNombre(datosNuevos.getNombre());
             return repositorio.save(comercioQueEncontre);
          }
    }

    public Comercio buscar_comercio_id(Integer id){

        Optional<Comercio> comercioQueBusco=repositorio.findById(id);

        if(comercioQueBusco.isEmpty()){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"El comercio no existe "+id
             );
         }

         else{
             return comercioQueBusco.get();
          }
    }

}
