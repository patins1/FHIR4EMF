package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.CaptionType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "CaptionTypeRefElement")
public class CaptionTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public CaptionType createInstance() {
		return XhtmlFactory.eINSTANCE.createCaptionType();
	}
	
	public static CaptionTypeRef valueOf(String id) {
		CaptionTypeRef result = new CaptionTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}