package com.example.Antvengers.modelos;

import java.time.LocalDate;
import java.util.List;

import com.example.Antvengers.modelos.utils.Genero;
import com.example.Antvengers.modelos.utils.TipoDocumento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")

public class Usuario {

    //id,nombres,tipodoc,documento,edad
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Integer id;

    @Column(name= "NombreCompleto", nullable = false, unique = false, length = 50)
    private String nombres;

    @Column(name="TipoDocumento", nullable = false, unique = false)
    @Enumerated(EnumType.STRING)
    private TipoDocumento tipodoc;

    @Column(name="NumDocumento", nullable = false, unique = true, length = 15)
    private String documento;

    @Column(name="Edad", nullable = true, unique = false)
    private int edad;

    @Column(name="Genero", nullable = false, unique = false)
    @Enumerated(EnumType.STRING)
    private Genero genero;

    @Column(name="Email", nullable = false, unique = true, length = 20)
    private String correo;

    @Column(name="UserName", nullable = false, unique = true, length = 18)
    private String username;

    @Column(name = "Password", nullable = false, unique = false, length = 20)
    private String password;

    @Column(name = "Rol", nullable = false, unique = false, length = 20)
    private String rol;

    @Column(name ="FechaRegistro", nullable = false, unique = false)
    private LocalDate fechaRegistro;

    @OneToMany(mappedBy = "usuario")
    private List<Gasto> gastos;
    
    public Usuario(Integer id, String nombres, TipoDocumento tipodoc, String documento, int edad, Genero genero, String correo,
            String username, String password, String rol, LocalDate fechaRegistro) {
        this.id = id;
        this.nombres = nombres;
        this.tipodoc = tipodoc;
        this.documento = documento;
        this.edad = edad;
        this.genero = genero;
        this.correo = correo;
        this.username = username;
        this.password = password;
        this.rol = rol;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getId() {return id;}
    public String getNombres() {return nombres;}
    public TipoDocumento getTipodoc() {return tipodoc;}
    public String getDocumento() {return documento;}
    public int getEdad() {return edad;}
    public Genero getGenero() {return genero;}
    public String getCorreo() {return correo;}
    public String getUsername() {return username;}
    public String getPassword() {return password;}
    public String getRol() {return rol;}
    public LocalDate getFechaRegistro() {return fechaRegistro;}

    public void setId(Integer id) {this.id = id;}
    public void setNombres(String nombres) {this.nombres = nombres;}
    public void setTipodoc(TipoDocumento tipodoc) {this.tipodoc = tipodoc;}
    public void setDocumento(String documento) {this.documento = documento;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setGenero(Genero genero) {this.genero = genero;}
    public void setCorreo(String correo) {this.correo = correo;}
    public void setUsername(String username) {this.username = username;}
    public void setPassword(String password) {this.password = password;}
    public void setRol(String rol) {this.rol = rol;}
    public void setFechaRegistro(LocalDate fechaRegistro) {this.fechaRegistro = fechaRegistro;}
    public List<Gasto> getGastos() {return gastos;}
    public void setGastos(List<Gasto> gastos) {this.gastos = gastos;}

}
