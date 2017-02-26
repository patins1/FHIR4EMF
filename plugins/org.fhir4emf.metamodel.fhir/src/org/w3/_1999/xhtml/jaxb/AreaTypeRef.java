package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.AreaType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "AreaTypeRefElement")
public class AreaTypeRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	
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
	public AreaType createInstance() {
		return XhtmlFactory.eINSTANCE.createAreaType();
	}
	
	public static AreaTypeRef valueOf(String id) {
		AreaTypeRef result = new AreaTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}