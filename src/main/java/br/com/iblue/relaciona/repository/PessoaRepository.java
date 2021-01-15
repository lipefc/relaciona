package br.com.iblue.relaciona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.iblue.relaciona.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}