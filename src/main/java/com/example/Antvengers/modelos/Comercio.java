package com.example.Antvengers.modelos;

import jakarta.persistence.Column;
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

    @Column(name="Nit", nullable = false, unique = true, length = 15)
    private String nit;

    @Column(name="Nombre", nullable = false, unique = false, length = 50)
    private String nombre;

    @Column(name="Ciudad", nullable = false, unique = false, length = 50)
    private String ciudad;

    @Column(name="Contacto", nullable = false, unique = false, length = 50)
    private String contacto;

    @Column(name="TipoEmpresa", nullable = false, unique = false, length = 20)
    private String tipoEmpresa;

    @Column(name="NumeroEmpleados", nullable = false, unique = false)
    private Integer numeroEmpleados;

    @Column(name="Sector", nullable = false, unique = false, length = 20)
    private String sector;

    @Column(name="RepresentanteLegal", nullable = false, unique = false, length = 50)
    private String representanteLegal;
    
    @Column(name="FrecuenciaDeVisita", nullable = false, unique = false)
    private Integer frecuenciadevisita; 


    @ManyToOne
    @JoinColumn(name="fk_gasto", referencedColumnName = "id")
    private Gasto gasto;

    public Integer getId() {return id;}
    public String getNit() {return nit;}
    public String getNombre() {return nombre;}
    public String getCiudad() {return ciudad;}
    public String getContacto() {return contacto;}
    public String getTipoEmpresa() {return tipoEmpresa;}
    public Integer getNumeroEmpleados() {return numeroEmpleados;}
    public String getSector() {return sector;}
    public String getRepresentanteLegal() {return representanteLegal;}
    public Integer getFrecuenciadevisita() {return frecuenciadevisita;}

    public void setId(Integer id) {this.id = id;}
    public void setNit(String nit) {this.nit = nit;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}
    public void setContacto(String contacto) {this.contacto = contacto;}
    public void setTipoEmpresa(String tipoEmpresa) {this.tipoEmpresa = tipoEmpresa;}
    public void setNumeroEmpleados(Integer numeroEmpleados) {this.numeroEmpleados = numeroEmpleados;}
    public void setSector(String sector) {this.sector = sector;}
    public void setRepresentanteLegal(String representanteLegal) {this.representanteLegal = representanteLegal;}
    public void setFrecuenciadevisita(Integer frecuenciadevisita) {this.frecuenciadevisita = frecuenciadevisita;}
    public Gasto getGasto() {return gasto;}
    public void setGasto(Gasto gasto) {this.gasto = gasto;}

}
