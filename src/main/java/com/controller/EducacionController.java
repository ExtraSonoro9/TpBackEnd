/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.models.educacion;

import com.services.EducacionServices;
import java.util.List;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mx
 */
@RestController
@RequestMapping("/educacion")
public class EducacionController {
     private final EducacionServices usuarioservice;
    public EducacionController(EducacionServices usuarioser){
        this.usuarioservice = usuarioser;
       
    }
 
 @PutMapping("/update")
    public ResponseEntity<educacion> editarUsuario(@RequestBody educacion user){
        educacion updateEducacion=usuarioservice.editarEducacion(user);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }
    @GetMapping("/all")
 public ResponseEntity<List<educacion>> obtenerEducacion(){
        List<educacion> user= usuarioservice.buscarEducaciones();
        return new ResponseEntity<>(user, HttpStatus.OK);
}
@PostMapping("/add")
public ResponseEntity<educacion> crearEducacion(@RequestBody educacion edu){
    educacion nuevaEducacion=usuarioservice.addEducacion(edu);
    return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);
}
@DeleteMapping("delte/{id}")
public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
usuarioservice.borrarEducacion(id);
return new ResponseEntity<>(HttpStatus.OK);
}
}
