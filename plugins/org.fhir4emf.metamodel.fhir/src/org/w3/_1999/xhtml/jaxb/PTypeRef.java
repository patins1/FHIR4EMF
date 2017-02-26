package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.PType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "PTypeRefElement")
public class PTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public PType createInstance() {
		return XhtmlFactory.eINSTANCE.createPType();
	}
	
	public static PTypeRef valueOf(String id) {
		PTypeRef result = new PTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}