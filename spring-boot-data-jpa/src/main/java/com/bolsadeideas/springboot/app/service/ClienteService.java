package com.bolsadeideas.springboot.app.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

public interface ClienteService {
	
	public List<Cliente> findAll();

	public void save(Cliente cliente);

	public Cliente findOne(Long id);

	public void delete(Long id);
}
