package com.example.Antvengers.modelos;

import com.example.Antvengers.modelos.utils.Estados;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    private Estados estado;

    @ManyToOne
    @JoinColumn(name="fk_usuario", referencedColumnName = "id")
    private Usuario usuario;

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

    public Estados getEstado() {
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

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
}
