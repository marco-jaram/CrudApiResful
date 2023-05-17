package com.mtec.service;

import java.util.List;

import com.mtec.model.Tarea;

public interface ITareaService {
	public List<Tarea> fndAll();

	public Tarea save(Tarea tarea);

	public Tarea fingById(Integer id);

	 public void delete (Integer id);
}
