package com.mokykla.traukiniai.dao;

import com.mokykla.traukiniai.models.Vagonas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagonasDAO extends CrudRepository <Vagonas, Long>{

}
