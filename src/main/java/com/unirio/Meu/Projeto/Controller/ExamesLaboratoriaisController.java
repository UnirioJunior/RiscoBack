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

import com.unirio.Meu.Projeto.Entities.ExamesLaboratoriaisEntities;
import com.unirio.Meu.Projeto.Service.ExamesLaboratoriaisService;

@RestController
@RequestMapping(value = "/exames")
@CrossOrigin
public class ExamesLaboratoriaisController {
	
	
	@Autowired
	private ExamesLaboratoriaisService examesService;
	
	@GetMapping
	public List<ExamesLaboratoriaisEntities> listarTodos() {
		return examesService.listarTodos();
	}

	@PostMapping
	public void  inserir(@RequestBody ExamesLaboratoriaisEntities javo) {
		examesService.inserir(javo);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id){
		examesService.excluir(id);
		return ResponseEntity.ok().build();
	}
}