package com.bolsadeideas.springboot.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.app.models.entity.Cliente;
@Repository("repositoryCliente")
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
