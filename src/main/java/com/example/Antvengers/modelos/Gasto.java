package com.example.Antvengers.modelos;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "gastos")

public class Gasto {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Descripcion", nullable = false, unique = false, length = 100)
    private String descripcion;
    private LocalDate fecha;
    private Double valor;
    private String icono;
    private String emocion; //para analisis de gasto ej:emoción vs valor gastado, en front:frontend puede mostrarse como insight tipo:"Gastaste más cuando reportaste estrés"
    private boolean esRecurrente; //para identificar gastos recurrentes y analizarlos en el tiempo, en front:puede mostrarse como insight tipo:"Tienes un gasto recurrente de $X cada mes"
    private Integer nivelNecesidad; //para clasificar gastos por nivel de necesidad, ej: "El 70% de tus gastos son de nivel de necesidad alto"
    private Integer satisfaccion; //para medir la satisfacción con el gasto, ej: "Gastaste $X en algo que te dio una satisfacción de 8/10"
    private boolean esPlaneado; //para identificar gastos planificados vs impulsivos, en front:puede mostrarse como insight tipo:"El 30% de tus gastos son impulsivos, considera planificar más tus compras"
    
   

    @ManyToOne
    @JoinColumn(name="fk_usuario", referencedColumnName = "id")
    private Usuario usuario;

    @OneToMany(mappedBy = "categoria")
    private List<Categoria> categorias;

    @OneToMany(mappedBy = "comercio")
    private List<Comercio> comercios;

    @OneToMany(mappedBy = "MedioPago")
    private List<MedioPago> medioPagos;

    public Gasto() {}

    public Integer getId() {return id;}
    public String getDescripcion() {return descripcion;}
    public LocalDate getFecha() {return fecha;}
    public Double getValor() {return valor;}
    public String getIcono() {return icono;}


    public void setId(Integer id) {this.id = id;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public void setFecha(LocalDate fecha) {this.fecha = fecha;}
    public void setValor(Double valor) {this.valor = valor;}
    public void setIcono(String icono) {this.icono = icono;}


    public String getEmocion() {
        return emocion;}
    public void setEmocion(String emocion) {
        this.emocion = emocion;}
    public boolean isEsRecurrente() {
        return esRecurrente;}
    public void setEsRecurrente(boolean esRecurrente) {
        this.esRecurrente = esRecurrente;}
    public Integer getNivelNecesidad() {
        return nivelNecesidad;}
    public void setNivelNecesidad(Integer nivelNecesidad) {
        this.nivelNecesidad = nivelNecesidad;}
    public Integer getSatisfaccion() {
        return satisfaccion;}
    public void setSatisfaccion(Integer satisfaccion) {
        this.satisfaccion = satisfaccion;}
    public boolean isEsPlaneado() {
        return esPlaneado;}
    public void setEsPlaneado(boolean esPlaneado) {
        this.esPlaneado = esPlaneado;}

    




}
