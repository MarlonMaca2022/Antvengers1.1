package com.example.Antvengers.modelos;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Comercio {

    private Integer id;


    @ManyToOne
    @JoinColumn(name="fk_gasto", referencedColumnName = "id")
    private Gasto gasto;


    public Integer getId() {return id;}

    

}
