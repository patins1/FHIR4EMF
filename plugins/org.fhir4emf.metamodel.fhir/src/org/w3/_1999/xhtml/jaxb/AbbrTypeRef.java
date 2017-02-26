package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.AbbrType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "AbbrTypeRefElement")
public class AbbrTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public AbbrType createInstance() {
		return XhtmlFactory.eINSTANCE.createAbbrType();
	}
	
	public static AbbrTypeRef valueOf(String id) {
		AbbrTypeRef result = new AbbrTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}