package br.com.trixti.toupeira.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import br.com.trixti.toupeira.entity.Cidade;
import br.com.trixti.toupeira.service.cidade.CidadeService;

@FacesConverter("cidadeConverter") // ID único para o conversor
public class CidadeConverter implements Converter{

	
		private @Inject CidadeService cidadeService;
		
	    @Override
	    public Object getAsObject(FacesContext context, UIComponent component, String value) {
	        
	    	if(value ==  null || value.isEmpty()) {
	        	return null; 
	        }
	    	
	        Cidade cidade = new Cidade();
	        cidade.setNome(value);
	        return cidade;
	    }

	    @Override
	    public String getAsString(FacesContext context, UIComponent component, Object value) {
	        // Lógica para converter o Objeto 'value' para uma String
	        if(value == null) {
	        	return ""; // Implemente sua lógica aqui	        	
	        }
	        Cidade cidade = (Cidade) value;
	        return cidade.getNome();
	    }
	
	
}
