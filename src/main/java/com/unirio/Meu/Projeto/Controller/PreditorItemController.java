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

import com.unirio.Meu.Projeto.Entities.PreditorItemEntities;
import com.unirio.Meu.Projeto.Service.PreditorItemService;

@RestController
@RequestMapping(value = "/preditor_item")
@CrossOrigin
public class PreditorItemController {
	
	
	@Autowired
	private PreditorItemService preditorItemService;
	
	@GetMapping
	public List<PreditorItemEntities> listarTodos() {
		return preditorItemService.listarTodos();
	}

	@PostMapping
	public void  inserir(@RequestBody PreditorItemEntities javo) {
		preditorItemService.inserir(javo);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id){
		preditorItemService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
