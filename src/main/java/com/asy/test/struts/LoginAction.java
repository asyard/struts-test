package com.asy.test.struts;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends org.apache.struts.action.Action {

    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        LoginForm loginForm = (LoginForm) form;
        if (mapping.getParameter().equals("clear")) {
            loginForm.setUserName("");
            loginForm.setPassword("");
            return mapping.findForward(SUCCESS);
        } else {
            if (loginForm.getUserName().equals(loginForm.getPassword())) {
                Thread.sleep(5000);
                return mapping.findForward(SUCCESS);
            } else {
                return mapping.findForward(FAILURE);
            }
        }

    }
}
