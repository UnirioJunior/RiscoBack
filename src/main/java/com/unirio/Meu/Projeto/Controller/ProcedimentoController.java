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

import com.unirio.Meu.Projeto.Entities.ProcedimentoEntities;
import com.unirio.Meu.Projeto.Service.ProcedimentoService;

@RestController
@RequestMapping(value = "/procedimento")
@CrossOrigin
public class ProcedimentoController {
	
	
	@Autowired
	private ProcedimentoService procedimentoService;
	
	@GetMapping
	public List<ProcedimentoEntities> listarTodos() {
		return procedimentoService.listarTodos();
	}

	@PostMapping
	public void  inserir(@RequestBody ProcedimentoEntities procedimento) {
		procedimentoService.inserir(procedimento);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id){
		procedimentoService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
