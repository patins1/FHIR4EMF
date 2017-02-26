package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.H4Type;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "H4TypeRefElement")
public class H4TypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public H4Type createInstance() {
		return XhtmlFactory.eINSTANCE.createH4Type();
	}
	
	public static H4TypeRef valueOf(String id) {
		H4TypeRef result = new H4TypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}