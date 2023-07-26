package com.br.academiccrud;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@GetMapping
	public Aluno getInfo(){
		Aluno aluno = new Aluno(matricula: 1L, nome: "Thiago Silva", telefone: "8977-5547", email: "thiagosilva@gmail.com", Instant.now());	
		return aluno;
	}
}
