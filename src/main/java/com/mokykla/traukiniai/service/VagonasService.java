package com.mokykla.traukiniai.service;

import com.mokykla.traukiniai.dao.VagonasDAO;
import com.mokykla.traukiniai.models.Vagonas;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VagonasService {

VagonasDAO vagonasDAO;

    public VagonasService(VagonasDAO vagonasDAO) {

        this.vagonasDAO = vagonasDAO;
    }

    @Transactional
    public Iterable<Vagonas> getAll(){
        return vagonasDAO.findAll();
    }

    @Transactional
    public void addVagonas(Vagonas vagonas){
        vagonasDAO.save(vagonas);
    }

    @Transactional
    public void delVagonas(Long id){
        vagonasDAO.deleteById(id);
    }

}
