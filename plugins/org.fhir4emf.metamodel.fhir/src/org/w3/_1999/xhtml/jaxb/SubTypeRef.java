package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.SubType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "SubTypeRefElement")
public class SubTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public SubType createInstance() {
		return XhtmlFactory.eINSTANCE.createSubType();
	}
	
	public static SubTypeRef valueOf(String id) {
		SubTypeRef result = new SubTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}