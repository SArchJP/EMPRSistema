package lt.vtvpmc.ems.pw.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Created by Minde on 2017.03.21.
 */
@FacesValidator("default.BirthDateValidator")
public class BirthDateValidator implements Validator{
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object value) throws ValidatorException {
//        StringBuilder birthDate = new StringBuilder();
        String birthDateValue = value.toString();

        if (birthDateValue==null){
            FacesMessage message = new FacesMessage("Gimimo data privaloma");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
        }
    }
}
