package br.com.novosares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.novosares.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}