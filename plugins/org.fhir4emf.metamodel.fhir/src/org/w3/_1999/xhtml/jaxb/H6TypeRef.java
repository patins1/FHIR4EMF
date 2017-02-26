package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.H6Type;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "H6TypeRefElement")
public class H6TypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public H6Type createInstance() {
		return XhtmlFactory.eINSTANCE.createH6Type();
	}
	
	public static H6TypeRef valueOf(String id) {
		H6TypeRef result = new H6TypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}