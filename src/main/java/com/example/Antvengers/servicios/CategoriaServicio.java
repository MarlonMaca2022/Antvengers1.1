package com.example.Antvengers.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.Antvengers.modelos.Categoria;
import com.example.Antvengers.repositorios.ICategoriaRepositorio;

@Service
public class CategoriaServicio {

    @Autowired
    private ICategoriaRepositorio repositorio;

    public Categoria guardar_categoria(Categoria datosCategoria){

        if(datosCategoria.getNombre() == null || datosCategoria.getNombre().isBlank() || datosCategoria.getNombre().isEmpty()){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "El nombre es obligatorio"
            );

        }

        return repositorio.save(datosCategoria);
    }

    public List<Categoria> listar_categoria(){
        return repositorio.findAll();
    }

    //servicio para eliminar
    public boolean eliminar_categoria(Integer Id){

        Optional<Categoria> categoriaQueBusco=repositorio.findById(Id);

        if(categoriaQueBusco.isEmpty()){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"La categoria no existe"+ Id
            );
        }

        else{
            repositorio.deleteById(Id);
            return true;
        }
    }

    public Categoria modificar_categoria(Integer Id, Categoria datosCategoria){

        Optional<Categoria> categoriaQueBusco=repositorio.findById(Id);

        if(categoriaQueBusco.isEmpty()){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"La categoria no existe"+ Id
            );
        }

        else{
            Categoria categoriaExistente = categoriaQueBusco.get();
            categoriaExistente.setNombre(datosCategoria.getNombre());
            categoriaExistente.setReferencia(datosCategoria.getReferencia());
            categoriaExistente.setEstado(datosCategoria.getEstado());
            categoriaExistente.setPrioridad(datosCategoria.getPrioridad());
            categoriaExistente.setColor(datosCategoria.getColor());
            categoriaExistente.setIcono(datosCategoria.getIcono());
            categoriaExistente.setDescripcion(datosCategoria.getDescripcion());
            return repositorio.save(categoriaExistente);
        }

    }

    public Categoria buscar_categoria_id(Integer id){

        Optional<Categoria> categoriaQueBusco=repositorio.findById(id);

        if(categoriaQueBusco.isEmpty()){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"La categoria no existe"+ id
            );
        }

        else{
            return categoriaQueBusco.get();
        }
    }
}
