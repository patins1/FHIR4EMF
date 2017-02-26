package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.DivType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "DivTypeRefElement")
public class DivTypeRef extends org.w3._1999.xhtml.jaxb.FlowRef  {

	
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
	public DivType createInstance() {
		return XhtmlFactory.eINSTANCE.createDivType();
	}
	
	public static DivTypeRef valueOf(String id) {
		DivTypeRef result = new DivTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}