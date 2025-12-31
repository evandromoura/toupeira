package br.com.trixti.toupeira.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

@Named
@FacesValidator(value = "numeroValidator", managed = true)
public class NumeroValidator implements Validator {
	
	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String valor = String.valueOf(value);
		String regexSomenteNumeros = "^[0-9]+$";
        if (!valor.matches(regexSomenteNumeros)) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Numero Invalido"));
        }
	}
}