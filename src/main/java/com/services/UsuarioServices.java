/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.services;

import com.models.usuario;
import com.repository.UsuarioRepo;
import exception.UserNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mx
 */
@Service
@Transactional
public class UsuarioServices {
    private final UsuarioRepo usuariorepo;
    @Autowired
    public UsuarioServices (UsuarioRepo usu){
        this.usuariorepo = usu;
    }
    public usuario addUsuario(usuario edu){
        return usuariorepo.save(edu);
    
    }
    public List<usuario> buscarUsuario(){
    
        return usuariorepo.findAll();
    
    }
    
    public usuario editarUsuario(usuario edu){
        return usuariorepo.save(edu);
    }
    public void borrarUsuario(Long  id){
        usuariorepo.deleteById(id);
    
    }
    public usuario buscarUsuarioPorId(Long id){
        return usuariorepo.findById(id).orElseThrow(() ->new UserNotFoundException("usuario no encontrado"));
    
    
    }
}
