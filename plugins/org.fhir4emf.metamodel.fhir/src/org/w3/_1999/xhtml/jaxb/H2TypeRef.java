package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.H2Type;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "H2TypeRefElement")
public class H2TypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public H2Type createInstance() {
		return XhtmlFactory.eINSTANCE.createH2Type();
	}
	
	public static H2TypeRef valueOf(String id) {
		H2TypeRef result = new H2TypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}