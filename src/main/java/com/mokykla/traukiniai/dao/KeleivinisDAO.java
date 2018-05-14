package com.mokykla.traukiniai.dao;

import com.mokykla.traukiniai.models.Keleivinis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeleivinisDAO extends CrudRepository <Keleivinis, Long>{

}
