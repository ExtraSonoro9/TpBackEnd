/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author mx
 */
@Entity
public class usuario implements Serializable{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(nullable = false, updatable = false)
   private Long id;
   private String nombre;
   private String apellido;
   private String titulo;
   private String descripcion;
   private String fotoPerfil;
   
   @OneToMany(fetch = FetchType.LAZY, mappedBy="idEdu")
   private List<educacion> educacionList;

   @OneToMany(fetch = FetchType.LAZY, mappedBy="idSkill")
   private List<skills> skillList;
   
   @OneToMany(fetch = FetchType.LAZY, mappedBy="idExp")
   private List<experiencia> experienciaList;

    public usuario() {
    }

    public usuario(Long id, String nombre, String apellido, String titulo, String descripcion, String fotoPerfil, List<educacion> educacionList, List<skills> skillList, List<experiencia> experienciaList) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fotoPerfil = fotoPerfil;
        this.educacionList = educacionList;
        this.skillList = skillList;
        this.experienciaList = experienciaList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

  

  

   
}
