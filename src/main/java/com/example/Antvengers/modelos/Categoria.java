package com.example.Antvengers.modelos;

import java.time.LocalDate;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Categoria {

    private Integer id;
    private String nombre;
    private LocalDate fechaCreacion;
    private String responsable;
    private String justificacion;


    @ManyToOne
    @JoinColumn(name="fk_gasto", referencedColumnName = "id")
    private Gasto gasto;


    public Integer getId() {return id;}
    public String getNombre() {return nombre;}
    public LocalDate getFechaCreacion() {return fechaCreacion;}

    public void setId(Integer id) {this.id = id;}

    

    public void setNombre(String nombre) {this.nombre = nombre;}

    

    public void setFechaCreacion(LocalDate fechaCreacion) {this.fechaCreacion = fechaCreacion;}

    public String getResponsable() {return responsable;}

    public void setResponsable(String responsable) {this.responsable = responsable;}

    public String getJustificacion() {return justificacion;}

    public void setJustificacion(String justificacion) {this.justificacion = justificacion;}


}
