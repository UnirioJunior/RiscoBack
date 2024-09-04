package com.unirio.Meu.Projeto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unirio.Meu.Projeto.Entities.ModeloEntities;
import com.unirio.Meu.Projeto.Service.ModeloService;

@RestController
@RequestMapping(value = "/modelo")
@CrossOrigin
public class ModeloController {
	
	@Autowired
	private ModeloService modeloService;
	
	@GetMapping
	public List<ModeloEntities> listarTodos() {
		return modeloService.listarTodos();
	}

	@PostMapping
	public void inserir(@RequestBody ModeloEntities javo) {
	    modeloService.inserir(javo);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id){
		modeloService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
