package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.TdType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "TdTypeRefElement")
public class TdTypeRef extends org.w3._1999.xhtml.jaxb.FlowRef  {

	
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
	public TdType createInstance() {
		return XhtmlFactory.eINSTANCE.createTdType();
	}
	
	public static TdTypeRef valueOf(String id) {
		TdTypeRef result = new TdTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}