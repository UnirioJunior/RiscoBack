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

import com.unirio.Meu.Projeto.Entities.LicencaEntities;
import com.unirio.Meu.Projeto.Service.LicencaService;

@RestController
@RequestMapping(value = "/licenca")
@CrossOrigin
public class LicencaController {
	
	@Autowired
	private LicencaService licencaService;
	
	@GetMapping
	public List<LicencaEntities> listarTodos() {
		return licencaService.listarTodos();
	}

	@PostMapping
	public void  inserir(@RequestBody LicencaEntities licenca) {
		licencaService.inserir(licenca);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id){
		licencaService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
