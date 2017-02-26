package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.AType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "ATypeRefElement")
public class ATypeRef extends org.w3._1999.xhtml.jaxb.AContentRef  {

	
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
	public AType createInstance() {
		return XhtmlFactory.eINSTANCE.createAType();
	}
	
	public static ATypeRef valueOf(String id) {
		ATypeRef result = new ATypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}