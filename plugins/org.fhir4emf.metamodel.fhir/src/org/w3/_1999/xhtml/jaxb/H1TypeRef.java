package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.H1Type;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "H1TypeRefElement")
public class H1TypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public H1Type createInstance() {
		return XhtmlFactory.eINSTANCE.createH1Type();
	}
	
	public static H1TypeRef valueOf(String id) {
		H1TypeRef result = new H1TypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}