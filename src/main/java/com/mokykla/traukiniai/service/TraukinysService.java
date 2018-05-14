package com.mokykla.traukiniai.service;

import com.mokykla.traukiniai.dao.TraukinysDAO;
import com.mokykla.traukiniai.models.Traukinys;
import com.mokykla.traukiniai.models.Vagonas;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TraukinysService {

private final TraukinysDAO traukinysDAO;

    public TraukinysService(TraukinysDAO traukinysDAO) {
        this.traukinysDAO = traukinysDAO;
    }

    @Transactional
    public Iterable<Traukinys> getAll(){
        return traukinysDAO.findAll();
    }

    @Transactional
    public void addTraukinys(Traukinys traukinys){
        traukinysDAO.save(traukinys);
    }

    @Transactional
    public void delTraukinys(Long id){
        traukinysDAO.deleteById(id);
    }

    @Transactional
    public Iterable<Vagonas> getVagonas(Long id) {
        Traukinys traukinys = traukinysDAO.findTraukinysById(id);
        return traukinys.getVagonai();
    }
}
