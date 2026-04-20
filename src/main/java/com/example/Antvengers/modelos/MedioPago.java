package com.example.Antvengers.modelos;

import com.example.Antvengers.modelos.utils.Estados;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "medio_pago")

public class MedioPago {

    //id,nombre,franquicia,estado(activo/inactivo)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Nombre", nullable = false, unique = false, length = 40)
    private String nombre;

    @Column(name = "Franquicia", nullable = false, length = 40)
    private String franquicia;

    @Column(name = "Estado", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private Estados estado;

    @ManyToOne
    @JoinColumn(name="fk_mediopago", referencedColumnName= "id")
    private Gasto gasto;

    // Constructor vacío
    public MedioPago() {}

    // Getters
    public Integer getId() {return id;}
    public String getNombre() {return nombre;}
    public String getFranquicia() {return franquicia;}
    public Estados getEstado() {return estado;}

    // Setters
    public void setId(Integer id) {this.id = id;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setFranquicia(String franquicia) {this.franquicia = franquicia;}
    public void setEstado(Estados estado) {this.estado = estado;}
}



