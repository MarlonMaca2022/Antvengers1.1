package com.example.Antvengers.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medio_pago")

public class MedioPago {

    //id,nombre,franquicia,estado(activo/inactivo)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Atributos
    private Long id;
    private String nombre;
    private String franquicia;
    private String estado;

    // Constructor vacío
    public MedioPago() {
    }

    // Getters

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre; 
    }

    public String getFranquicia() {
        return franquicia;
    }

    public String getEstado() {
        return estado;
    }


    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}



