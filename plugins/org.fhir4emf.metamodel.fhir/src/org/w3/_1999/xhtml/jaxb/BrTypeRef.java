package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.BrType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "BrTypeRefElement")
public class BrTypeRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	
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
	public BrType createInstance() {
		return XhtmlFactory.eINSTANCE.createBrType();
	}
	
	public static BrTypeRef valueOf(String id) {
		BrTypeRef result = new BrTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}