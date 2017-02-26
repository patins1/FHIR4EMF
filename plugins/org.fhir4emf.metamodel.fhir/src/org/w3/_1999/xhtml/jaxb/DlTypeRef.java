package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.DlType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "DlTypeRefElement")
public class DlTypeRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	
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
	public DlType createInstance() {
		return XhtmlFactory.eINSTANCE.createDlType();
	}
	
	public static DlTypeRef valueOf(String id) {
		DlTypeRef result = new DlTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}