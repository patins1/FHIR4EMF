package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.DfnType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "DfnTypeRefElement")
public class DfnTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public DfnType createInstance() {
		return XhtmlFactory.eINSTANCE.createDfnType();
	}
	
	public static DfnTypeRef valueOf(String id) {
		DfnTypeRef result = new DfnTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}