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

import com.unirio.Meu.Projeto.Entities.PreditorRiscoEntitie;
import com.unirio.Meu.Projeto.Service.PreditorRiscoService;

@RestController
@RequestMapping(value = "/preditor")
@CrossOrigin
public class PreditorRiscoController {
	
	
	@Autowired
	private PreditorRiscoService preditorService;
	
	@GetMapping
	public List<PreditorRiscoEntitie> listarTodos() {
		return preditorService.listarTodos();
	}

	@PostMapping
	public void  inserir(@RequestBody PreditorRiscoEntitie javo) {
		preditorService.inserir(javo);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id){
		preditorService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
