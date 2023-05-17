package com.mtec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtec.doa.ITareaDao;
import com.mtec.model.Tarea;



@Service
public class TareaServiceImplement implements ITareaService{
    

   
	@Autowired
	private ITareaDao tareaDao;

	
//	Methods
	
	@Override
	public List<Tarea> fndAll() {
		return(List<Tarea>) tareaDao.findAll();
	}

	@Override
	public Tarea save(Tarea tarea) {
		return  tareaDao.save(tarea);
	}

	@Override
	public Tarea fingById(Integer id) {
		return tareaDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Integer id) {
		tareaDao.deleteById(id); 
		
	}
	

}
