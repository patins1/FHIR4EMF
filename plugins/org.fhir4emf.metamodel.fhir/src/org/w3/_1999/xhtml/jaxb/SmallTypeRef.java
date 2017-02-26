package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.SmallType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "SmallTypeRefElement")
public class SmallTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public SmallType createInstance() {
		return XhtmlFactory.eINSTANCE.createSmallType();
	}
	
	public static SmallTypeRef valueOf(String id) {
		SmallTypeRef result = new SmallTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}