package br.com.novosares.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.novosares.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	Usuario findByEmail(String email);
}
