package com.br.academiccrud;

import org.springframework.data.jpa.repository.JpaRepository;

//Acesso basico ao BD
public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {

}
