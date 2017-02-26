package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.H5Type;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "H5TypeRefElement")
public class H5TypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public H5Type createInstance() {
		return XhtmlFactory.eINSTANCE.createH5Type();
	}
	
	public static H5TypeRef valueOf(String id) {
		H5TypeRef result = new H5TypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}