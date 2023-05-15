/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.models.usuario;
import com.services.UsuarioServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mx
 */


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioServices usuarioservice;
    public UsuarioController(UsuarioServices usuarioser){
        this.usuarioservice = usuarioser;
       
    }
 @GetMapping("/id/{id}")
 public ResponseEntity<usuario> obtenerUsuario(@PathVariable("id") Long id){
        usuario user=usuarioservice.buscarUsuarioPorId(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
}
 @PutMapping("/update")
    public ResponseEntity<usuario> editarUsuario(@RequestBody usuario user){
        usuario updateUsuario=usuarioservice.editarUsuario(user);
        return new ResponseEntity<>(updateUsuario,HttpStatus.OK);
    }}