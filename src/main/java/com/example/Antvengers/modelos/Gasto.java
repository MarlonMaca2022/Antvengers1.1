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

    @Column(name="Fecha", nullable = false, unique = false)
    private LocalDate fecha;

    @Column(name="Valor", nullable = false, unique = false)
    private Double valor;

    @Column(name="Icono", nullable = true, unique = false, length = 20)
    private String icono;

    @Column(name="Emocion", nullable = true, unique = false, length = 20)
    private String emocion; //para analisis de gasto ej:emoción vs valor gastado, en front:frontend puede mostrarse como insight tipo:"Gastaste más cuando reportaste estrés"

    @Column(name="EsRecurrente", nullable = false, unique = false)
    private boolean esRecurrente; //para identificar gastos recurrentes y analizarlos en el tiempo, en front:puede mostrarse como insight tipo:"Tienes un gasto recurrente de $X cada mes"
    
    @Column(name="NivelNecesidad", nullable = true, unique = false)
    private Integer nivelNecesidad; //para clasificar gastos por nivel de necesidad, ej: "El 70% de tus gastos son de nivel de necesidad alto"
   
    @Column(name="Satisfaccion", nullable = true, unique = false)
    private Integer satisfaccion; //para medir la satisfacción con el gasto, ej: "Gastaste $X en algo que te dio una satisfacción de 8/10"
    
    @Column(name="EsPlaneado", nullable = true, unique = false)
    private boolean esPlaneado; //para identificar gastos planificados vs impulsivos, en front:puede mostrarse como insight tipo:"El 30% de tus gastos son impulsivos, considera planificar más tus compras"
    
   

    @ManyToOne
    @JoinColumn(name="fk_usuario", referencedColumnName = "id")
    private Usuario usuario;

    @OneToMany(mappedBy = "gasto")
    private List<Categoria> categorias;

    @OneToMany(mappedBy = "gasto")
    private List<Comercio> comercios;

    @OneToMany(mappedBy = "gasto")
    private List<MedioPago> medioPagos;

    public Gasto() {}

    public Integer getId() {return id;}
    public String getDescripcion() {return descripcion;}
    public LocalDate getFecha() {return fecha;}
    public Double getValor() {return valor;}
    public String getIcono() {return icono;}
    public String getEmocion() {return emocion;}
    public boolean isEsRecurrente() {return esRecurrente;}
    public Integer getNivelNecesidad() {return nivelNecesidad;}
    public Integer getSatisfaccion() {return satisfaccion;}
    public boolean isEsPlaneado() {return esPlaneado;}


    public void setId(Integer id) {this.id = id;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public void setFecha(LocalDate fecha) {this.fecha = fecha;}
    public void setValor(Double valor) {this.valor = valor;}
    public void setIcono(String icono) {this.icono = icono;}
    public void setEmocion(String emocion) {this.emocion = emocion;}
    public void setEsRecurrente(boolean esRecurrente) {this.esRecurrente = esRecurrente;}
    public void setNivelNecesidad(Integer nivelNecesidad) {this.nivelNecesidad = nivelNecesidad;}
    public void setSatisfaccion(Integer satisfaccion) {this.satisfaccion = satisfaccion;}
    public void setEsPlaneado(boolean esPlaneado) {this.esPlaneado = esPlaneado;}

    public Usuario getUsuario() {return usuario;}
    public List<Categoria> getCategorias() {return categorias;}
    public List<Comercio> getComercios() {return comercios;}
    public List<MedioPago> getMedioPagos() {return medioPagos;}

    public void setUsuario(Usuario usuario) {this.usuario = usuario;}
    public void setCategorias(List<Categoria> categorias) {this.categorias = categorias;}
    public void setComercios(List<Comercio> comercios) {this.comercios = comercios;}
    public void setMedioPagos(List<MedioPago> medioPagos) {this.medioPagos = medioPagos;}

}
