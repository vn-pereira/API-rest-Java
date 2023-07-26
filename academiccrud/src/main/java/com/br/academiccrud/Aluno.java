package com.br.academiccrud;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor	
@Data
public class Aluno {

	private long matricula;
	private String nome;
	private	String telefone;
	private	String email;
	private Instant dataCadastro;	
	
}
