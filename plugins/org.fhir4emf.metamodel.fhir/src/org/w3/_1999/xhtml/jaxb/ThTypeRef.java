package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.ThType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "ThTypeRefElement")
public class ThTypeRef extends org.w3._1999.xhtml.jaxb.FlowRef  {

	
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
	public ThType createInstance() {
		return XhtmlFactory.eINSTANCE.createThType();
	}
	
	public static ThTypeRef valueOf(String id) {
		ThTypeRef result = new ThTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}