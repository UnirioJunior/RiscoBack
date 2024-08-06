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

import com.unirio.Meu.Projeto.Entities.ProcedimentoRiscoEntities;
import com.unirio.Meu.Projeto.Service.ProcedimentoRiscoService;

@RestController
@RequestMapping(value = "/risco")
@CrossOrigin
public class ProcedimentoRiscoController {
	
	
	@Autowired
	private ProcedimentoRiscoService riscoService;
	
	@GetMapping
	public List<ProcedimentoRiscoEntities> listarTodos() {
		return riscoService.listarTodos();
	}

	@PostMapping
	public void  inserir(@RequestBody ProcedimentoRiscoEntities javo) {
		riscoService.inserir(javo);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id){
		riscoService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
