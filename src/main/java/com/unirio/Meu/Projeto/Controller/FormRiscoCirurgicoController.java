package com.unirio.Meu.Projeto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unirio.Meu.Projeto.Entities.FormRiscoCirurgicoEntities;
import com.unirio.Meu.Projeto.Entities.JuntaTudo;
import com.unirio.Meu.Projeto.Service.FormRiscoCirurgicoService;

@RestController
@RequestMapping(value = "/atendimento")
@CrossOrigin
public class FormRiscoCirurgicoController {
    
    @Autowired
    private FormRiscoCirurgicoService formService;
    
    @GetMapping
    public List<FormRiscoCirurgicoEntities> listarTodos() {
        return formService.listarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody JuntaTudo form) {
        System.out.println("Recebido: " + form.toString());
        formService.inserir(form);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluir(@PathVariable("id") Long id) {
        formService.excluir(id);
        return ResponseEntity.ok().build();
    }

    // Novo endpoint para buscar dados completos pelo ID do formulário
    @GetMapping("/{id}")
    public ResponseEntity<JuntaTudo> buscarPorId(@PathVariable("id") Long id) {
        try {
            JuntaTudo resultado = formService.buscarId(id);
            return ResponseEntity.ok(resultado);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}

