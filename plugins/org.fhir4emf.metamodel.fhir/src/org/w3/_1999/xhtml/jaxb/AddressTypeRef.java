package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.AddressType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "AddressTypeRefElement")
public class AddressTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public AddressType createInstance() {
		return XhtmlFactory.eINSTANCE.createAddressType();
	}
	
	public static AddressTypeRef valueOf(String id) {
		AddressTypeRef result = new AddressTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}