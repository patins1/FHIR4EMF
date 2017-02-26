package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.H3Type;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "H3TypeRefElement")
public class H3TypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public H3Type createInstance() {
		return XhtmlFactory.eINSTANCE.createH3Type();
	}
	
	public static H3TypeRef valueOf(String id) {
		H3TypeRef result = new H3TypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}