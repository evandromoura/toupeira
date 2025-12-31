package br.com.trixti.toupeira.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

@Named
@FacesValidator(value = "textoValidator", managed = true)
public class TextoValidator implements Validator {
	
	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String valor = (String) value;
		String regexSomenteLetras = "^[a-zA-Z]+$";
        if (!valor.matches(regexSomenteLetras)) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Texto Invalido"));
        }
	}
}