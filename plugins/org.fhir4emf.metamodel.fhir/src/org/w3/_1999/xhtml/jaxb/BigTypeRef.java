package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.BigType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "BigTypeRefElement")
public class BigTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public BigType createInstance() {
		return XhtmlFactory.eINSTANCE.createBigType();
	}
	
	public static BigTypeRef valueOf(String id) {
		BigTypeRef result = new BigTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}