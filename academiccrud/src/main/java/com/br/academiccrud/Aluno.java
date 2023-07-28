package com.br.academiccrud;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Aluno {

	@Id
	private long matricula;
	private String nome;
	private String telefone;
	private String email;
	private Instant dataCadastro;

}
