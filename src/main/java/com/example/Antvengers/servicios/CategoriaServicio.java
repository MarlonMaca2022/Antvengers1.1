package com.example.Antvengers.servicios;

import java.util.List;

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

}
