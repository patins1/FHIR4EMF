package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.DtType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "DtTypeRefElement")
public class DtTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public DtType createInstance() {
		return XhtmlFactory.eINSTANCE.createDtType();
	}
	
	public static DtTypeRef valueOf(String id) {
		DtTypeRef result = new DtTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}