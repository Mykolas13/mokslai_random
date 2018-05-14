package com.mokykla.traukiniai.dao;

import com.mokykla.traukiniai.models.Traukinys;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraukinysDAO extends CrudRepository <Traukinys, Long>{

    Traukinys findTraukinysById(Long id);}
