package com.bolsadeideas.springboot.form.app.editors;

import java.beans.PropertyEditorSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bolsadeideas.springboot.form.app.services.PaisService;

@Component
public class PaisPropertyEditor extends PropertyEditorSupport {
	
	private static final Logger LOG = LoggerFactory.getLogger(PaisPropertyEditor.class);
	@Autowired
	private PaisService service;

	@Override
	public void setAsText(String idString) throws IllegalArgumentException {
		LOG.info("pais property editor: {}",idString);
		if (idString != null && idString.length() > 0) {
			try {
				Integer id = Integer.parseInt(idString);
				this.setValue(service.obenterPorId(id));
			} catch (NumberFormatException e) {
				setValue(null);
			}
		} else {
			setValue(null);
		}
	}

}
