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

import com.unirio.Meu.Projeto.Entities.ClassificacaoRiscoEntities;
import com.unirio.Meu.Projeto.Service.ClassificacaoRiscoService;

@RestController
@RequestMapping(value = "/classificacao")
@CrossOrigin
public class ClassificacaoRiscoController {
	
	@Autowired
	private ClassificacaoRiscoService classificacaoService;
	
	@GetMapping
	public List<ClassificacaoRiscoEntities> listarTodos() {
		return classificacaoService.listarTodos();
	}

	@PostMapping
	public void  inserir(@RequestBody ClassificacaoRiscoEntities javo) {
		classificacaoService.inserir(javo);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id){
		classificacaoService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
