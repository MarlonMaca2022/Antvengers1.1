package com.example.Antvengers.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Antvengers.modelos.Categoria;

@Repository
public interface ICategoriaRepositorio extends JpaRepository<Categoria, Integer> {

}
