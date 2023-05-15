/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;


import javax.persistence.Id;

/**
 *
 * @author mx
 */
@Entity
public class experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String tituloExp;
    private int fechaExp;
    private String descExp;
    private String imagenExp;

    public experiencia() {
    }

    public experiencia(Long idExp, String tituloExp, int fechaExp, String descExp, String imagenExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaExp = fechaExp;
        this.descExp = descExp;
        this.imagenExp = imagenExp;
    }

  
 
    
    
    
}
