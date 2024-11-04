package com.bolsadeideas.springboot.error.app.errors;

public class UsuarioNoEncontradoException extends RuntimeException {

	public UsuarioNoEncontradoException(String id) {
		super("Uduario con id: ".concat(id).concat(" no existe"));
		// TODO Auto-generated constructor stub
	}

}
