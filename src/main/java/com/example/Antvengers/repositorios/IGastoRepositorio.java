package com.example.Antvengers.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Antvengers.modelos.Gasto;
import java.util.List;
//import java.util.Optional;


@Repository
public interface IGastoRepositorio extends JpaRepository <Gasto, Integer> {
//espacio para crear consultas personalizadas. normalmente son de tipo get o buscar


// BUSCAR POR NOMBRE EXACTO (lista)

List<Gasto> findByDescripcion(String descripcion);

//BUSCAR POR DOCUMENTO (1)
 //Optional<Gasto> findByDocumento(String documento);  

//BUSCAR POR NOMBRES QUE CONTENGAN nnn (lista)

List<Gasto> findByEmocionContaining(String emocion);

//BUSCAR POR EDAD (lista) 
List<Gasto> findByValor(Double valor);
}
