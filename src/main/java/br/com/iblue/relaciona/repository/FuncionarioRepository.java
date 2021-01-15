package br.com.iblue.relaciona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.iblue.relaciona.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
}