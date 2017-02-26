package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.ColType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "ColTypeRefElement")
public class ColTypeRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	
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
	public ColType createInstance() {
		return XhtmlFactory.eINSTANCE.createColType();
	}
	
	public static ColTypeRef valueOf(String id) {
		ColTypeRef result = new ColTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}