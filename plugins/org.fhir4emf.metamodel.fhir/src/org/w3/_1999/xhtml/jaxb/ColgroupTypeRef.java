package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.ColgroupType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "ColgroupTypeRefElement")
public class ColgroupTypeRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	
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
	public ColgroupType createInstance() {
		return XhtmlFactory.eINSTANCE.createColgroupType();
	}
	
	public static ColgroupTypeRef valueOf(String id) {
		ColgroupTypeRef result = new ColgroupTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}