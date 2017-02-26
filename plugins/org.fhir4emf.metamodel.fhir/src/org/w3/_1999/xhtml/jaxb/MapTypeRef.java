package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.MapType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "MapTypeRefElement")
public class MapTypeRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	
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
	public MapType createInstance() {
		return XhtmlFactory.eINSTANCE.createMapType();
	}
	
	public static MapTypeRef valueOf(String id) {
		MapTypeRef result = new MapTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}