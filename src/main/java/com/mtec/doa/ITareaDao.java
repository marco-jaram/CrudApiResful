package com.mtec.doa;

import org.springframework.data.repository.CrudRepository;

import com.mtec.model.Tarea;

public interface ITareaDao extends CrudRepository<Tarea, Integer> {

}
