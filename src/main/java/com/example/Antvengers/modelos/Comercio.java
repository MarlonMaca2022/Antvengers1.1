package com.example.Antvengers.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "comercios")
public class Comercio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nit;
    private String nombre;
    private String actividad;
    private String contacto;
    private String tipoEmpresa;
    private Integer numeroEmpleados;
    private String sector;
    private String representanteLegal;
    private Integer frecuenciadevisita; 


    @ManyToOne
    @JoinColumn(name="fk_gasto", referencedColumnName = "id")
    private Gasto gasto;

    public Integer getId() {return id;}
    public String getNit() {return nit;}
    public String getNombre() {return nombre;}
    public String getActividad() {return actividad;}
    public String getContacto() {return contacto;}
    public String getTipoEmpresa() {return tipoEmpresa;}
    public Integer getNumeroEmpleados() {return numeroEmpleados;}
    public String getSector() {return sector;}
    public String getRepresentanteLegal() {return representanteLegal;}
    public Integer getFrecuenciadevisita() {return frecuenciadevisita;}

    public void setId(Integer id) {this.id = id;}
    public void setNit(String nit) {this.nit = nit;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setActividad(String actividad) {this.actividad = actividad;}
    public void setContacto(String contacto) {this.contacto = contacto;}
    public void setTipoEmpresa(String tipoEmpresa) {this.tipoEmpresa = tipoEmpresa;}
    public void setNumeroEmpleados(Integer numeroEmpleados) {this.numeroEmpleados = numeroEmpleados;}
    public void setSector(String sector) {this.sector = sector;}
    public void setRepresentanteLegal(String representanteLegal) {this.representanteLegal = representanteLegal;}
    public void setFrecuenciadevisita(Integer frecuenciadevisita) {this.frecuenciadevisita = frecuenciadevisita;}

    

}
