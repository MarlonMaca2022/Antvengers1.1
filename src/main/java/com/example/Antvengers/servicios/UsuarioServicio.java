package com.example.Antvengers.servicios;

import java.util.List;
import java.util.Optional;

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
    public boolean eliminar_usuario(Integer Id){

        Optional<Usuario> usuarioQueBusco=repositorio.findById(Id);

        if(usuarioQueBusco.isEmpty()){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"El usuario no existe"
            );
        }

        else{
            repositorio.deleteById(Id);
            return true;
        }
    }

    //servicio para modificar
    public Usuario modificar_usuario(Integer id, Usuario datosNuevos){

        Optional<Usuario> usuarioQueBusco=repositorio.findById(id);

        if(usuarioQueBusco.isEmpty()){
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"El usuario no existe"+ id
            );
        }
        else{
            Usuario usuarioQueEncontre =usuarioQueBusco.get();
            usuarioQueEncontre.setNombres(datosNuevos.getNombres());
            return repositorio.save(usuarioQueEncontre);
        }
    }

    //servicio para buscar
    public Usuario buscar_usuario_por_id(Integer id){

        Optional<Usuario> usuarioQueBusco=repositorio.findById(id);

        if(usuarioQueBusco.isEmpty()){
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,"El usuario no existe"
            );
        }
        else{
            return usuarioQueBusco.get();
        }
    }
}
