package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.AcronymType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "AcronymTypeRefElement")
public class AcronymTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
	private String id;

	@XmlValue
	@Override
	public String getID() {
		return id;
	}

	@Override
	public void setID(String id) {
		this.id = id;
	}
	

	
	@Override
	public AcronymType createInstance() {
		return XhtmlFactory.eINSTANCE.createAcronymType();
	}
	
	public static AcronymTypeRef valueOf(String id) {
		AcronymTypeRef result = new AcronymTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}