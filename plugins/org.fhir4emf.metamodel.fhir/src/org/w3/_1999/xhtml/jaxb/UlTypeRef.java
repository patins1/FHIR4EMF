package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.UlType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "UlTypeRefElement")
public class UlTypeRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	
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
	public UlType createInstance() {
		return XhtmlFactory.eINSTANCE.createUlType();
	}
	
	public static UlTypeRef valueOf(String id) {
		UlTypeRef result = new UlTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}