/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.services;

import com.models.educacion;
import com.repository.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

/**
 *
 * @author mx
 */
public class EducacionServices {
    private final EducacionRepo educacionrepo;
    @Autowired
    public EducacionServices (EducacionRepo edu){
        this.educacionrepo = edu;
    }
    public educacion addEducacion(educacion edu){
        return educacionrepo.save(edu);
    
    }
    public List<educacion> buscarEducaciones(){
    
        return educacionrepo.findAll();
    
    }
    
    public educacion editarEducacion(educacion edu){
        return educacionrepo.save(edu);
    }
    public void borrarEducacion(Long  id){
        educacionrepo.deleteById(id);
    
    }
    
}
