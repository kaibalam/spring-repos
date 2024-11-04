package com.bolsadeideas.springboot.error.app.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.error.app.models.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	private List<Usuario> lista;

	public UsuarioServiceImpl() {
		// TODO Auto-generated constructor stub
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1,"Andres","Guzman"));
		this.lista.add(new Usuario(2,"Ricardo","Valenzuela"));
		this.lista.add(new Usuario(3,"Cesia","Ramírez"));
		this.lista.add(new Usuario(4,"Daniela","Valenzuela"));
		this.lista.add(new Usuario(5,"Lemuel","Rivas"));
		this.lista.add(new Usuario(6,"Sarvia","Ramírez"));
		this.lista.add(new Usuario(1,"Zimni","Ramírez"));
		this.lista.add(new Usuario(1,"Yolanda","Carrillo"));
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {
		// TODO Auto-generated method stub
		Usuario usuario = obtenerPorId(id);
		return Optional.ofNullable(usuario);
	}

}
