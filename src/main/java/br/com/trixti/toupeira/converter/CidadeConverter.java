package br.com.trixti.toupeira.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.trixti.toupeira.entity.Cidade;

@FacesConverter(forClass = Cidade.class) // ID único para o conversor
public class CidadeConverter implements Converter{

	    @Override
	    public Object getAsObject(FacesContext context, UIComponent component, String value) {
	        // Lógica para converter a String 'value' para um Objeto
	        if(value ==  null || value.isEmpty()) {
	        	return null; // Implemente sua lógica aqui	        	
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
