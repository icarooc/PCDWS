package br.edu.unirn.Utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class MensagensUtils {
	
	public static void addInfo(String msg){
		FacesMessage fm = new FacesMessage(msg);
		FacesContext.getCurrentInstance().addMessage( null, fm);
	}
	
	public static void addError(String msg){
		FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, null);
		FacesContext.getCurrentInstance().addMessage( null, fm);
	}
	
	public static void addFatal(String msg){
		FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_FATAL, "erro", msg);
		FacesContext.getCurrentInstance().addMessage( null, fm);
	}
	
	public static void addWarn(String msg){
		FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, "atenção", msg);
		FacesContext.getCurrentInstance().addMessage( null, fm);
	}

}
