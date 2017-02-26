package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.StrongType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "StrongTypeRefElement")
public class StrongTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public StrongType createInstance() {
		return XhtmlFactory.eINSTANCE.createStrongType();
	}
	
	public static StrongTypeRef valueOf(String id) {
		StrongTypeRef result = new StrongTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}