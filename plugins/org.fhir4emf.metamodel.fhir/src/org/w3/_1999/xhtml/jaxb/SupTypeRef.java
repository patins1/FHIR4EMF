package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.SupType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "SupTypeRefElement")
public class SupTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public SupType createInstance() {
		return XhtmlFactory.eINSTANCE.createSupType();
	}
	
	public static SupTypeRef valueOf(String id) {
		SupTypeRef result = new SupTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}