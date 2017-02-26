package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.SampType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "SampTypeRefElement")
public class SampTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public SampType createInstance() {
		return XhtmlFactory.eINSTANCE.createSampType();
	}
	
	public static SampTypeRef valueOf(String id) {
		SampTypeRef result = new SampTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}