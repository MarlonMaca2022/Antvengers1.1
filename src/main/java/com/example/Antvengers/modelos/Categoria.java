package com.example.Antvengers.modelos;
import java.time.LocalDate;

import com.example.Antvengers.modelos.utils.Colores;
import com.example.Antvengers.modelos.utils.Estados;
import com.example.Antvengers.modelos.utils.Prioridades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name= "Nombre", nullable = false, unique = true, length = 15)
    private String nombre;

    @Column(name= "FechaCreacion", nullable = false, unique = false)
    private LocalDate fechaCreacion;

    @Column(name= "Responsable", nullable = false, unique = false, length = 20)
    private String responsable;

    @Column(name= "Justificacion", nullable = false, unique = false, length = 100)
    private String justificacion;

    @Column(name= "Estado", nullable = false, unique = false, length = 20)
    @Enumerated(EnumType.STRING)
    private Estados estado;

    @Column(name= "Prioridad", nullable = false, unique = false, length = 20)
    @Enumerated(EnumType.STRING)
    private Prioridades prioridad;

    @Column(name= "Color", nullable = false, unique = false, length = 20)
    @Enumerated(EnumType.STRING)
    private Colores color;

    @Column(name= "Presupuesto", nullable = false, unique = false)
    private Integer presupuesto;

    @Column(name= "FechaActualizacion", nullable = true, unique = false)
    private LocalDate fechaActualizacion;


    @ManyToOne
    @JoinColumn(name="fk_gasto", referencedColumnName = "id")
    private Gasto gasto;


    public Integer getId() {return id;}
    public String getNombre() {return nombre;}
    public LocalDate getFechaCreacion() {return fechaCreacion;}
    public String getResponsable() {return responsable;}
    public String getJustificacion() {return justificacion;}
    public Estados getEstado() {return estado;}
    public Prioridades getPrioridad() {return prioridad;}
    public Colores getColor() {return color;}
    public Integer getPresupuesto() {return presupuesto;}
    public LocalDate getFechaActualizacion() {return fechaActualizacion;}

    public void setId(Integer id) {this.id = id;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setFechaCreacion(LocalDate fechaCreacion) {this.fechaCreacion = fechaCreacion;}
    public void setResponsable(String responsable) {this.responsable = responsable;}
    public void setJustificacion(String justificacion) {this.justificacion = justificacion;}
    public void setEstado(Estados estado) {this.estado = estado;}
    public void setPrioridad(Prioridades prioridad) {this.prioridad = prioridad;}
    public void setColor(Colores color) {this.color = color;}
    public void setPresupuesto(Integer presupuesto) {this.presupuesto = presupuesto;}
    public void setFechaActualizacion(LocalDate fechaActualizacion) {this.fechaActualizacion = fechaActualizacion;}
    public Gasto getGasto() {return gasto;}
    public void setGasto(Gasto gasto) {this.gasto = gasto;}
    
}
