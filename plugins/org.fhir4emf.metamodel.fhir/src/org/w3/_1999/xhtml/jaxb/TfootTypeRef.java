package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.TfootType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "TfootTypeRefElement")
public class TfootTypeRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	
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
	public TfootType createInstance() {
		return XhtmlFactory.eINSTANCE.createTfootType();
	}
	
	public static TfootTypeRef valueOf(String id) {
		TfootTypeRef result = new TfootTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}