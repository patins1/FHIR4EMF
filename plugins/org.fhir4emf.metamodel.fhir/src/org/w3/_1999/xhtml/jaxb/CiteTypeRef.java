package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.CiteType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "CiteTypeRefElement")
public class CiteTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public CiteType createInstance() {
		return XhtmlFactory.eINSTANCE.createCiteType();
	}
	
	public static CiteTypeRef valueOf(String id) {
		CiteTypeRef result = new CiteTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}