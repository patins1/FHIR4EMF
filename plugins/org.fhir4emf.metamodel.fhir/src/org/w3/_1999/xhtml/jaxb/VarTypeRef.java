package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.VarType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "VarTypeRefElement")
public class VarTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public VarType createInstance() {
		return XhtmlFactory.eINSTANCE.createVarType();
	}
	
	public static VarTypeRef valueOf(String id) {
		VarTypeRef result = new VarTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}