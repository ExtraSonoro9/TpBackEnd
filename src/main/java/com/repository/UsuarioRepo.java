/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.repository;

import com.models.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author mx
 */
public interface UsuarioRepo extends JpaRepository<usuario, Long>{
    
}

