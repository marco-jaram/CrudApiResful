package com.mtec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtec.model.Tarea;
import com.mtec.service.ITareaService;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/api")
public class TareaController {
@Autowired
	private ITareaService tareaService;

	@GetMapping("/tareas")
	public List<Tarea> listar(){
		return tareaService.fndAll();
	}
	@PostMapping
	public Tarea guardar(@RequestBody Tarea tarea) {
		return tareaService.save(tarea);
	}
	
	@GetMapping("/tareas/{id}")
	public Tarea getTarea(@PathVariable Integer id) {
		return tareaService.fingById(id);
	}
	@PutMapping
	public Tarea modificar(@RequestBody Tarea tarea, @PathVariable Integer id) {
		Tarea tareaActual = tareaService.fingById(id);
		tareaActual.setTarea(tarea.getTarea());
		tareaActual.setFinalizado(tarea.getFinalizado());
		return tareaService.save(tareaActual);
	}
}
