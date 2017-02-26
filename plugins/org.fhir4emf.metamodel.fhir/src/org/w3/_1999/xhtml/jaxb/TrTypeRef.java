package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.TrType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "TrTypeRefElement")
public class TrTypeRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	
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
	public TrType createInstance() {
		return XhtmlFactory.eINSTANCE.createTrType();
	}
	
	public static TrTypeRef valueOf(String id) {
		TrTypeRef result = new TrTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}