package br.com.iblue.relaciona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.iblue.relaciona.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
}