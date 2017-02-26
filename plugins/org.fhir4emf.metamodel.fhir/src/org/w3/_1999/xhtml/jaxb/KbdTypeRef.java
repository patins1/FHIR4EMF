package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.KbdType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "KbdTypeRefElement")
public class KbdTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public KbdType createInstance() {
		return XhtmlFactory.eINSTANCE.createKbdType();
	}
	
	public static KbdTypeRef valueOf(String id) {
		KbdTypeRef result = new KbdTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}