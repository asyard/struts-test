
package com.asy.test.struts;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.logging.Logger;

public class LoginForm extends org.apache.struts.action.ActionForm {

    private static final Logger logger = Logger.getLogger(LoginForm.class.getName());
    
    private String userName;
    private String password;

    public LoginForm() {
        super();
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (userName == null || userName.length() < 1) {
            errors.add("userName", new ActionMessage("error.userName.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (password == null || password.length() < 1) {
            errors.add("password", new ActionMessage("error.password.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }

    public String getUserName() {
        logger.info("Inside getter "+userName);
        return userName;
    }

    public void setUserName(String userName) {
        logger.info("Inside setter "+userName);
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
