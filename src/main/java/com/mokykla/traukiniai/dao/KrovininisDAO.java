package com.mokykla.traukiniai.dao;

import com.mokykla.traukiniai.models.Krovininis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KrovininisDAO extends CrudRepository <Krovininis, Long>{

}
