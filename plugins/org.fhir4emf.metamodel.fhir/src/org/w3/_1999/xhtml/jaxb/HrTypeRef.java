package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.HrType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "HrTypeRefElement")
public class HrTypeRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	
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
	public HrType createInstance() {
		return XhtmlFactory.eINSTANCE.createHrType();
	}
	
	public static HrTypeRef valueOf(String id) {
		HrTypeRef result = new HrTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}