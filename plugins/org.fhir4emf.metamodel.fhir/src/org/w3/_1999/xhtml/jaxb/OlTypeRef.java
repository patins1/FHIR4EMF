package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.OlType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "OlTypeRefElement")
public class OlTypeRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	
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
	public OlType createInstance() {
		return XhtmlFactory.eINSTANCE.createOlType();
	}
	
	public static OlTypeRef valueOf(String id) {
		OlTypeRef result = new OlTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}