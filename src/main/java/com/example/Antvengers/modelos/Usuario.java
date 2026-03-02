package com.example.Antvengers.modelos;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")

public class Usuario {

    //id,nombres,tipodoc,documento,edad
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )

    private Integer id;
    private String nombres;
    private String tipodoc;
    private String documento;
    private int edad;
    private String genero;
    private String correo;
    private String username;
    private String password;
    private LocalDate fechaRegistro;
    
    public Usuario(Integer id, String nombres, String tipodoc, String documento, int edad, String genero, String correo,
            String username, String password, LocalDate fechaRegistro) {
        this.id = id;
        this.nombres = nombres;
        this.tipodoc = tipodoc;
        this.documento = documento;
        this.edad = edad;
        this.genero = genero;
        this.correo = correo;
        this.username = username;
        this.password = password;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getId() {return id;}
    public String getNombres() {return nombres;}
    public String getTipodoc() {return tipodoc;}
    public String getDocumento() {return documento;}
    public int getEdad() {return edad;}
    public String getGenero() {return genero;}
    public String getCorreo() {return correo;}
    public String getUsername() {return username;}
    public String getPassword() {return password;}
    public LocalDate getFechaRegistro() {return fechaRegistro;}

    public void setId(Integer id) {this.id = id;}
    public void setNombres(String nombres) {this.nombres = nombres;}
    public void setTipodoc(String tipodoc) {this.tipodoc = tipodoc;}
    public void setDocumento(String documento) {this.documento = documento;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setGenero(String genero) {this.genero = genero;}
    public void setCorreo(String correo) {this.correo = correo;}
    public void setUsername(String username) {this.username = username;}
    public void setPassword(String password) {this.password = password;}
    public void setFechaRegistro(LocalDate fechaRegistro) {this.fechaRegistro = fechaRegistro;}

}
