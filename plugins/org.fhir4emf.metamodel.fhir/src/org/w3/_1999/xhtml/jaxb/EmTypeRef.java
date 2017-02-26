package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.EmType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "EmTypeRefElement")
public class EmTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public EmType createInstance() {
		return XhtmlFactory.eINSTANCE.createEmType();
	}
	
	public static EmTypeRef valueOf(String id) {
		EmTypeRef result = new EmTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}