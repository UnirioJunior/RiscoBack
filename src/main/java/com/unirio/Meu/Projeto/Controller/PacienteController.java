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

import com.unirio.Meu.Projeto.Entities.PacienteEntities;
import com.unirio.Meu.Projeto.Service.PacienteService;

@RestController
@RequestMapping(value = "/paciente")
@CrossOrigin
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping
	public List<PacienteEntities> listarTodos() {
		return pacienteService.listarTodos();
	}

	@PostMapping
	public void  inserir(@RequestBody PacienteEntities paciente) {
		pacienteService.inserir(paciente);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id){
		pacienteService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
