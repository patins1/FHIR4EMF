package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.TheadType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "TheadTypeRefElement")
public class TheadTypeRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	
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
	public TheadType createInstance() {
		return XhtmlFactory.eINSTANCE.createTheadType();
	}
	
	public static TheadTypeRef valueOf(String id) {
		TheadTypeRef result = new TheadTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}