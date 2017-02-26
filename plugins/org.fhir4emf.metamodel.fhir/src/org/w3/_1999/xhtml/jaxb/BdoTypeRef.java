package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.BdoType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "BdoTypeRefElement")
public class BdoTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public BdoType createInstance() {
		return XhtmlFactory.eINSTANCE.createBdoType();
	}
	
	public static BdoTypeRef valueOf(String id) {
		BdoTypeRef result = new BdoTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}