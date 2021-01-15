package br.com.iblue.relaciona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.iblue.relaciona.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
}