package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.DdType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "DdTypeRefElement")
public class DdTypeRef extends org.w3._1999.xhtml.jaxb.FlowRef  {

	
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
	public DdType createInstance() {
		return XhtmlFactory.eINSTANCE.createDdType();
	}
	
	public static DdTypeRef valueOf(String id) {
		DdTypeRef result = new DdTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}