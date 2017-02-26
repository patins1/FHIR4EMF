package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.TbodyType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "TbodyTypeRefElement")
public class TbodyTypeRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	
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
	public TbodyType createInstance() {
		return XhtmlFactory.eINSTANCE.createTbodyType();
	}
	
	public static TbodyTypeRef valueOf(String id) {
		TbodyTypeRef result = new TbodyTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}