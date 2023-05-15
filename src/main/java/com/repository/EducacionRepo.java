/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.repository;

/**
 *
 * @author mx
 */
import com.models.educacion;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EducacionRepo extends JpaRepository<educacion, Long>{
    
}
