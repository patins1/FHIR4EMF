package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.PreType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "PreTypeRefElement")
public class PreTypeRef extends org.w3._1999.xhtml.jaxb.PreContentRef  {

	
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
	public PreType createInstance() {
		return XhtmlFactory.eINSTANCE.createPreType();
	}
	
	public static PreTypeRef valueOf(String id) {
		PreTypeRef result = new PreTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}