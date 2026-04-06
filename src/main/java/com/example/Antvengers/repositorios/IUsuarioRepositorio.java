package com.example.Antvengers.repositorios;

import java.util.List;
// import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Antvengers.modelos.Usuario;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer> {

    //Consultas personalizadas (nombre, por documento, nombres que contengan nnn)
    List<Usuario> findByNombres(String nombres);

    // Optional<Usuario> findByDocumento(String documento);

    List<Usuario> findByNombresContaining(String nombre);
    List<Usuario> findByEdad(int edad);

    //guardar
    //buscar por id
    //buscar todos
    //modificar por id
    //eliminar por id

}
