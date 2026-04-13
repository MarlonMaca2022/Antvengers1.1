package com.example.Antvengers.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.Antvengers.modelos.Usuario;
import com.example.Antvengers.repositorios.IUsuarioRepositorio;

@Service
public class UsuarioServicio {

    @Autowired
    private IUsuarioRepositorio repositorio;

    //servicio para guardar un usuario
    public Usuario guardar_usuario(Usuario datosUsuario){

        if(datosUsuario.getNombres() == null || datosUsuario.getNombres().isBlank() || datosUsuario.getNombres().isEmpty()){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "El nombre del usuario es obligatorio, revisa por favor"
            );

        }

        if(datosUsuario.getDocumento().length() < 6){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"El documento es invalido"
            );

        }

        return repositorio.save(datosUsuario);
    }

    //servicio para listar

    public List<Usuario> listar_usuarios(){
        return repositorio.findAll();
    }

    //servicio para eliminar

    //servicio para modificar

    //servicio para buscar 

}
