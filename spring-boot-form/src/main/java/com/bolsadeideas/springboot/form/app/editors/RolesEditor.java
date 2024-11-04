package com.bolsadeideas.springboot.form.app.editors;

import java.beans.PropertyEditorSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bolsadeideas.springboot.form.app.services.RoleService;
@Component
public class RolesEditor extends PropertyEditorSupport{
	
	private static final Logger LOG = LoggerFactory.getLogger(RolesEditor.class);
	
	@Autowired
	private RoleService service;

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		LOG.info("Editor para roles text {}",text);
		try {
			Integer id = Integer.parseInt(text);
			setValue(service.obtenerPorId(id));
		}catch (NumberFormatException e) {
			setValue(null);
		}
		
	}
	

}
