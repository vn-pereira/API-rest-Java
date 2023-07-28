package com.br.academiccrud;

import java.time.Instant;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoRepositorio alunoRepositorio;
	
	@GetMapping
	public <List>Aluno listar(){
		return (Aluno) alunoRepositorio.findAll();
	}
	
	@PostMapping
	public void incluir (@RequestBody Aluno aluno) {
		alunoRepositorio.save(aluno);
	}
	
	@PutMapping
	public void alterar(@RequestBody Aluno aluno) {
		alunoRepositorio.save(aluno);
	}
	
	@DeleteMapping("/{matricula}")
	public void deletar(@PathVariable Long matricula) {
		alunoRepositorio.deleteById(matricula);
	}
	
	@GetMapping("/{matricula}")
	public Optional<Aluno> ler(@PathVariable Long matricula){
		return alunoRepositorio.findById(matricula);
	}
}
